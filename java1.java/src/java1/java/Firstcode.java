package java1.java;

import java.util.Scanner;
// A very basic code to add numbers
public class Firstcode {

	public static void main(String[] args) {
		
		int a = 12;
		int b = 34;
		
		int sum = a+b;
		
		
		System.out.println("The sum of a+b: " +sum);
		
		System.out.println("Enter the two numbers: ");
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		
		int num2 = sc.nextInt();
		
		int numSum = num1 + num2;
		
		System.out.println("The sum of the two numbers: "+" "+numSum);
		
				
				
		
		
	}
	
	
}
