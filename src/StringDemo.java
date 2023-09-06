/*
this program demonstrates the use of String
 */
public class StringDemo {

    public static void main(String []args){

        int i1;
        // i1 is a variable of type int

        String name;
        // creating an object called "name" of class String
        // remember String is not a data type, but is an in-built class of JAVA
        // so the variable "name" is referred as "object"

        // possible values to name

        // name = 'A';     // not allowed
        // name = 78;      // not allowed

        name = "A";      // here A is not a character but a string
        name = "78";    // here 78 is not numeric and hence cannot be used for arithmetic
        name = "Maxwell";

        System.out.println("Name stored is: " + name);

        int lengthOfName = name.length();
        System.out.println("Total characters in " + name + " are : " + lengthOfName);

    }

}
