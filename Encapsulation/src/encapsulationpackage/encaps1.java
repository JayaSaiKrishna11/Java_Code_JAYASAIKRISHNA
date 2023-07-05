package encapsulationpackage;

class Employee {
	private String name;
	private int ssn;
	private double salary;

	public void setName(String name) {
		this.name = name;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getSsn() {
		return ssn;
	}

	public double getSalary() {
		return salary;
	}
}

public class encaps1 {
	public static void main(String[] args) {

		Employee e = new Employee();
		e.setName("John");
		e.setSsn(123);
		e.setSalary(80000);

		String name = e.getName();
		System.out.println("The name of the employee is " + name);
		int ssn = e.getSsn();
		System.out.println("The ssn of the employee is " + ssn);
		double salary = e.getSalary();
		System.out.println("The salary of the employee is " + salary);
	}
}
