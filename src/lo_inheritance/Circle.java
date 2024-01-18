package lo_inheritance;

public class Circle extends Shape implements Comparable<Circle> {

    private double radius;

    public Circle() {
        System.out.println("Circle()");
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }

    @Override
    public int compareTo(Circle o) {
        return (int) (this.radius - o.radius);
    }
}
