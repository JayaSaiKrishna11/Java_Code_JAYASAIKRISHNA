package stringpackage;
//how to copy one string to another string
public class String2 {
	public static void main(String[] args) {
		
		String s1 = "Uplatz";
		
		char [] a = s1.toCharArray();
		
		int size = a.length;
		
		char[] newarr = new char[size];
	
		int i = 0;
		
		while(i != size)
		{
			newarr[i] = a[i];
			i++;
		}
		System.out.println(newarr);
	}
}
