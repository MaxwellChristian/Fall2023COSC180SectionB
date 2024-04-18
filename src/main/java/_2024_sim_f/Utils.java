package _2024_sim_f;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Utils {

    private final static char TERM_CHAR = '\0';

    /**
     * Helper method for going through and parsing a CSV file.
     * This uses a lookahead regular expression statement to break
     * up the tokens and deals with the problem of a comma existing inside a quoted string.
     *
     * @param sLine
     * @return
     */

    public static String[] parseCSVLine(String sLine) {
        String sPattern = ",(?=([^\"]*\"[^\"]*\")*(?![^\"]*\"))";

        String[] sFields = sLine.split(sPattern);
        for (int i = 0; i < sFields.length; i++) {
            // Get rid of residual double quotes
            sFields[i] = sFields[i].replace("\"", "");
        }
        return sFields;
    }


    /**
     * Helper method for writing a string (as part of a record) to a random access file.
     * This method will be used as the opposite method for readStringFromRaf
     *
     * @param sVal     This is the string to write
     * @param nMaxSize This is the maximum size of characters to write
     * @param obRaf    Random Access file References
     * @throws IOException
     */
    public static void writeStringToRaf(String sVal, int nMaxSize, RandomAccessFile obRaf) throws IOException {
        // There is no method for writing a string to a random access file - we do however have writeByte which can be
        // used to write bytes out.
		// Additionally, there is a string method called getBytes that returns an array of bytes

        byte[] aWriteBytes = sVal.getBytes();

        int i = 0;

        for (; i < Math.min(aWriteBytes.length, nMaxSize); i++) {
            obRaf.writeByte(aWriteBytes[i]);
        }

        for (; i < nMaxSize; i++) {
            obRaf.writeByte(TERM_CHAR);
        }

    }

    /**
     * Utility file for reading a string from a file that was written by writeStringToRaf
     *
     * @param nMaxSize Max chars to read
     *                 * @param obRaf Random access file
     * @return
     */
    public static String readStringFromRaf(int nMaxSize, RandomAccessFile obRaf) throws IOException {

        byte[] aReadBytes = new byte[nMaxSize];

        obRaf.read(aReadBytes);

        String sReturn = new String(aReadBytes);

        int nPos = sReturn.indexOf(TERM_CHAR);

        if (nPos != -1) {
            return sReturn.substring(0, nPos);
        } else {
            return sReturn;
        }


    }

    public static <T> List<T> genCSVRead(String sFile, Function<String, T> fn) {
        List<T> aReturn = null;
        try (BufferedReader obReader = new BufferedReader(new FileReader(sFile))) {
            aReturn = obReader.lines().skip(1).map(fn).collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        return aReturn;
    }

    /**
     * Method for reading a CSV File; using a streams based approach
     *
     * @param sFileName
     * @param func
     * @param <T>
     * @return
     */
    public static <T> List<T> genListLoad(String sFileName, Function<String, T> func) {
        List<T> retList = null;
        try (BufferedReader obIn = new BufferedReader(new FileReader(sFileName))) {
            retList = obIn.lines().skip(1).map(func).toList();
        } catch (IOException exp) {
            exp.printStackTrace();
        }

        return retList;

    }

}
