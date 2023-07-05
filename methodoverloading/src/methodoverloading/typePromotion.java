package methodoverloading;

class Demo{
	
	public void show(){
		
		System.out.println("no arguments");
	}
public void show(int i){
		
		System.out.println("integer arguemnts"+i);
	}
public void show(double j){
	
	System.out.println("double arguments"+j);
}
	
}

public class typePromotion {

	public static void main(String []args) {
	Demo d1 = new Demo();
	
	d1.show();
	d1.show(3);
	d1.show('s');
	d1.show(34.857);
	
	
	}
	
	
}
