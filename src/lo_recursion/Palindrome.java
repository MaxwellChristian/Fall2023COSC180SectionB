package lo_recursion;

/*
 *
 * write a recursive method which checks whether a given string is palindrome or not.
 * The method should return a boolean
 * */

public class Palindrome {

    public static void main(String[] args) {

        try {

            for (String word : args) {
                System.out.println(word + (isPalindrome(word) ? " is a Palindrome" : " is NOT a Palindrome"));
            }

        } catch (Exception exception) {
            System.out.println(exception);
        }

    }

    private static boolean isPalindrome(String word) {
        return isPalindrome(word, 0, word.length() - 1);
    }

    private static boolean isPalindrome(String word, int startIndex, int endIndex) {

        /*// base/stop case
        if (endIndex <= startIndex) {
            return true;
        } else {
            // base/stop case
            if (word.charAt(startIndex) != word.charAt(endIndex)) {
                return false;
            } else {
                // recursive case
                return isPalindrome(word, startIndex + 1, endIndex - 1);
            }
        }*/

         return endIndex <= startIndex || ((word.charAt(startIndex) == word.charAt(endIndex) && isPalindrome(word, startIndex + 1, endIndex - 1)));

    }

}
