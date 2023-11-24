package lo_inheritance.vehicles;

public class Car extends Vehicle {

    public Car() {
    }

    public Car(double height, double weight, double width, String color) {
        super(height, weight, width, color);
    }

    @Override
    public void move() {
        System.out.println("In move() of Car");
    }
}
