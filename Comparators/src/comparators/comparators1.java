package comparators;
import java.util.*;
import java.util.ArrayList;
//comparable
class Student implements Comparable<Student>{
		public String name;
		public int age;
	public Student(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
	@Override
	public int compareTo(Student o) {
		if(this.age == o.age) {
		return 0;
		}
		else 
			if(this.age> o.age) {
				return 1;
			}
			else
				return -1;
	}
	
}
public class comparators1 {
	public static void main(String args[]) {
		
		
		Student s1 = new Student("jai",23);
		Student s2 = new Student("tia",22);
		Student s3 = new Student("sai",21);
		Student s4 = new Student("john",22);
		ArrayList<Student> al  = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		System.out.println("Before Sorting");
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			Student st = (Student)itr.next();
			
			System.out.println(st.name+" "+st.age);
		}
		Collections.sort(al);
		System.out.println("After Sorting");
		Iterator itr1 = al.iterator();
		while(itr1.hasNext()) {
			Student st1 = (Student)itr1.next();
			System.out.println(st1.name+ " "+ st1.age);
	}
	}
}


