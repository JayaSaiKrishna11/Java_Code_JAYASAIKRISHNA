package stringpackage;

import java.util.Scanner;

public class string_1 {
	public static void main(String[] args) {
		
		System.out.println("Enter the string to compute its length");
		
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		
		char [ ] arr = s1.toCharArray();
		
		int i =0;
		
		for(char c: arr) {
			i++;
		}
		System.out.println("The length of the string s1: "+i);
		System.out.println("The length of the string s1: "+s1.length());
	}
}
