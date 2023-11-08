package lo_oop;

import java.util.Arrays;

// version 2
public class Student_V2 {

    private String id;

    private String email;

    private PersonName name;

    private ContactNumber []numbers;

    private DOB dateOfBirth;

    private Biometrics bioData;
    // eye color
    // weight   // in lbs
    // height   // in cms
    // blood group


    public Student_V2() {
    }

    public Student_V2(String id, String email, PersonName name, ContactNumber[] numbers, DOB dateOfBirth, Biometrics bioData) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.numbers = numbers;
        this.dateOfBirth = dateOfBirth;
        this.bioData = bioData;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PersonName getName() {
        return name;
    }

    public void setName(PersonName name) {
        this.name = name;
    }

    public ContactNumber[] getNumbers() {
        return numbers;
    }

    public void setNumbers(ContactNumber[] numbers) {
        this.numbers = numbers;
    }

    public DOB getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DOB dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Biometrics getBioData() {
        return bioData;
    }

    public void setBioData(Biometrics bioData) {
        this.bioData = bioData;
    }

    @Override
    public String toString() {
        return "Student_V2{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", name=" + name +
                ", numbers=" + Arrays.toString(numbers) +
                ", dateOfBirth=" + dateOfBirth +
                ", bioData=" + bioData +
                '}';
    }
}
