package Assignment2;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainquesn
{
	private static ApplicationContext context;

	public static void main(String []args)
	{
		context=new ClassPathXmlApplicationContext("springA2.xml");
		Question q1=(Question)context.getBean("Q1");
		q1.getdetails();
	
		
	}
}
