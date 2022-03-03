package Assignment.assign3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller 
public class UserController {
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public ModelAndView getValues(){	
		System.out.println("print errors");
		ModelAndView mv =new ModelAndView("login");
		System.out.println("print errors");
		return mv;
	}
	
	@RequestMapping(value = "/success", method = RequestMethod.POST) 
	   public ModelAndView showValue(@ModelAttribute("lo") UserModel lo)
	{
			if(lo.getUsername().equals("tsanchit92") && lo.getPassword().equals("Pratibha987"))
			{
				
				ModelAndView mv =new ModelAndView("success");
				System.out.println(lo.getUsername());
				return mv;
				
			}
			
				ModelAndView mv =new ModelAndView("error");
				return mv;
	}
}