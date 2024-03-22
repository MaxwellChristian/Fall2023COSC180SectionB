package lo_oop;

public class Circle {

    static int totalObjectsCreated;
    // class variable [shared amongst all objects]

    double radius;
    // instance variable [will be copied to each object created]

    public Circle() {
        totalObjectsCreated++;
    }

    public Circle(double radius) {
        this(); // invokes the constructor with no parameters
        // should be the first line in the method

        // Circle();    // not permitted [syntax errors]

        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius){
        this.radius = newRadius;
    }

    public static int getTotalObjectsCreated() {
        // this.radius = 1;
        // the above statement is not permitted
        // as it is using an instance variable from a static method

        return totalObjectsCreated;
    }
}
