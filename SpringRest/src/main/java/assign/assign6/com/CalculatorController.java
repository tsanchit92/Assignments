package assign.assign6.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

	@PostMapping("/add")
	public int add(@RequestBody Calculator cl)
	{
		return cl.getA()+cl.getB();
	}
	
	@PostMapping("/subtract")
	public int subtract(@RequestBody Calculator cl)
	{
		return cl.getA()-cl.getB();
	}
	
	@PostMapping("/multiply")
	public int multiply(@RequestBody Calculator cl)
	{
		return cl.getA()*cl.getB();
	}
	
	@PostMapping("/divide")
	public int divide(@RequestBody Calculator cl)
	{
		return cl.getA()/cl.getB();
	}
	
	@GetMapping("/root/{c}")
	public double multiply(@PathVariable double c)
	{
		return Math.sqrt(c);
	}
	
}
