package demo.component;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class RabbitMQConsumer {
	
	@Bean 
	public MessageConverter jsonMessageConverter(ObjectMapper objectMapper) {
	return new Jackson2JsonMessageConverter(objectMapper);
	}

	
	
	@RabbitListener(queues = "${inventory.news.queue}")
	public void recievedMessage(String heading) {
		System.out.println("Recieved Message From RabbitMQ: " + "News Heading");
	}
}