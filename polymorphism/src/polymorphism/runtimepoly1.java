package polymorphism;

class shape{
	public void draw() {
		System.out.println("drawing shapes");
	}
	
}

class rectangle extends shape{
	public void draw() {
		System.out.println("drawing rectangle");
	}
	
}
class triangle extends shape{
	public void draw() {
		System.out.println("drawing triangle");
	}
	
}
public class runtimepoly1 {
public static void  main(String [] args) {
	
	shape s = new shape();
	
	s.draw();
	
	s = new rectangle();
	
	s.draw();
	
	s = new triangle();
	
	s.draw();
	
}
	
}
