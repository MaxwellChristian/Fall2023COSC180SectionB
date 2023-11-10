package lo_oop.geometry;

import java.util.Date;

public class Shape {

    String color;
    Date createdOn;

    public Shape() {
        // the default color should be black
        // the created time stamps should be current date
    }

    public Shape(String color, Date createdOn) {
        this.color = color;
        this.createdOn = createdOn;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", createdOn=" + createdOn +
                '}';
    }
}
