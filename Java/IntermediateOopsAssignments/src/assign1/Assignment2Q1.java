package assign1;


class SingletonInheritanceCheck{ 
	private static SingletonInheritanceCheck i=null;
	int j;
	private SingletonInheritanceCheck()
	{
		j=100;
	}
	public static SingletonInheritanceCheck getInstance()
	{
		if (i == null) 
		{
           i = new SingletonInheritanceCheck(); 
		}
           return i; 
	}
}

public class Assignment2Q1 {
	public static void main(String args[]) 
	{
		SingletonInheritanceCheck s=SingletonInheritanceCheck.getInstance();
			s.j=500;
	System.out.println("Singleton Instance value "+s.j);
	}	
}
