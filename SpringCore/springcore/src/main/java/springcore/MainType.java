package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainType 
{
private static ApplicationContext context;
	
	public static void main(String	[]args)
	{
		context=new AnnotationConfigApplicationContext(config.class);
		HelloBean hellobean =(HelloBean) context.getBean("abc");
		hellobean.sayHello();
	}

}
