package compiletimepoly;

public class compiletimepoly1 {

	void test() {
		System.out.println("no param inside");
		
	}
	
	void test(int a) {
		System.out.println("integer value = "+ a);
		
	}
	
	void test(int a, int b) {
		System.out.println("two integers value = "+a+","+b);}
	double test(double a)
	{
		System.out.println("overloading does not depend on return type: "+a);
		return a * a;
	
	}
	
	public static void main(String [] args) {
		compiletimepoly1 c = new compiletimepoly1();
		
		c.test();
		c.test(12);
		c.test(23,45);
		c.test(123245.00);
		
		
	}
	

	
}
