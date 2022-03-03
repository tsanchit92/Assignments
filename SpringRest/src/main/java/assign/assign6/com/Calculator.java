package assign.assign6.com;

public class Calculator {
	private int a;
	private int b;
	private double c;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	

	public Calculator(Integer a, Integer b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Calculator() {
		
	}

	public Calculator(Integer a, Integer b, Double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void setB(int b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public Calculator(Double c) {
		super();
		this.c = c;
	}

	public void setC(double c) {
		this.c = c;
	}

}
