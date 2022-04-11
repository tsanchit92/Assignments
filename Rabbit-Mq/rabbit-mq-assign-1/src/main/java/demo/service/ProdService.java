package demo.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import demo.repository.Repository;

@Service
public class ProdService {
	@Autowired
	private Repository repo;
	
	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	@Value("${inventory.products.exchange}")
	private String exchange;
	
	@Value("${inventory.products.routingkey}")
	private String routingkey;	
	
	public void send() {
		rabbitTemplate.convertAndSend(exchange, routingkey, repo.findByQuantity());
		System.out.println("The inventory that is left less than 10 in inventory are  = " + repo.findByQuantity());
	    
	}

}
