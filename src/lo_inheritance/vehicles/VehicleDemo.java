package lo_inheritance.vehicles;

public class VehicleDemo {

    public static void main(String []args) {

        Car c1 = new Car();
        c1.move();

        AirCraft a1 = new AirCraft();
        a1.move();

        Vehicle v1; // object reference of a base class

        // base class reference can refer to any derived class object
        // vice-versa is not true
        v1 = new AirCraft();
        v1.move();  // move() called using v1, still refers to AirCraft

        v1 = new Car();
        v1.move();  // move() called using v1, still refers to Car

        // this is polymorphism

        EmergencyVehicles ev = new Helicopter();

        // ev = new Car();  // not allowed as Car does not implement EmergencyVehicles

    }

}
