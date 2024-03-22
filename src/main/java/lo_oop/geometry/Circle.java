package lo_oop.geometry;

import java.util.Date;

// add a new method which returns the perimeter of the circle

public class Circle extends Shape {

    int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(String color, Date createdOn, int radius) {
        super(color, createdOn);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }
}
