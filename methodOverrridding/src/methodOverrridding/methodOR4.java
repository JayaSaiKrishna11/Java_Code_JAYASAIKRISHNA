//using final keyword to prevent the method overriding
package methodOverrridding;
class A2{
	//add final before the public in the next line then it will give the error
	public void display() {
		System.out.println("this is super class");
	}
}

class B2 extends A2{
	public void display() {
		super.display();//this super syntax is used to display the super class also
		System.out.println("this is sub class");
	}
}
public class methodOR4 {
	
	public static void main(String[] args) {
		B2 b = new B2();
		b.display();
		
	}
}
