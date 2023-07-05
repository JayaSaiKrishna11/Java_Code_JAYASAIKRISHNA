package mapspackage;
import java.util.*;

public class maps2 {
	public static void main(String args[]) {
		
		TreeMap<String, Integer> mt = new TreeMap<String, Integer>();
		
		mt.put("Sam", 12);
		mt.put("jam", 13);
		mt.put("ant", 14);
		mt.put("jai", 15);
		Set set = mt.entrySet();
		
		for(Map.Entry<String, Integer> m1 : mt.entrySet())
		{
			System.out.println(m1.getKey());
			System.out.println(m1.getValue());
		}
		
		
	}
	

}
