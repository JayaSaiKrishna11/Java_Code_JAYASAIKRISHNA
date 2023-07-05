//code for the covariants method overriding

package methodOverrridding;

class A1{
	Object get() {
		return this;
	}
}

class B1 extends A1{
	String get() {
		return "Hello from the covariants";
	}
}
public class methodOR3 {
public static void main(String[] args) {
	
	B1 b = new B1();
	String s = b.get();
	System.out.println(s);
	
	
	
}
}
