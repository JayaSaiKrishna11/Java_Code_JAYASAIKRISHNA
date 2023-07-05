/*
 //To add the first element and lastelement we can add in anyplace 
  package linkedlist;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;

public class Linkedlist2 {

	public static void main(String args[]) {
		ArrayList <String> al = new ArrayList<String>();
		al.add("bike");
		al.add("car");
		al.add("ship");
		
		LinkedList <String> l1 = new LinkedList<String>();
		l1.addAll(al);
		l1.addFirst("Lorry");
		l1.addLast("plane");//if we want to add at the second position -->l1.add(2,"jeep")
		for(String s: l1) {
			System.out.println(s);
	}
	
		
	}
}*/
 package linkedlist;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;

public class Linkedlist2 {

	public static void main(String args[]) {
		ArrayList <String> al = new ArrayList<String>();
		al.add("bike");
		al.add("car");
		al.add("ship");
		
		LinkedList <String> l1 = new LinkedList<String>();
		l1.addAll(al);
		l1.addFirst("Lorry");
		l1.addLast("plane");
	//	l1.clear();
		for(String s: l1) {
			System.out.println(s);
	}
	}
}
		
	
