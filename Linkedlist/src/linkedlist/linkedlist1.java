package linkedlist;
import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist1 {
	
	public static void main(String args[]) {
		
		LinkedList<String> l = new LinkedList<String>();
		
		l.add("Jai");
		l.add("sai");
		l.add("Krishna");
		l.addFirst("First element");
		l.addLast("Last element");
		
		for(String s: l) {
			System.out.println(s);
		}
		
				
		
	}
	

}
