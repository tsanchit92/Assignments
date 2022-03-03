package Assign9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assign9 
{

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        ((AbstractApplicationContext) context).registerShutdownHook();
        Test test = (Test) context.getBean("test");
        test.disp();
	}

}
