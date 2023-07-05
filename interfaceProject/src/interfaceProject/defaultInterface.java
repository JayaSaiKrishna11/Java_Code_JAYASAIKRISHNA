package interfaceProject;
interface Inter
{
	//It is the default that is present in the interface
	default void show() {
		System.out.println("hello from the default method in interface");
	}
	public void m1();
}
public class defaultInterface implements Inter{

	@Override
	public void m1() {
		System.out.println("hello from the overridden by the method m1");
		
	}
	//we can override the default method if we are not satisfy, with the public keyword
	/*public void show() {
		//System.out.println("this is the new one implemented outside the interface");
	}*/
	public static void main(String[] args) {
		defaultInterface dp = new defaultInterface();
		
		dp.show();
		dp.m1();
	}

}
