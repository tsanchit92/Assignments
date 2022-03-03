package Assignment.assign1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

	
	@Controller
	public class helloworldcontroller
 {
		@RequestMapping("/helloworld") 
		public ModelAndView test()
		{
			ModelAndView model=new ModelAndView("helloworld");
			return model;
		}
		
}