package lo_oop.geometry;

public class ShapeDemo {

    public static void main(String []args) {

        Circle c = new Circle();
        c.setColor("Blue");
        c.setRadius(5);
        int area = c.getArea();
        System.out.println(c + " " + area);

        Rectangle r = new Rectangle();
        r.setWidth(10);
        r.setHeight(20);
        System.out.println("Area : " + r.getArea());

        // base class reference can point to derive class objects

        Shape s = new Circle(); // this is permitted

        // Circle c1 = new Shape();    // not permitted
    }

}
