package assign5;

class Rectangle5 extends Shape5 
{
    @Override
    public String draw() 
    {
    	String s="Drawing Rectangle";
    	return s;
    }
}

class Line5 extends Shape5
{
    @Override
    public String draw() 
    {
    	String h="Drawing  Line";
    	return h;
    }
}

class Cube5 extends Shape5 
{
    @Override
    public String draw() 
    {
    	String k="Drawing  Cube";
    	return k;
    	
    }
}
abstract class Shape5 
{
    abstract public String draw();
}
public class Assignment2Q5
{
    public static void main(String[] args) 
    {
    	Rectangle5 j=new Rectangle5();
    	Line5 k=new Line5();
    	Cube5 l=new Cube5();
    	String d=j.draw();
    	String r=k.draw();
    	String q=l.draw();
    	System.out.println(d);
    	System.out.println(r);
    	System.out.println(q);
    	
    	
    }
}
