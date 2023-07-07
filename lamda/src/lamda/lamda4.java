package lamda;
import java.util.*;
import java.util.function.Predicate;

public class lamda4 {
	public static void main(String args[]) {
		
		Predicate<Integer> p = I -> I<10;
		
		System.out.println("Is 14 is greater than the 10: "+ p.test(14));
		System.out.println("Is 3 is greater than the 10: "+ p.test(3));
		
		Predicate<Collection> p2 = c -> c.isEmpty();
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		System.out.println("Is the araylist is empty: "+p2.test(al));
		
	}
}
