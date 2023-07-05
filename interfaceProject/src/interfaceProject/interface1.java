
// example for the Interfaces - 1

package interfaceProject;
interface Printtable{
	public void print();
	
}
public class interface1 implements Printtable {

	@Override
	public void print() {
		System.out.println("method overridden by the implementation class");
		
		
	}

	public static void main(String[] args) {
		interface1 i1 = new interface1();
		// either above syntax or down syntax we can use both for the output
		Printtable p = new interface1();
		
		p.print();
	}
}
