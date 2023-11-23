package lo_inheritance;

public class ShapeDemo {

    public static void main(String []args) {

        Circle c1 = new Circle();

        c1.setColor("Blue");
        c1.setRadius(10.2);

        System.out.println(c1);

        Circle c2 = new Circle("Yellow", 15.2);
        System.out.println(c2);

        Rectangle r1 = new Rectangle("Red", 10.10, 12.12);
        System.out.println(r1);

    }

}
