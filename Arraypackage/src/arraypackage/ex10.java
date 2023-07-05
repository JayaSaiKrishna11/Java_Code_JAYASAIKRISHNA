package arraypackage;

class Student{
	//instance variables or class variables
	String name;
	int rollno;
	double marks;
	static String  college = "narayana";
	
	//variables that are declared as an arguements is called local variables
	Student(String name, int rollno, double marks){
		
			this.name = name;
			this.rollno = rollno;
			this.marks = marks;
	}
	


public class ex10 {
	public static void main(String args[]) {
		Student[] str = new Student[2];
		
		str[0] = new Student("jai", 1121, 500);
		
		str[1] = new Student("sai", 1122, 500);
		
		str[2] = new Student("krishna", 1123, 500);
		
		for(Student s:str)
		{
			System.out.println("studnet name is: "+s.name+"roll no is : "+s.rollno+"marks: "+s.marks);
		}
		
	}
	
		
	}

}
