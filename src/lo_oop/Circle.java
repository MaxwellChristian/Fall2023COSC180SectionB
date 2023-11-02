package lo_oop;

public class Circle {

    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void setRadius(double newRadius){
        this.radius = newRadius;
    }

}
