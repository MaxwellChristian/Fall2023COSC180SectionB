package lo_functional_programming.battle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class Utilities {

    public static <T> List<T> loadFromFile(String path, Function<String, T> func) {

        ArrayList<T> alReturnList = new ArrayList<>();

        // fetch each line from the file at the path specified
        try (Scanner scanner = new Scanner(new File(path))) {

            // skip the header record
            scanner.nextLine();

            // fetch each record, split the values and store into list to return
            while (scanner.hasNextLine()) {
                alReturnList.add( func.apply(scanner.nextLine()) );
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return alReturnList;
    }

    public static String[] parseCSV(String csvLine) {

        // String sPattern = ",";
        String sPattern = ",(?=([^\"]*\"[^\"]*\")*(?![^\"]*\"))";
        String[] sFields = csvLine.split(sPattern);

        for (int i = 0; i < sFields.length; i++) {
            sFields[i] = sFields[i].replace("\"", "");
        }
        return sFields;

    }

}
