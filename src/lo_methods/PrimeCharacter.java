package lo_methods;

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
        for (char ch : text.toCharArray()) {
            if (isPrime(ch)) {
                System.out.println(ch + ": " + (int) ch);
            }
        }

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
