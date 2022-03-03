package Assign5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("Assign5.xml");
		Triangle tri = (Triangle) context.getBean("triangle");
		tri.draw();
//		Circle cr=(Circle)context.getBean("circle");
//		cr.draw();
	}

}
