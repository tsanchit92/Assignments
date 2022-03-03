package springcore;

public class HelloBean 
{
	private String	name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public HelloBean(String a )
	{
		this.name=a;
		
	}

	public void sayHello()
	{
		System.out.println("Hello"+this.name);
	}

}
