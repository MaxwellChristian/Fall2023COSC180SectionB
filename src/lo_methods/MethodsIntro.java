package lo_methods;

public class MethodsIntro {

    // here the name of the method is 'main'
    // the method takes a SINGLE parameter named 'args'
    // the type of the parameter is 'String []'
    // the return type of the method is 'void'
    // i.e. it does not return anything
    public static void main(String[] args) {

        int x;
        int y;

        x = 5;
        y = 7;

        // call to method 'max2'
        // passing values of x and y to 'max2'
        // so x and y are known as 'actual' parameters
        int largestNumber = max2(x, y);

        int z = 90;
        int ans = divideBy3(z);

        System.out.println(z + " divided by 3 : " + ans);

        z = 90;
        z = divideBy3(z);

        System.out.println(z + " divided by 3 : " + ans);

        ans = max3(x, y, z);
    }

    private static int max3(int v1, int v2, int v3) {
        /*
        if( v1 > v2 ){
            if( v1 > v3 ){
                return v1;
            }
            else {
                return v3;
            }
        }
        else {
            if( v2 > v3 ){
                return v2;
            }
            else {
                return v3;
            }
        }
        */

        return max2(v1, max2(v2, v3));
    }

    private static int divideBy3(int value) {
//        int result;
//        result = value / 3;
//        return result;

        //int result;
//        value = value / 3;
//        return value;

        return value/3;
    }

    // 'max2' has two parameters 'value1' and 'value2'
    // which are known as 'formal' parameters
    static int max2(int value1, int value2) {

        if( value1 > value2 ){
            return value1;
        }
        else {
            return value2;
        }

        // return 0;
    }

}
