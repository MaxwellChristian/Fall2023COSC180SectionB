package lo_oop;

public class PersonName {

    private String firstName;   // first name
    private String lastName;
    private String middleName ;

    // default constructor must assign all name parts to be "NA"
    public PersonName() {
    }

    public PersonName(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    // toString should return the value as First-Middle-Last
    @Override
    public String toString() {
        return firstName + '-' + middleName + '-' + lastName;
    }
}
