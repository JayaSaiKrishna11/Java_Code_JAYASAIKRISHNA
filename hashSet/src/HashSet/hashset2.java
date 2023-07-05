package HashSet;

import java.util.*;
public class hashset2 {
	public static void main(String args[]) {
		HashSet <String> hs = new HashSet<String>();
		
		hs.add("brinjal");
		hs.add("onion");
		hs.add("carrot");
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//Sorting starts first convert to an array list
		ArrayList<String> al = new ArrayList<String>();
		al.addAll(hs);
		//call the sort method of the collections class
		Collections.sort(al);
		
		for(String s : al) {
			System.out.println(al);
			
		}
		//Another way of sorting converting HashSet to TreeSet
		
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.addAll(hs);
		
		Iterator itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
