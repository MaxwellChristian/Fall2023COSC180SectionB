package doubt_solving_session_1;

public class Student_Test {

    public static void main(String []args) {

        Student s1 = new Student();

        Student s2 = new Student("I1");

        Student s3 = new Student("FN", "MN", "LN");

        // print all values of s3
        System.out.println(s3.getId());
        System.out.println(s3.getFirstName());
        System.out.println(s3.getMiddleName());
        System.out.println(s3.getLastName());

        // change the first name
        s3.setFirstName("New_FN");
        System.out.println(s3.getFirstName());
        System.out.println(s3.getMiddleName());
        System.out.println(s3.getLastName());

        // add the address
        Address addressObj = new Address("L1", "L2", "Regina", "SK", "A1C D2F");
        s3.setStudentAddress(addressObj);

        // display the whole object using println
        // i.e., print all values from the object using println
        System.out.println("S3: " + s3);
    }

}
