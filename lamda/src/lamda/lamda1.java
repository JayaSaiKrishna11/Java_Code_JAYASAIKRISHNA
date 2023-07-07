package lamda;
//annotation
@FunctionalInterface
interface inter{
	public void printHello();
}
 //class myclass implements inter{

	//@Override
	//public void printHello() {
	//	System.out.println("Hello from the lambda expression");
		
	//}
	
//}
public class lamda1 {

	public static void  main(String args[]) {
	//inter inter = new myclass(); 
	
//	inter.printHello();
		inter inter = ( ) -> System.out.println("hello from the lamda expression");
		inter.printHello();
	}
}
