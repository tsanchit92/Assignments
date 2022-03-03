package assign5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	static MessageSource messageSource;
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Project project = (Project)context.getBean("project");
        project.display();
       
    }
}
