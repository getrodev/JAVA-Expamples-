// Power of a number using a while loop

/*
public class PowerNum {
    public static void main(String[] args) {
        int base = 3, exponent = 4;

        long result = 1;

        while (exponent != 0) {
            result *= base;
            --exponent;
        }
        System.out.println("Answer = " + result);
    }
}

 */

// power of a number using a for loop

/*

public class PowerNum {
    public static void main(String[] args) {

        int base = 3, exponent = 4;

        long result = 1;

        for (;exponent != 0; --exponent) {
            result *= base;
        }
        System.out.println("Answer = " + result);
    }
}

 */
 /* if you have a negative exponent,
 you need to use the pow() function
 in java standard library
  */

 public class PowerNum {

     public static void main(String[] args) {

         int base = 3, exponent = -4;
         double result = Math.pow(base, exponent);

         System.out.println("Answer = " + result);

     }
 }