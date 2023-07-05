package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
class Student{
	
	public  String name;
	public int rollno;
	public int marks;
	public Student(String name, int rollno, int marks) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}
public class arraylist2 {
	public static void main(String args[]) {
		ArrayList<Student> as = new ArrayList<Student>();
		Student s1 = new Student("jai",1,120);
		Student s2 = new Student("sai",2,130);
		Student s3 = new Student("krishna",3,140);
		
		as.add(s1);
		
		as.add(s2);
		
		as.add(s3);
		Iterator it = as.iterator();
		
		while(it.hasNext()) {
			Student s = (Student)it.next();
			System.out.println(s.getName());
			System.out.println(s.getRollno());
			System.out.println(s.getMarks());
			
		}
	}
	
	
}
