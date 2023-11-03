package lo_oop;

public class Student {

    private int id;
    private String email;

    private String firstName;
    private String lastName;

    private String []interestedActivities;

    public String[] getInterestedActivities() {
        return interestedActivities;
    }

    public void setInterestedActivities(String[] interestedActivities) {
        this.interestedActivities = interestedActivities;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    private String dob;
    private String contactNumber;


}
