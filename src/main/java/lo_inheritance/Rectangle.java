package lo_inheritance;

public class Rectangle  extends Shape {

    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                super.toString() +
                ", " +
                "width=" + width +
                ", height=" + height +
                "} ";
    }
}
