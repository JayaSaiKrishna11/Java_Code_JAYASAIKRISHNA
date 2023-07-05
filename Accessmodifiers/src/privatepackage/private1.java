package privatepackage;

class one{
	
	private int x;
	
	private void print() {
		System.out.println("Hello");	
	}

}
//even though if we create an object one o = new one, once create as a private then it won't accessabile outside the class
public class private1 {
	public static void main(String [] args) {
		
		one o = new one();
		
		o.x=23;
		
		o.print();
		
		
	}
}
