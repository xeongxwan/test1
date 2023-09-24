package exam;

public class Test {
	
	String s;
	int a ;
	double b ;
	
	public Test() {}
	
	public Test(String s, int a, double b) {
		this.s = s;
		this.a = a;
		this.b = b;
	}
	
	public void show() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("s = " + s);
	}
	
}
