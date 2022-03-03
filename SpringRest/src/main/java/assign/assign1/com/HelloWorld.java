package assign.assign1.com;



	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class HelloWorld {

		@RequestMapping("/greeting")
		public String getHello() {	
			return "Hello World!";
		}
	}



