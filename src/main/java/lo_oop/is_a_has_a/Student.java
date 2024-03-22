package lo_oop.is_a_has_a;

public class Student extends Person {

    String id;
    String email;

    public Student() {
    }

    public Student(NameParts name, String id, String email) {
        super(name);
        this.id = id;
        this.email = email;
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

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                 super.toString() +
                "} " ;
    }
}
