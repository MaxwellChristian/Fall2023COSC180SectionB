package lo_oop.geometry;

import java.util.Date;

// add a new method which returns the perimeter of the rectangle

public class Rectangle extends Shape {

    int width;
    int height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, Date createdOn, int width, int height) {
        super(color, createdOn);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                super.toString() + ", " +
                "width=" + width +
                ", height=" + height +
                "} ";
    }

    public int getArea() {
        return getWidth() * getHeight();
    }
}
