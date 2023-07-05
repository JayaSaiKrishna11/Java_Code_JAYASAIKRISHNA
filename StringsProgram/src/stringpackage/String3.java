// How to reverse the string
package stringpackage;

public class String3 {
	public static void main(String[] args) {
		
		String s1 = "hello";
		StringBuilder s = new StringBuilder("hello");
		System.out.println(s.reverse()); 
		
		char [] arr = s1.toCharArray();
		int size = arr.length;
		char [ ] reverse = new char[size];
		
		int i = 0;
		while(i != size) {
			reverse[size-i-1] = arr[i];
			i++;
			System.out.println(reverse);
		}
	
	}
}
