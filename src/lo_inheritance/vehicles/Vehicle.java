package lo_inheritance.vehicles;

public abstract class Vehicle {

    // properties of the vehicle
    private double height;
    private double weight;
    private double width;

    private String color;

    private String manufacturerName;

    // constructors

    public Vehicle() {
    }

    public Vehicle(double height, double weight, double width) {
        this.height = height;
        this.weight = weight;
        this.width = width;
    }

    public Vehicle(double height, double weight, double width, String color) {
        this.height = height;
        this.weight = weight;
        this.width = width;
        this.color = color;
    }

    public Vehicle(double height, double weight, double width, String color, String manufacturerName) {
        this.height = height;
        this.weight = weight;
        this.width = width;
        this.color = color;
        this.manufacturerName = manufacturerName;
    }

    // getters and setters


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public abstract void move();
    // abstract methods cannot have body
    // should be in a base class
    // will have to be override in derived class

    // override

    @Override
    public String toString() {
        return "Vehicle{" +
                "height=" + height +
                ", weight=" + weight +
                ", width=" + width +
                ", color='" + color + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                '}';
    }
}
