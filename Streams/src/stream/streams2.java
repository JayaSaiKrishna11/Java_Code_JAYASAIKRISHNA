package stream;
import java.util.*;
import java.util.stream.Collectors;
public class streams2 {
	public static void main(String args[]) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		
		marks.add(20);
		marks.add(30);
		marks.add(40);
		marks.add(50);
		marks.add(60);
		System.out.println("The marks of students are: "+marks);
		List<Integer> Upd_marks = marks.stream().map(i -> i+5).collect(Collectors.toList());
		System.out.println("The updated marks of students are: "+Upd_marks);
			long nooffailedstudents = marks.stream().filter(m->m<=35).count();
			System.out.println("The no_of students failed: "+nooffailedstudents);
	}
}
