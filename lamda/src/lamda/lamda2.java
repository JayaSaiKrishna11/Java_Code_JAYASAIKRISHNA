package lamda;
@FunctionalInterface
interface Inter2{
	public int square(int x);
}
public class lamda2 {
		public static void main(String args[]) {
					Inter2 inter2 = (x) -> { return x*x;	};
					
					int square1 = inter2.square(4);
					System.out.println(square1);
					int square2 = inter2.square(23);
					System.out.println(square2);
		}
}
