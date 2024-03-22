package doubt_solving_session_1;

// Referring to UML
    // - refers to PRIVATE
    // + refers to PUBLIC

public class Student {

    // member variables
    private String id;
    private String firstName;
    private String middleName;
    private String lastName;

    // store address
        // address line 1
        // address line 2
        // city
        // province
        // postal code
    // HAS-A relationship
    // i.e., student HAS-A address
    private Address studentAddress;

    // member methods

    // constructors : are used to initialize member variables

    public Student() {
        id = "";
        firstName = "";
        middleName = "";
        this.lastName = "";
    }

    public Student(String id) {
        this.id = id;
        //id = id;

        this.firstName = "NA";
        this.middleName = "NA";
        this.lastName = "NA";
    }

    public Student(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    // getters

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    // setters

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(Address studentAddress) {
        this.studentAddress = studentAddress;
    }

    // override of methods


    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentAddress=" + studentAddress +
                '}';
    }
}
