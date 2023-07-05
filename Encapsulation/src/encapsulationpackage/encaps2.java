package encapsulationpackage;

class Student{
	
	private String college = "UCL";
	
	public String getCollege() {
		
		return college;
		
	}
}

public class encaps2 {
	public static void main(String[] args) {
Student s = new Student();
String college = s.getCollege();
	System.out.println("the student college is "+college);
	}
}
