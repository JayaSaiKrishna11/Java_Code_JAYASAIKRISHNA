package exceptionhandlingpackage;
// To show the advantage of the exception handling
public class EH1 {
	public static void main(String[] args) {
		
		System.out.println("Before an exception");
		try
		{
			int a =23;
			int b = 0;
			int c = a/b;
		}catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("After an exception");
	}
}
