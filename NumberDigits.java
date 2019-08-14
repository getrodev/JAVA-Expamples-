// count number of digits in an integer using while loop

/*
public class NumberDigits {
    public static void main(String[] args) {

        int count = 0, num = 3452;

        while(num != 0) {

            // num = num/10
            num /= 10;
            ++count;
        }
        System.out.println("Number of digits: " + count);
    }
}
 */

// Same program using an for loop

public class NumberDigits {

    public static void main(String[] args) {
        int count = 0, num = 123456;

        for(; num != 0; num/=10, ++count) {
        }
        System.out.println("Number of digits: " + count);
    }
}