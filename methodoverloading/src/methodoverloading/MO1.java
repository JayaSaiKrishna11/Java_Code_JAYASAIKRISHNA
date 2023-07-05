package methodoverloading;

public class MO1 {

	public static void area(int side) {
		
		int square_area = side * side;
		
		System.out.println("The area of the square = "+square_area);
	}
	
	public static void area(int length, int breadth ) {
		
		int rectangle_area = length * breadth;
		
		System.out.println("The area of the square = "+ rectangle_area);
	}
	
	public static void main(String [] args) {
		area(4);
		area(3,4);
		
		overDemo o = new overDemo();
		
		o.m1(12f, 34f);
		
		o.m1(54, 34);
		
		
	}
}

class overDemo{
	
	public void m1(int i,int j) {
		
		System.out.println("The integers arguements with same method = "+i+", "+j);
	}
public void m1(float k,float j) {
		
		System.out.println("The float arguements with same method = "+k+", "+j);
	}
	
}


