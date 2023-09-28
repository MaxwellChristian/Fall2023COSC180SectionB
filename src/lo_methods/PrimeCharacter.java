package lo_methods;

import javax.security.auth.callback.CallbackHandler;
import java.util.Scanner;

public class PrimeCharacter {

    public static void main(String[] args) {

        String text;

        Scanner inputLine = new Scanner(System.in);

        System.out.print("Enter text: ");
        text = inputLine.nextLine();
/*
        for (int index = 0; index < text.length(); index++) {

            char ch = text.charAt(index);

            if (isPrime(ch)) {
                System.out.println(ch + ": " + (int) ch);
            }

        }
        */

        int digits = 0;
        int lower = 0;
        int upper = 0;
        int specials = 0;
        int spaces = 0;

        for (char ch : text.toCharArray()) {

            if (isPrime(ch)) {
                System.out.println(ch + ": " + (int) ch);
            }

            if (Character.isDigit(ch)) {
                digits++;
            } else {
                if (Character.isAlphabetic(ch)) {

                    if (Character.isLowerCase(ch)) {
                        lower++;
                    } else {
                        upper++;
                    }

                } else {
                    if (Character.isSpaceChar(ch)) {
                        spaces++;
                    } else {
                        specials++;
                    }

                }
            }

        }

        System.out.println("Digits: " + digits);
        System.out.println("Lower case: " + lower);
        System.out.println("Upper case: " + upper);
        System.out.println("Spaces: " + spaces);
        System.out.println("Special symbols: " + specials);

    }

    private static boolean isPrime(int value) {

        for (int divisor = 2; divisor < value; divisor++) {
            if (value % divisor == 0) {
                return false;
            }
        }

        return true;
    }

}
