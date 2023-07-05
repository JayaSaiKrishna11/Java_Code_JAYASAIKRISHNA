package interfaceProject;
interface Intern
{
	static int cube(int x)
	{
		return x*x*x;
	}
}
public class staticInterface implements Intern{

	public static int cube(int x)
	{
		return x*x*x;
	}
	public static void main(String[] args) {
		
		System.out.println("the value "+Intern.cube(3));
		System.out.println("the value "+staticInterface.cube(4));
	}
}
