package lo_oop;

public class StudentDemo {

    public static void main(String []args){

        // creating reference s1 to Student
        Student s1;

        // creating object and assigning to the reference s1
        s1 = new Student();

        s1.setId(57);   // assigning the ID of student 1
        s1.setEmail("abc@xyz.com"); // assigning the email of student 1

        int idStored = s1.getId();  // fetching the id of student 1
        System.out.println("Id: " + idStored);

        String emailOfStudent = s1.getEmail(); // fetching the email of student 1
        System.out.println("Id: " + emailOfStudent);


        Student s2 = new Student();
        s2.setId(22);
        s2.setEmail("stud2@xyz.com");


    }

}
