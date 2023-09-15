package lo_math_string_fns;

public class StringFnDemo {

    public static void main(String []args){

        // demo of different string functions

        String name = "Maxwell Christian";

        // length of the string
        System.out.printf("Length of %s : %d\n", name, name.length());

        // alternate approach of using + with printf
        // System.out.printf("Length of " + "%s" + " : " + "%d" + "\n", name, name.length());

        // displaying the first character of the string
        // charAt(int) : can pass any integer between 0 and the length of the string
        // i.e., 0: represents the first character
        // and length-1 represents the last character
        System.out.printf("First character : %c\n", name.charAt(0));
        System.out.printf("Last  character : %c\n", name.charAt( name.length() - 1 ));

        // finding a character from the string
        // indexOf() : returns the FIRST position of the character from the string
        // if not found, returns -1
        System.out.printf("Position of 'x' in name: %d\n", name.indexOf('x'));

        // find the FIRST occurrence of 'a' in the string
        System.out.printf("Position of 'a' in name (1st time): %d\n", name.indexOf('a'));

        // find the SECOND occurrence of 'a' in the string
        System.out.printf("Position of 'a' in name (2nd time): %d\n", name.indexOf('a', 2) );

        // find the LAST occurrence of 'a' in the string
        System.out.printf("Position of 'a' in name (last time): %d\n", name.lastIndexOf('a'));

        // extract a part of the string
        // the following version extracts the string from a given position to the end of the string
        System.out.println("Second word: " + name.substring(8) );

        // the following version extracts the string from a starting position to an ending position
        // the function works as starting position to ( ending position - 1)
        System.out.println("Second word: " + name.substring(0, 3) );    // here from 0 to 2 i.e., 0, 1, 2

        // show the name in all upper case
        System.out.println("NAME: " + name.toUpperCase());

        // show the name in all lower case
        System.out.println("NAME: " + name.toLowerCase());

        // a small task
        // given a string with multiple words,
        // display the second and the last word
        name = "My name is Maxwell Christian";  // expected output : name Christian


    }

}
