package staticpackage;

class Employee{
	
	String ename;
	
	int eID;
	
	static String company = "Technoforte";
	
	Employee(String ename, int eID){
		
		this.ename = ename;
		this.eID = eID;
		
	}
	
	public void Display(){
		System.out.println("Employee name is: "+ename);
		System.out.println("Employee name is: "+eID);
		System.out.println("Company name is: "+company);
	}
	
}

public class ex7 {
	
	public static void main(String args[]) {
		
		Employee e1 = new Employee("jai",1121);
				e1.Display();
		Employee e2 = new Employee("Vamsi",1122);
				e2.Display();
		Employee e3 = new Employee("sagar",1123);
				e3.Display();
	}
	

}
