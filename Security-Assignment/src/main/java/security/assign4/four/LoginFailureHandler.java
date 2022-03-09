package security.assign4.four;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import net.bytebuddy.implementation.bind.annotation.Super;

@Component
public class LoginFailureHandler extends SimpleUrlAuthenticationFailureHandler {

	@Autowired
	ModelService modelService;

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {

		String username = request.getParameter("username");
		Model model = modelService.getUserByName(username);

		if (model != null) {
			if (model.isActive() && model.isAccountNonLocked()) {
				if (model.getFailedAttemp() < 3) {
					modelService.increasefailedAttempt(model);
				} else {
					modelService.lock(model);
					exception = new LockedException("Account is locked due to too many failed attempts");
				}
			}
		} else {
			System.out.println("username does not exists");
		}
		super.setDefaultFailureUrl("/login?error");
        super.onAuthenticationFailure(request, response, exception);


	}

}
