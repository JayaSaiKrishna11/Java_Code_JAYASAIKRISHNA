package HashSet;
import java.util.*;
import java.util.Iterator;

public class hashset1 {
	public static void main(String args[]) {
		
		HashSet<String> fruits = new HashSet<String>();
		
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("grapes");
		fruits.add("orange");
		
		Iterator itr = fruits.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.hasNext());
		}
		
	}
}
