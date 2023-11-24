package lo_inheritance.vehicles;

public class Car extends Vehicle {

    @Override
    public void move() {
        System.out.println("In move() of Car");
    }
}
