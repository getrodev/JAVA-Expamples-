// reverse a number using a while loop
/*
public class ReverseNumber {

    public static void main(String[] args) {

        int num = 1234, reverse = 0;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed: " + reversed);
    }
}

 */

// reverse a number using a for loop

public class ReverseNumber {
    public static void main(String[] args) {

        int num = 1234567, reversed = 0;

        for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}