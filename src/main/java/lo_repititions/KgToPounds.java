package lo_repititions;

// display conversion of KG to POUNDS
// starting from 1 to 199 KGS
// step by 2 KGs

public class KgToPounds {

    public static void main(String []arsg) {

        final double conversionRate = 2.2;
        int kg;

        for( kg = 1 ; kg <= 199 ; kg += 2 ){
            System.out.printf("%3d : %5.1f\n", kg, ( kg * conversionRate ) );
        }

    }

}
