package superkeyword;

class A{
	int i;
	int j;
}

class B extends A{
	
	int i;
	public void display() {
		
		 i =20;
		j = 12;
		super.i = 34;
		System.out.println("The value of i in the sub class "+ i);
		System.out.println("The value of j in the sub class "+ j);
		System.out.println("The value of j in the sub class "+ super.i);
	}
}

public class super1 {
	public static void main(String[] args) {
  B b = new B();
  b.display();
  
	}
}
