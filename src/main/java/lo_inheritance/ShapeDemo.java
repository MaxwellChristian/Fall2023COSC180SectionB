package lo_inheritance;

public class ShapeDemo {

    public static void main(String []args) {

        Circle c1 = new Circle();

        c1.setColor("Blue");
        c1.setRadius(10.2);

        c1.setType(ShapeType.TWO_D);

        System.out.println(c1);

        Circle c2 = new Circle("Yellow", 15.2);
        System.out.println(c2);
        System.out.println("Area of circle: " + c2.getArea());

        Rectangle r1 = new Rectangle("Red", 10.10, 12.12);
        r1.setType(ShapeType.THREE_D);
        System.out.println(r1);
        System.out.println("Area of rectangle: " + r1.getArea());


    }

}
