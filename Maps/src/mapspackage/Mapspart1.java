package mapspackage;
import java.util.*;

public class Mapspart1 {
	public static void main(String args[]) {
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(100, "Jack");
		hmap.put(101, "john");
		hmap.put(102, "wick");
		hmap.put(103, "Jai");
		Set set = hmap.entrySet();
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> me = (Map.Entry<Integer, String>)it.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
		System.out.println("---------------------------------");
		//we can do with the for loop also and the same time we rmoving one element
		hmap.remove(100);
		  for(Map.Entry<Integer,String> me2 : hmap.entrySet())
		  {
			  System.out.println(me2.getKey());
			  System.out.println(me2.getValue());
			  
		  }
		  
		  //for removing the code 
		 // hmap.remove(100);
	}
}
