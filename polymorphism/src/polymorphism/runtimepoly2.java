package polymorphism;
class Animal{
	
	public void make_sound() {
		
		System.out.println("Animals make sound");
	}}
// Each class should be declared in a separate file with the same name as the class
	class dogs extends Animal{
		
		public void make_sound() {
			
			System.out.println("dogs make barking sound");
		}	}
		class puppy extends Animal{
			
			public void make_sound() {
				
				System.out.println("puppy make cute sound");
			}
}
public class runtimepoly2 {
public static void main(String[] args) { 
	Animal a = new Animal();
	
	a.make_sound();
	
	a = new dogs();
	
	a.make_sound();
	
	a = new puppy();
	
	a.make_sound();
	
	
	
}
	
}
