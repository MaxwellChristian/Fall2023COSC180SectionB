package lo_methods;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

    public static void main(String []args){

        String text = "Welcome to JAVA. JAVA    is easy if practiced.";
        StringTokenizer tokenizer = new StringTokenizer(text, " ");

        System.out.println("Total spaces : " + (tokenizer.countTokens()-1) );

        while (tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();   // by SPACE
            // String token = tokenizer.nextToken("."); // by DOT

            token = token.trim();

            System.out.println( token );
            //System.out.println( new StringBuilder(token).reverse() ); // displaying the reverse

        }

        text = "1,     Maxwell,,,Christian    ,,CST";
        tokenizer = new StringTokenizer(text, ",");
        while (tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();

            token = token.trim();

            System.out.println( token );

        }




    }

}
