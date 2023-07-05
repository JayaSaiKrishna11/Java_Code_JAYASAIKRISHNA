package staticpackage;

public class ex9 {

	static {
		
		System.out.println("This is the static usage it executed before the main");
	}
	
	public static void main(String args[]) {
		
		System.out.println("this is the main function");
	}
	
}
