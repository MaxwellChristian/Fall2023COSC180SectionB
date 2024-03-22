package lo_oop.is_a;


// Student IS-A Person
// This is known as Inheritance

// So here the Person is a base/parent/super class and
// Student is a sub-class/child/derived

public class Student extends Person {

    // all the possible members from the base/parent class are
    // available to the derived/sub/child class

    // so the properties, constructors, methods, all may  be available to the
    // derived class

    String id;
    String email;
    String phoneNumber;

    public Student() {
        System.out.println("Student() constructor");
    }

    public Student(String id, String email, String phoneNumber) {
        this.id = id;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Student(String firstName, String lastName, String middleName, String id, String email, String phoneNumber) {
        super(firstName, lastName, middleName); // calling the base class constructor
        // the 'super' keyword refers to the base/super/parent class
        // so 'super()' refers to base class constructor

        this.id = id;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                "} " + super.toString()
                ;
    }
}
