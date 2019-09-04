/* Compute quotient and remainder from
the given divisor in Java.
 */
public class QuotientRemainder {
    public static void main(String[] args) {

        int dividend = 25, divisor = 4;

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}