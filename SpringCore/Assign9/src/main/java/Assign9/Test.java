package Assign9;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Test implements InitializingBean, DisposableBean {
	
	private String name;
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
   
	
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("init");
		
	}
	
	public void destroy() throws Exception {
		System.out.println("Destroying");
		
	}
	public void disp()
	{
		System.out.println("Program in working condition");
	}
	

}
