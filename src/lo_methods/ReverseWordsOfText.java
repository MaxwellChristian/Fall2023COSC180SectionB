package lo_methods;

import java.util.StringTokenizer;

public class ReverseWordsOfText {

    public static void main(String[] args) {

        String text = "The quick brown fox jumps over the lazy dog. This is the second line";

        for (String word :
                text.split(" ")) {
            System.out.println(word + " ");
        }

        // store all words to a string array
        String[] words = text.split(" ");
        for( String word: words ){
            System.out.print( new StringBuilder(word).reverse() + "-" );
        }
        System.out.println();

        for( int pos= words.length-1 ; pos >= 0 ; pos-- ){
            System.out.print(words[pos] + " ");
        }
        System.out.println();

        // display reverse of each line
        for( String line :  text.split("\\.") ){
            System.out.println( "Line: " + new StringBuilder(line).reverse() );
        }

        // display all characters from the text
        String []characters = text.split("");
        for (String ch: characters) {
            System.out.print(ch + "/");
        }

    }

}
