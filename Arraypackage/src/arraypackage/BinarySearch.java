package arraypackage;

import java.util.*;
public class BinarySearch {
	public static void main(String args[]) {
		
		int arr[] = {12,32,34,45,56,67,78};
		
		int search_num = 56;
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println(arr[i]+" ");
			
		}
		
		int first = 0;
		int last = arr.length - 1;
		int middle = (first+last)/2;
		
		while(first<=last)
		{
			if(arr[middle]<search_num) 
				
				first = middle + 1;
				else if (arr[middle]==search_num) {
					System.out.println("item found at location "+" "+middle+" "+search_num);
					
					System.exit(0);
				}
				else
				{
					last = middle -1;
					
				}
			
		}
		
	}
}
