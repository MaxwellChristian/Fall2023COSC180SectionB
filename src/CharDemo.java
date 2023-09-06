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
        // this is known as type-casting
        // specified by enclosing target/destination type in ( )

        System.out.println("Variable ch has  : " + ch);
        System.out.println("Variable num has : " + num);

        int i = 1;
        float f = 10.87F;
        double d = 98.7898;
        char c = 'X';

        f = i;
        i = (int) f ;

        d = i;
        d = f;
        f = i ;
        f = (float)d ;
        i = (int)d ;

        i = ch;
        ch = (char) i;
        f = ch;
        d = ch;



    }

}
