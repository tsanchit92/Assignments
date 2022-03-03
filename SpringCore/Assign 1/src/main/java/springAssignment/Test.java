package springAssignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	private static ApplicationContext context;
	
	public static void main(String []args)
	{
		context=new ClassPathXmlApplicationContext("springAssign.xml");
		Customer c=(Customer)context.getBean("customer");
		c.details();
	}

}
