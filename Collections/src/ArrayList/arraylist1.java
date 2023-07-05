package ArrayList;

import java.util.Iterator;
import java.util.ArrayList;

public class arraylist1 {
	public static void main(String args[]) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("John");
		al.add("Jai");
		al.add("Jivan");
		al.add("Krishna");
		System.out.println(al);
		Iterator iter = al.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		for(String s: al) {
			System.out.println(s);
		}
		ArrayList<Integer> al2 = new ArrayList<Integer>();

		al2.add(678);
		al2.add(45);
		al2.add(234);
		al2.add(12);
		System.out.println(al2);
		Iterator iter2 = al2.iterator();

		while (iter2.hasNext()) {
			System.out.println(iter2.next());
		}
		for(Integer i: al2) {
			System.out.println(i);
		}
	}

}
