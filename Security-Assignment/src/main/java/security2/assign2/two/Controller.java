package security2.assign2.two;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/hello")
	public String hello()
	{
		return("<h1>Welcome to the site</h1>");
	}
}
