package superkeyword;

class Box {
    double length;
    double breadth;
    double height;

    Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(double l, double b, double h, double w) {
        super(l, b, h);
        weight = w;
    }

    public void volume() {
        double vol = length * breadth * height;

        System.out.println("The volume of the box is " + vol);
        System.out.println("The weight of the box is " + weight);
    }
}

public class super3 {
    public static void main(String[] args) {
        BoxWeight bx = new BoxWeight(32, 34, 45, 56.0);
        bx.volume();
    }
}

