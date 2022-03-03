package assign4;

abstract class Abst
{
	int s;
}
abstract class Check extends Abst
{
    abstract public int san();}

class MainClass extends Check
{
	public int san()
	{
		s=50;
		return s;
	}
}
public class Assignment2Q4 {
    public static void main(String[] args) {
    	MainClass a=new MainClass();
    	int b=a.san();
    	System.out.println(b);  	
    }
}
