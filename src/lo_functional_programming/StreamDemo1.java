package lo_functional_programming;

import java.util.Arrays;

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

        String[] words = "welcome to the test of JAVA as JAVA is always easy to test".split(" ");
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

    }

}
