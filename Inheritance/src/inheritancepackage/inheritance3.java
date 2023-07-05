package inheritancepackage;

class Animals{

	public void eat() {
		System.out.println("Animals eat");
	}
	
	public void sleep() {
		System.out.println("Animals sleep");
	}

	
		
}

class Dog extends Animals{
	
	public void bark() {
		
		System.out.println("Dogs bark");
	}
}

class Labror extends Dog{
	public void breed() {
		System.out.println("Labror is a breed");
	}
	
}

public class inheritance3 {

	
	public static void main(String[] args) {
		
		
		Dog d = new Dog();
		d.bark();
		d.eat();
		d.sleep();
		Labror l1 = new Labror();
		l1.bark();
		l1.breed();
		

}
}


//Multi-Level inheritance

