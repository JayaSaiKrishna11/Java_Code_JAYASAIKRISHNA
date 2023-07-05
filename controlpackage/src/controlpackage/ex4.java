package controlpackage;
import java.util.Scanner;
// Program to check the login page of an application
public class ex4 {


		public static void main(String args[]) {
			
			System.out.println("Enter the user and password : ");
			
			Scanner sc = new Scanner(System.in);
			
			String user = sc.nextLine();
			String password = sc.nextLine();
			
			if(user.equals("Jai11")&&(password.equals("123"))) {
				
				System.out.println("Welcome to the portal");
				
			}
			
			System.out.println("Sorry invalid user and password");
		}
		
	}

	
	

