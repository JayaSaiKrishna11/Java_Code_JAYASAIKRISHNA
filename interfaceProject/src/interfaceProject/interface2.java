package interfaceProject;

interface Shapes{
	public void draw();
}

class rectangle implements Shapes{
	
	@Override
	public void draw() {
		System.out.println("Drawing a reactangle");
		
	}

}

class triangle implements Shapes{
	
	@Override
	public void draw() {
		System.out.println("Drawing a triangle ");
		
	}

}

public class interface2 {

	public static void main(String[] args) {
		
		rectangle r = new rectangle();
		r.draw();
		
		triangle t = new triangle();
		t.draw();
		
	}
	
	
	
}

