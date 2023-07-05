package abstractinterface;
interface Inter 
{
	public void a();
	public void b();
	public void c();
	public void d();
}

abstract class Myclass implements Inter{
	
	public void a() {
		System.out.println("hello from a");
	}
	
}
class Mysub extends Myclass{

	@Override
	public void b() {
		System.out.println("hello from b");
	}

	@Override
	public void c() {
		System.out.println("hello from c");
		
	}

	@Override
	public void d() {
		System.out.println("hello from d");
		
	}
	
}
 public class AI1 {
	 public static void main(String[] args) {
		 
		 Mysub s = new Mysub();
		 s.a();
		 s.b();
		 s.c();
		 s.d();
	 }


}
