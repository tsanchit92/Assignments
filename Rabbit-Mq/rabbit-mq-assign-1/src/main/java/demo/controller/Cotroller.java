package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.service.ProdService;

@RestController
public class Cotroller {
	
	@Autowired
	public ProdService prodServ;
	 
	@GetMapping("/send")
	public void getprods()
	{
		 prodServ.send();
		 System.out.println(" prepairing to send ");
	}

}
