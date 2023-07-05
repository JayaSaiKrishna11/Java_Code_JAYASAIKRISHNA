package superkeyword;
//code for the super method invoke
class one {
	int i;
	public void display(int i) {
		this.i = i;
		System.out.println("The value of the i is "+i);
	}
}
class two extends one {
	int j;
	public void display(int j) {
		super.display(26);
		this.j = j;
		System.out.println("The value of the j is "+j);
	}
}




public class super2 {
public static void main(String[] args) {
	
	two t = new two();
	
	t.display(23);
	

	
}
}
