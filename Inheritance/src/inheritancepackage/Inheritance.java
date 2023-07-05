package inheritancepackage;
//Single inheritance

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

public class Inheritance {

	public static void main(String[] args) {
		
		
			Dog d = new Dog();
			d.bark();
			d.eat();
			d.sleep();
	
	}
	
	
	
	
}
