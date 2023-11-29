package lo_inheritance.vehicles;

public class Car extends Vehicle {

    private int numberOfTires;

    public Car() {
        numberOfTires = 4;
    }

    public Car(double height, double weight, double width, String color) {
        super(height, weight, width, color);
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    @Override
    public void move() {
        System.out.println("In move() of Car");
    }

}
