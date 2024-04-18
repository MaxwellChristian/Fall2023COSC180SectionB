package _2024_sim_f;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {

    String name;
    String location;
    double shiftHours;
    double totalItemsSold;

    public Employee() {
    }

    public Employee(String name, String location, long shiftHours, long totalItemsSold) {
        this.name = name;
        this.location = location;
        this.shiftHours = shiftHours;
        this.totalItemsSold = totalItemsSold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getShiftHours() {
        return shiftHours;
    }

    public void setShiftHours(double shiftHours) {
        this.shiftHours = shiftHours;
    }

    public double getTotalItemsSold() {
        return totalItemsSold;
    }

    public void setTotalItemsSold(double totalItemsSold) {
        this.totalItemsSold = totalItemsSold;
    }

    @Override
    public String toString() {
        return STR."Employee{name='\{name}\{'\''}, location='\{location}\{'\''}, shiftHours=\{shiftHours}, totalItemsSold=\{totalItemsSold}\{'}'}";
    }

    public String getAsCSV(){
        return STR."\{this.name},\{this.location},\{this.shiftHours},\{this.totalItemsSold}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return shiftHours == employee.shiftHours
                && totalItemsSold == employee.totalItemsSold
                && Objects.equals(name, employee.name)
                && Objects.equals(location, employee.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, shiftHours, totalItemsSold);
    }
}
