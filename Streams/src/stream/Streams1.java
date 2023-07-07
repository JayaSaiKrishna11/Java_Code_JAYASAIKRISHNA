package stream;
import java.util.*;
import java.util.stream.Collectors;
public class Streams1 {
	public static void main(String args[]) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(11);
		al.add(12);
		al.add(13);
		System.out.println(al);
		List<Integer> evenlist = al.stream().filter(i-> i%2 ==0).collect(Collectors.toList());
		System.out.println(evenlist);
	}
}
