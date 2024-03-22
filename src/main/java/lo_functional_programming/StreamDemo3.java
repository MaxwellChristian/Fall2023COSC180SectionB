package lo_functional_programming;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class StreamDemo3 {

    public static void main(String[] args) {

        // create 5 objects of class CSTStudent
        // the class CSTStudent should store
        // first name
        // last name
        // program name
        // age
        // scored grade

        CSTStudent[] students = {
                new CSTStudent("AA1", "AA2", "CST", 45, 89),
                new CSTStudent("BB1", "BB2", "CNT", 25, 79),
                new CSTStudent("CC1", "CC2", "CAST", 55, 55),
                new CSTStudent("DD1", "DD2", "CNT", 35, 49),
                new CSTStudent("EE1", "EE2", "CST", 25, 92),
        };

        // using streams provide the following
        // average grade of students for every program
        Arrays.stream(students)
                .collect(Collectors.groupingBy(CSTStudent::getProgramName, TreeMap::new, Collectors.averagingDouble(CSTStudent::getScore)))
                .forEach((program, aDoubleScore) -> System.out.printf("%-10s %4.2f\n", program, aDoubleScore));

    }

}
