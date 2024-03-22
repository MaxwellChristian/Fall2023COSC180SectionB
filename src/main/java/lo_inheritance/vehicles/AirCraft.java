package lo_inheritance.vehicles;

public class AirCraft extends Vehicle{

    private int wings;

    public AirCraft() {
        wings = 2;
    }

    public int getWings() {
        return wings;
    }

    @Override
    public void move() {
        System.out.println("In move() of AirCraft");
    }
}
