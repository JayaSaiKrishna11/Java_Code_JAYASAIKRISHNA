package lamda;
@FunctionalInterface

interface InterTwo
{
	public void add(int a, int b);
}
public class lambda3 {
		public static void  main(String args[]) {
			InterTwo inter2 = (a,b) -> System.out.println("The sum of the 2 num: "+(a+b));
			inter2.add(12, 23);
			inter2.add(45, 12);
		}
}
