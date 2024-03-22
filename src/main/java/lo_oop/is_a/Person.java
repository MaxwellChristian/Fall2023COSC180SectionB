package lo_oop.is_a;

public class Person {

    private String firstName;
    protected String lastName;
    // private with special permission to be
    // forwarded to child when inherited
    private String middleName;

    private int dd;
    private int mm;
    private int yyyy;

    public Person() {
        System.out.println("Person() Constructor");
    }

    public Person(String firstName, String lastName, String middleName) {
        this(firstName, lastName, middleName, 0, 0, 0);
        System.out.println("Person(fn, ln, mn) Constructor");
    }

    public Person(int dd, int mm, int yyyy) {
        this("", "", "", dd, mm, yyyy);
        System.out.println("Person(dd, mm, yyyy) Constructor");
    }

    public Person(String firstName, String lastName, String middleName, int dd, int mm, int yyyy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.dd = dd;
        this.mm = mm;
        this.yyyy = yyyy;
        System.out.println("Person(fn, ln, mn, dd, mm, yyyy) Constructor");
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getYyyy() {
        return yyyy;
    }

    public void setYyyy(int yyyy) {
        this.yyyy = yyyy;
    }

    @Override
    public String toString() {
        return "{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", dd=" + dd +
                ", mm=" + mm +
                ", yyyy=" + yyyy +
                '}';
    }
}
