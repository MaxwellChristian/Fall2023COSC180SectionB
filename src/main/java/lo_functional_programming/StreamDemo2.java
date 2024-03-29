package lo_functional_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamDemo2 {

    public static void main(String[] args) {

        // values
        int[] values = {3, 4, 1, 5, 20, 1, 3, 3, 4, 6};

        System.out.println("Values: " + Arrays.toString(values));

        // adding each value i.e. ans = v1 + v2 ... + vN
        System.out.println("Values [sum]: " + Arrays.stream(values).sum());

        // multiplying each value i.e. ans = v1 * v2 ... * vN
        System.out.println("Values [mul]: " + Arrays.stream(values)
                .reduce(1, (left, right) -> left * right));

        // display as CSV
        System.out.println("Values [CSV]: " +
                Arrays.stream(values)
                        .mapToObj(String::valueOf)
                        .reduce((s1, s2) -> s1 + ", " + s2)
                        .get()
        );


        String[] names = {"John", "Peter", "Susan", "Kim", "Jen",
                "George", "Alan", "Stacy", "Michelle", "john"};

        // count number of characters of all names
        System.out.println("Number of characters in all names: " +
                Arrays.stream(names)
                        .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                        .length()
        );

        // all names [into ArrayList]
//        ArrayList<String> al = (ArrayList<String>) Arrays.stream(names)
//                .toList();

        System.out.println("In ArrayList [all names]: " +
                Arrays.stream(names)
                        .collect(ArrayList::new, ArrayList::add, ArrayList::addAll)
        );

        // fetch a set of all ames [all names should be in upper case]
        System.out.println("In Set [all names]: " +
                Arrays.stream(names)
                        .map(String::toUpperCase)
                        .collect(Collectors.toSet())
        );

        // all names [into Map]
        System.out.println("In Map [all names]: "
                + Arrays.stream(names)
                .collect(Collectors.toMap(s -> s, String::length))
        );

        // count of all characters in all names
        System.out.println("Number of characters in all names: "
                + Arrays.stream(names)
                .collect(Collectors.summarizingInt(String::length))
        );
    }

}
