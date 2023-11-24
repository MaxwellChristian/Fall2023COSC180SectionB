package lo_inheritance.vehicles;

public class AirCraft extends Vehicle{

    @Override
    public void move() {
        System.out.println("In move() of AirCraft");
    }
}
