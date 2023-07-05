package builtinmethodBS;

import java.util.Scanner;
//other than the built in type method of the bubble sort
// this is the main logic

public class bubblesort2 {

	public static void main(String args[])
	{	
		
		System.out.println("Enter the size of an array: ");
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		
		System.out.println("Enter the elements of an array: ");
		
		for(int i=0; i<size; i++) {
			
			arr[i]= sc.nextInt();
		}
		for(int i=0; i<size-1; i++) {
			for(int j=0; j<size-i-1;j++) {
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					
					arr[j] = arr[j+1];
					
					arr[j+1] = temp;
					
				}
				
			}
		}
		System.out.print("Sorted elemets are: ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	
	
}
