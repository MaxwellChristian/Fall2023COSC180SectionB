package lo_functional_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class StreamDemo1 {

    public static void main(String[] args) {

        int[] values = {12, 19, 2394, 28, 95, 194, 11, 51};

        // display all values larger than 50
        for (int value : values) {
            if (value > 50) {
                System.out.println(value);
            }
        }

        int[] alValuesL50 = Arrays.stream(values).filter(value -> value > 50).toArray();
        System.out.println("Values > 50: " + Arrays.toString(alValuesL50));

        // count of values
        System.out.println("Count: " + Arrays.stream(values).count());

        // min value
        System.out.println("Min: " + Arrays.stream(values).min().getAsInt());

        // max value
        System.out.println("Max: " + Arrays.stream(values).max().getAsInt());

        // average value
        System.out.println("Average: " + Arrays.stream(values).average().getAsDouble());

        String[] words = "welcome to the test of JAVA As JAVA is always easy to test".split(" ");
        System.out.println("Words: " + Arrays.toString(words));

        // store first four words
        String[] first4 = new String[4];
        for (int i = 0; i < 4 && i < words.length; i++) {
            first4[i] = words[i];
        }

        System.out.println("First 4 words: " + Arrays.stream(words).limit(4).toList());

        // display first four words [sorted]
        System.out.println("First 4 words [sorted]: " + Arrays.stream(words).limit(4).sorted().toList());

        // display first four sorted words
        System.out.println("First 4 sorted words: " + Arrays.stream(words).sorted().limit(4).toList());

        // display first four sorted words [unique words only]
        System.out.println("First 4 sorted words: " +
                Arrays
                        .stream(words)
                        .sorted()
                        .distinct()
                        .limit(4)
                        .toList()
        );

        // display the count of unique words
        System.out.println("Total unique words: " + Arrays.stream(words).distinct().count());

        // display all words with length >= 3
        System.out.println("Words [length >= 3]: " +
                Arrays.stream(words)
                        .filter(token -> token.length() >= 3)
                        .toList()
        );

        // display all words sorted [ignoring the case and not using the first 4 words]

        // lambda : (o1, o2) -> o1.compareToIgnoreCase(o2)
        System.out.println("Skipping first 4 words [sorted words ignoring case]: " +
                Arrays.stream(words)
                        .skip(4)
                        .sorted(String::compareToIgnoreCase)
                        .toList()
        );

        // get the largest word with length >= 3
        System.out.println("Largest word [with length >= 3]: " +
                Arrays.stream(words)
                        .filter(s -> s.length() >= 3)
                        .max(String::compareTo)
                        .get()
                );

        // get the smallest word [alphabetically smallest]
        System.out.println("Smallest word [alphabetically]: " +
                Arrays.stream(words)
                        .sorted()
                        .min(String::compareToIgnoreCase)
                        .get()
                );

        // check and return the status of whether all names start with a capital alphabet
        System.out.println("Are all words starting with capital: " +
                        Arrays.stream(words)
                                .allMatch(s -> Character.isUpperCase(s.charAt(0)))
                );
        // display all words not starting with capital
        System.out.println("All words starting with capital: " +
                Arrays.stream(words)
                        .filter(s -> Character.isUpperCase(s.charAt(0)))
                        .toList()
        );

        // check and return the status where no word begins with JA
        System.out.println("No words starting with 'JA': " +
                Arrays.stream(words)
                        .noneMatch(s -> s.startsWith("JA"))
        );

        // get the first element in the stream
        System.out.println("First element: " + Arrays.stream(words).findFirst().get());

        // display the first element of the stream in lowercase
        // System.out.println("First element: " + Arrays.stream(words).findFirst().get().toLowerCase());
        System.out.println("First element: " + Arrays.stream(words).map(String::toLowerCase).findFirst().get());

        // display all words in lower case
        System.out.println("All [lower case]: " + Arrays.stream(words).map(String::toLowerCase).toList());

        // write a method which takes words as parameters and returns an array consisting of all words in lowercase
        String []lowerCaseWords = toLowerCase(words);

        // display all words with length >= 3 in the format word:word_length
        Arrays.stream(words)
                .filter(s -> s.length() >= 3)
                .forEach( s -> System.out.printf("%s: %d\n", s, s.length()) );

    }

    private static String[] toLowerCase(String[] words) {
        // return (String[]) Arrays.stream(words).map(String::toLowerCase).toArray();
        return Arrays.stream(words).map(String::toLowerCase).toArray(String[]::new);
    }

}
