package Assign10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Assign10 
{
	private ApplicationContext context;
	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(Assign10.class);
		Triangle t=context.getBean(Triangle.class);
		System.out.println(t.side);
		System.out.println(t.side2);
	}

}
