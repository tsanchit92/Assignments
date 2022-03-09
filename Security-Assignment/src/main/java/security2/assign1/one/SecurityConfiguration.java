package security2.assign1.one;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("sanchit").password("tripathi").roles("ADMIN")
		.and().withUser("user").password("user123").roles("USER");
	}

	@SuppressWarnings("deprecation")
	@Bean
	public PasswordEncoder getpswd() {
		return NoOpPasswordEncoder.getInstance();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
		.antMatchers("/ADMIN").hasRole("ADMIN")
		.antMatchers("/USER").hasAnyRole("ADMIN","USER")
		.antMatchers("/").permitAll()
		.and().formLogin();
	}
}
