package lo_inheritance.vehicles;

import java.util.ArrayList;

public class VehicleDemo2 {

    public static void main(String[] args) {

        Vehicle v1; // this is just a reference
        // not an object

        v1 = new Car(); // base class reference can refer to derived class objects
        v1.move();  // polymorphism

        v1 = new AirCraft();
        v1.move();  // polymorphism

        // create 5 different objects
        // 3 cars
        // 2 aircrafts

        ArrayList<Vehicle> alVehicles = new ArrayList<>();

        System.out.println("Total vehicles: " + alVehicles.size());

        alVehicles.add(new Car());
        alVehicles.add(new Car());
        alVehicles.add(new Car());

        alVehicles.add(new AirCraft());
        alVehicles.add(new AirCraft());

        System.out.println("Total vehicles: " + alVehicles.size());

        for (Vehicle v : alVehicles) {
            //System.out.println(v);
            v.move();

            // check the type of the vehicle
            if( v instanceof Car ){
                // show number of tires [if car]
                System.out.println("Car: Tires: " + ((Car) v).getNumberOfTires());
            }

            if( v instanceof AirCraft ){
                // show number of wings [if aircraft]
                System.out.println("Aircraft: Wings: " + ((AirCraft) v).getWings());
            }

        }
    }

}
