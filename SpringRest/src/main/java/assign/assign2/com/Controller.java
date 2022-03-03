package assign.assign2.com;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping(method = RequestMethod.POST,value="/login")
	public String login(@RequestBody Person person) 
	{

		
		if (person.getUsername().contentEquals("Sanchit") && person.getPassword().contentEquals("Tripathi"))
		{
			return "valid user";
		}
		return "Invalid user";

	}

}
