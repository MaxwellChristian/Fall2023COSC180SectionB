package lo_repititions;

/*
* Write a program which shows the tuition increase for next 10 years.
* Each year the tuition increases by 3.5%
* */
public class TuitionTrend {

    public static void main(String []args){

        int year;
        double tuition = 9610;
        final double increaseRate = 3.5 / 100 ;

        for( year = 2023 ; year <= 2033 ; ++year ){

            System.out.printf("%4d : %.0f\n", year, tuition);

            // calculate the increased tuition
            tuition = tuition + ( tuition * increaseRate );

        }

    }

}
