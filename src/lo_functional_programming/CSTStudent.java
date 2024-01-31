package lo_functional_programming;

public class CSTStudent {

    private String firstName;
    private String lastName;

    private String programName;

    private int age;

    private double score;


    public CSTStudent(String firstName, String lastName, String programName, int age, double score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.programName = programName;
        this.age = age;
        this.score = score;
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

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
