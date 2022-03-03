package Assignment.assign6;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController{
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public ModelAndView getValues() {
	
			ModelAndView mv = new ModelAndView("Customer");
			return mv;
 
		
		
	}
		
		@RequestMapping(value = "/submitregistration", method = RequestMethod.POST)
		public ModelAndView getValues(@Valid @ModelAttribute("c") Customer c, BindingResult br) {
			if(br.hasErrors()) {
				ModelAndView mv = new ModelAndView("Customer");
				return mv;
	    }
			
			ModelAndView mv = new ModelAndView("CustomerSuccess");
			return mv;
		}
	}
