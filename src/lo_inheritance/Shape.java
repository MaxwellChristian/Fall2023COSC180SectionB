package lo_inheritance;

public class Shape {

    ShapeType type;
    private String color;

    public Shape() {
        System.out.println("Shape()");
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ShapeType getType() {
        return type;
    }

    public void setType(ShapeType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "type=" + type +
                ", color='" + color + '\'' +
                '}';
    }
}
