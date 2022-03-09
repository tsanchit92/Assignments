package security2.assign1.one;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/")
	public String home() {
		return ("<h1>Welcome Home</h1>");
	}

	@GetMapping("/ADMIN")
	public String admin() {
		return ("<h1>Welcome Home Admin</h1>");
	}

	@GetMapping("/USER")
	public String user() {
		return ("<h1>Welcome Home User</h1>");
	}

}
	