package interfaceProject;
//inheritance in interface

interface A
{
	public void m1();
}

interface B extends A{
	public void m2();
	
}
public class interface3 implements B {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		// like this we nees to give any output in this elements
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

}
