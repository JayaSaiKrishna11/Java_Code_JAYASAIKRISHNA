package inheritancepackage;
//Hierarchiel inheritance
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
class Cats extends Animals{
	
	public void meow() {
		
		System.out.println("Cats makes meow sound");
	}
}

public class inheritance2 {

	public static void main(String[] args) {
		
		
			Dog d = new Dog();
			d.bark();
			d.eat();
			d.sleep();
			
			Cats c = new Cats();
			c.meow();
			c.eat();
			c.sleep();
	
	}
	
	
	
	
}
