package lo_oop.is_a;

public class StudentDemo {

    public static void main(String []args) {

        Student stu1 = new Student();

        stu1.setFirstName("Maxwell");
        stu1.setMiddleName("G");
        stu1.setLastName("Christian");

        stu1.setDd(1);
        stu1.setMm(2);
        stu1.setYyyy(2000);

        System.out.println(stu1);

        Student s2 = new Student("Max", "G", "", "ID1", "abc@xyz.com", "306");
        System.out.println(s2);
    }

}
