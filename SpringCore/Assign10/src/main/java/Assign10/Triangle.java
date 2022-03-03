package Assign10;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component
public class Triangle implements ApplicationContextAware
{
	
	public Side side;
	
	public Side side2;

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.side=applicationContext.getBean(Side.class);
		this.side2=applicationContext.getBean(Side.class);
		
	}
	
	

}
