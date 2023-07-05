package inheritancepackage;
		class Employee{
			 double salary = 40000.00;
		}
		class Programmer extends Employee{
			double bonus = 10000;
		}
public class inheritance_5 {
	public static void main(String args[]) {
		Programmer p =  new Programmer();
		System.out.println("Programmer Salary: "+p.salary);
		System.out.println("Programmer Bonus: "+p.bonus);
	}
}
