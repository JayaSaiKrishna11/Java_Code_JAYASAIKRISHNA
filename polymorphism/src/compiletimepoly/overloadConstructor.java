package compiletimepoly;

class Box{
	
	double length;
	double breadth;
	double depth;
	
	Box()
	{
		length = 12.0;
		depth = 34.0;
		breadth = 34.9;
	}// param of the cube
	Box(double len)
	{
		length = breadth = depth = len;
		
	}
	Box(double length, double breadth, double depth){
		
		this.length = length;
		this.breadth = breadth;
		this.depth = depth;
	}
	public void volume() {
		double vol = length* breadth* depth;
		System.out.println("Volume of the box = "+vol);
	}
}

public class overloadConstructor {
	public static void main(String[ ] args) {
		
		Box b = new Box();
		b.volume();
		
		Box b2 = new Box(2.0);
		b.volume();
		Box b3 = new Box(2.0,3.4,5.6);
		b3.volume();
		
	}

}
