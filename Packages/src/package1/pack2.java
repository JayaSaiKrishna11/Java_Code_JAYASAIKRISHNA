package package1;
import java.util.Scanner;

public class pack2 {
	public static void add() {
	System.out.println("Enter the numbers to add: ");
	
	Scanner sc = new Scanner(System.in);
	
	int  a = sc.nextInt();
	
	int b = sc.nextInt();
	
	int sum = a +b;
	
	System.out.println("Addition : "+sum);
	}
	
}
