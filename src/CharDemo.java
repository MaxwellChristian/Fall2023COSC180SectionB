/*
* This program demonstrates the use of char type
* */
public class CharDemo {

    public static void main(String []args) {

        // declaration section
        char ch;    // can hold ONLY a SINGLE character

        int num;    // can hold any whole integer [positive or negative]
        num = 8;
        num = -97;
        num = +45;

        // input section
        ch = 'a';   // single characters should be enclosed in single quotes

        // processing section
        num = ch;

        // output section
        System.out.println("Variable ch has  : " + ch);
        System.out.println("Variable num has : " + num);

        num = 67;
        ch = (char) num;
        System.out.println("Variable ch has  : " + ch);
        System.out.println("Variable num has : " + num);

    }

}
