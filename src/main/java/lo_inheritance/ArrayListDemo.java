package lo_inheritance;

import lo_inheritance.vehicles.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {

    public static void main(String []args){

        int []arr = new int[5];
        // arrays has a fixed size

        // think of a scenario where
        // records are fetched from a file/database
        // and stored in the program

        // dynamic data structure is required
        // which is not dependent on fixed size

        ArrayList<Integer> alNumbers = new ArrayList<>();

        alNumbers.add(57);
        alNumbers.add(571);
        alNumbers.add(157);
        alNumbers.add(5557);
        alNumbers.add(1157);
        alNumbers.add(58787);
        alNumbers.add(57777);
        alNumbers.add(1157);
        alNumbers.add(157);

        // total values in the list
        System.out.println("Total values: " + alNumbers.size());

        // the first value in the list
        System.out.println("First value: " + alNumbers.getFirst());

        // the last value in the list
        System.out.println("Last value: " + alNumbers.getLast());

        // the whole list
        System.out.println(alNumbers);

        // appending a value to the list
        alNumbers.add(1234);
        System.out.println("After adding 1234 to the list");
        System.out.println("Total values: " + alNumbers.size());
        System.out.println("First value: " + alNumbers.getFirst());
        System.out.println("Last value: " + alNumbers.getLast());
        System.out.println(alNumbers);

        // inserting a value at a desired position in the list
        alNumbers.add(2, 112233);
        System.out.println("After adding 112233 at index 2 of the list");
        System.out.println("Total values: " + alNumbers.size());
        System.out.println("First value: " + alNumbers.getFirst());
        System.out.println("Last value: " + alNumbers.getLast());
        System.out.println(alNumbers);

        // check if a number exists
        int foundAtIndex = alNumbers.indexOf(157);
        if( foundAtIndex != -1 ){
            System.out.println("157 is at index " + foundAtIndex);
        }

        // remove a value from the list [removes only the first occurrence]
        alNumbers.remove(Integer.valueOf(157));
        System.out.println("After removing 157");
        System.out.println(alNumbers);

        // remove all occurrences of a value from the list
        ArrayList<Integer> alValuesToRemove = new ArrayList<>();
        alValuesToRemove.add(1157);
        alValuesToRemove.add(58787);

        alNumbers.removeAll(alValuesToRemove);
        System.out.println("After removing 1157 and 58787");
        System.out.println(alNumbers);

        // create an array list to hold words of a string

        // input from user
        Scanner inputLine = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String text = inputLine.nextLine();

        // the line of text should be taken an input from the user
        ArrayList<String> alWords = new ArrayList<>(List.of(text.split(" ")));
        System.out.println("ArrayList of words: " + alWords);

        // remove all "the" from the list
        alWords.removeAll(List.of(new String[]{"the"}));
        System.out.println("ArrayList of words: " + alWords);

        // Using array list to store objects of user defined class
        ArrayList<Car> alCars = new ArrayList<>();

        alCars.add(new Car());
        alCars.add(new Car(100.5, 200.5, 11, "Yellow"));

        System.out.println(alCars);
    }

}
