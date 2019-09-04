/* We will calculate the power of
a number using a recursive function in java.
 */

public class Power {

    public static void main(String[] args) {
        int base = 3, powerRaised = 4;
        int result = power(base, powerRaised);

        System.out.printf("%d^%d = %d \n", base, powerRaised, result);
    }

    // The recursive function mutiplies the base with itself
    // ... for powerRaised times
    public static int power(int base, int powerRaised) {
        if (powerRaised != 0 )
            return (base * power(base, powerRaised - 1));
        else
            return 1;
    }
}