package lo_inheritance.vehicles;

public class Helicopter extends Vehicle implements EmergencyVehicles {

    int noOfBlades;

    @Override
    public void move() {

    }

    @Override
    public String getEmergencyName() {
        return "Helicopeter: EH1";
    }

    @Override
    public String getEmergencyTime() {
        return "08:00 to 19:00";
    }
}
