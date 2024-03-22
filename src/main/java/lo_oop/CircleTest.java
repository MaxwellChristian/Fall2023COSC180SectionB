package lo_oop;

public class CircleTest {

    public static void main(String []args){

        Circle c1;  // reference to Circle objects
        c1 = new Circle();  // now c1 refers to Circle object

        System.out.println("Radius of c1: " + c1.radius);

        double area = c1.getArea();
        System.out.println("Area of c1: " + area);
        System.out.println("Total objects created: " + Circle.getTotalObjectsCreated() );

        c1 = new Circle(5.7);
        System.out.println("Radius of c1: " + c1.radius);
        System.out.println("Area of c1: " + c1.getArea());

        System.out.println("Total objects created: " + Circle.getTotalObjectsCreated() );

        c1 = new Circle();
        c1 = new Circle(2.5);
        c1 = new Circle(7.2);

        System.out.println("Total objects created: " + Circle.getTotalObjectsCreated() );

    }

}
