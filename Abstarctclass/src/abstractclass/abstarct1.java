package abstractclass;
abstract class vehicle{
	public abstract int get_no_of_wheels();
}

class bike extends vehicle{
	public int get_no_of_wheels() {
		return 2;
	}
}

class car extends vehicle{
	public int get_no_of_wheels() {
		return 4;
	}
}


public class abstarct1 {
public static void main(String[] args) {
	car c = new car();
	int no = c.get_no_of_wheels();
	System.out.println("the number of the wheels that a car have = "+no);
	
	bike b = new bike();
	int bno = b.get_no_of_wheels();
	System.out.println("the number of the wheels that a bike have = "+bno);
}
	
	
}
