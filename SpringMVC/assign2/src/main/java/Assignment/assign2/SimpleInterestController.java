package Assignment.assign2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
class SimpleInterestController
{
	
	

	@RequestMapping(value = "/simp", method = RequestMethod.GET)
	public ModelAndView getsimpleint() 
	{
		ModelAndView model = new ModelAndView("simp");
		return model;
	}
	
	@RequestMapping(value = "/simpresult", method = RequestMethod.POST)
	public ModelAndView result( @ModelAttribute("si") simpleinterest si)
	{
		
		ModelAndView model = new ModelAndView("simpresult");
		return model;
		
	}

}