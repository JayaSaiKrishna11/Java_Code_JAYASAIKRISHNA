package inheritancepackage;

class A {
    public int x;
    private int y;
	
    public void get_a(int x) {
        this.x = x;
    }

    public void show_private() {
        System.out.println("The value of y = " + y);
    }
}

class B {
    private int z;

    public void get_z(int z) {
        this.z = z;
    }

    public int sum() {
        A a = new A();
        int sumans = a.x + z;
        return sumans;
    }
}

public class inheritance4 {
    public static void main(String[] args) {
        A a = new A();
        a.get_a(5);
        a.show_private();

        B b = new B();
        b.get_z(10);
        int ans = b.sum();
        System.out.println("The sum = " + ans);
    }
}
