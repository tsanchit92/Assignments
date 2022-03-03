package springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class config 
{
	@Bean("abc")
	public HelloBean hb()
	{
		return  new  HelloBean("Spring");
	}
	
 
}
