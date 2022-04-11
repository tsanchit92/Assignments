package demo.component;

import java.util.List;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import demo.model.Products;

@Component
public class RabbitMQConsumer {
	
	@Bean 
	public MessageConverter jsonMessageConverter(ObjectMapper objectMapper) {
	return new Jackson2JsonMessageConverter(objectMapper);
	}

	
	
	@RabbitListener(queues = "${inventory.products.queue}")
	public void recievedMessage(List<Products> prod) {
		System.out.println("Recieved Message From RabbitMQ: " + prod);
	}
}