package lo_oop.is_a_has_a;

public class StudentDemo {

    public static void main(String []args) {

        Student stu1 = new Student();

        stu1.setId("ID1");
        stu1.setEmail("abc@xyz.com");

        stu1.setName(new NameParts("FF", "LL", "MM"));
        stu1.setBiometrics(new Bio("M", "Blue", 100, 190, "AB+"));

        System.out.println(stu1);

    }

}
