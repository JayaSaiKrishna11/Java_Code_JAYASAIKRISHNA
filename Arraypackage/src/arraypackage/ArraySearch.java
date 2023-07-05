package arraypackage;

// here we imported the java.util.scanner
import java.util.Scanner;
// linear search
public class ArraySearch {

	public static void main(String args[]) {
		
		System.out.println("Enter the array size: ");
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();// Giving the size of an array
		
		int [] arr = new int[size];//creating an array to store the values
		
		System.out.println("Enter the values: ");//giving the values
		
		for(int i=0; i<size;i++) {//with the help of the for loop we are allocating values in the array
			arr[i] = sc.nextInt();
			
		}
		System.out.println("Enter the element to be searched: ");
		
		int search_num = sc.nextInt();// to search an element we created the search_num
		
		for(int j= 0; j<size; j++) {// so it iterate the loop that we created
			
			
			if(arr[j]==search_num) {
				j=j+1;
				System.out.println("Succesfully searched"+search_num+"found at"+j+"th position");
				
				System.exit(0);
				
			}
		}
		System.out.println("failure number not found");
		
	}
	
	
	
}
