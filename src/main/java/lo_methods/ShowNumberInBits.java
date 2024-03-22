package lo_methods;

public class ShowNumberInBits {

    public static void main(String[] args) {

        final int MAX_BITS_TO_SHOW = 31;
        int x = 12;

        System.out.println("Max value for Integer: " + Integer.MAX_VALUE);

        showBits( x, MAX_BITS_TO_SHOW );
        System.out.println();
        // output expected
        // 00001100

        System.out.println("Binary of " + x + " : " + Integer.toBinaryString(x));
        System.out.println("Octal of " + x + " : " + Integer.toOctalString(x));
        System.out.println("Hexadecimal of " + x + " : " + Integer.toHexString(x));

    }

    private static void showBits(int number, int maxBitsToShow) {

        for( int mask = 1 << (maxBitsToShow - 1); mask >= 1 ; mask >>= 1 ) {
            System.out.print( ((number&mask) != 0) ? "1" : "0" );
        }

    }

}
