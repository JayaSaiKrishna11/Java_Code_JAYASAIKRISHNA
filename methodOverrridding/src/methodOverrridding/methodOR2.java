package methodOverrridding;

class Bank{
	public int getrateInt() {
		return 0;
	}
	
}
class sbi extends Bank{
	public int getrateInt() {
		return 12;
	}
}
class icic extends Bank{
	public int getrateInt() {
		return 14;
	}
}
public class methodOR2 {
public static void main(String[] args) {
	sbi S = new sbi();
	int rate = S.getrateInt();
	System.out.println("the value of the sbi getrateinterest: "+rate);
	
	icic i = new icic();
	int rate1 = i.getrateInt();
	System.out.println("the value of the icic getrateinterest: "+rate1);
	
}
}
