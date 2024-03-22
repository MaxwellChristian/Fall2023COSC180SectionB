package lo_methods;

public class ComputePI {

    public static void main(String []args) {

        int start;
        int end ;

        double result = 0 ;
        for( start = 1, end = 901; start <= end ; start += 100 ){
            System.out.println(start + "\t" + (result += computePI(start)));
        }

    }

    private static double computePI(int start) {

        boolean operation = true;
        double ans = 0;
        for( int i = 1  ; i <= (2*start-1) ; i+=2 ){
            if(operation){
                ans += ( Math.pow(-1, start+1) / (2*start - 1) );
                operation = false;
            }
            else {
                ans -= ( Math.pow(-1, start+1) / (2*start - 1) );
                operation = true;
            }

        }

        return 4 * ans;

    }

}
