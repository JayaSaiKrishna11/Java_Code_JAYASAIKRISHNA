package package1;

import package1.package_1;

import package1.pack2;

public class newpack {
	public static void main(String [] args) {
		
		package_1 p = new package_1();
		
		p.add(12, 23);
		p.sub(22, 3);
		p.multiply(73, 9);
		
		pack2 p2 = new pack2();
		
		p2.add();
		
	}
}
