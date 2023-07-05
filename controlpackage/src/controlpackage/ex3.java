package controlpackage;

import java.util.Scanner;

//program to check a persons eligibility to vote

public class ex3 {
	

		public static void main(String args[]) {
			
			System.out.println("Enter the age : ");
			
			Scanner sc = new Scanner(System.in);
			
			
			int age = sc.nextInt();
			
			
			if(age>18) {
				
				System.out.println("This person is eligible for the voting");
				
			}
			
			System.out.println("This person is not eligible for the voting");
		}
		
	}

	

