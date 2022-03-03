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

	public Calculator(int a, int b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Calculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Calculator() {
		super();
	}

	public void setB(int b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public Calculator(double c) {
		super();
		this.c = c;
	}

	public void setC(double c) {
		this.c = c;
	}

}
