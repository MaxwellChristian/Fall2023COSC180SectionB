package lo_oop;

public class Student_Demo2 {

    public static void main(String []args){

        Student_V2 s1 = new Student_V2();

        s1.setId("S1100");
        s1.setEmail("abc@xyz.com");

        Biometrics bio = new Biometrics();
        bio.setWeight(200);
        bio.setHeight(190);
        bio.setEyeColor("BLACK");
        bio.setBloodGroup("AB+");

        s1.setBioData(bio);

        // set the first, middle and last name
        PersonName name = new PersonName("Maxwell", "Christian", "G");
        s1.setName(name);

        // set the date of birth
        s1.setDateOfBirth(new DOB(2023, 11, 8));

        System.out.println(s1);

    }

}
