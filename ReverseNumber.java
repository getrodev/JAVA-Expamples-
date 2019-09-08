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

/*
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
 */

/*
// Reverse a number using while Loop

import java.util.Scanner;
class ReverseNumber {
    public static void main(String args[])
    {
        int num = 0;
        int reversenum = 0;
        System.out.println("Input your number and press enter: ");
        //This statement will capture the user input
        Scanner in = new Scanner(System.in);
        // Captured input would be stored in number num
        num = in.nextInt();
        //While Loop: Logic to find out the reverse number
        while( num != 0 ) {
            reversenum = reversenum * 10;
            reversenum = reversenum + num%10;
            num = num/10;
        }

        System.out.println("Reverse of input number is: "+reversenum);
    }
}

 */

// Reverse a number using for loop

/*
import java.util.Scanner;

class ReverseNumber  {
    public static void main(String args[]) {
        int num = 0;
        int reversenum = 0;
        System.out.println("Input your number and press enter: ");
        //This statement will capture the user input
        Scanner in = new Scanner(System.in);
        // Captured input would be store in number num
        num = in.nextInt();

        /*  for loop: No initiallization part as num is already
        initialized and no increment/decrement part as logic
        num = num/10 already decrements teh value of num


        for( ;num != 0; ) {
            reversenum = reversenum * 10;
            reversenum = reversenum + num%10;
            num = num/10;
        }

        System.out.println("Reverse of specified number is: "+reversenum);
    }

}
*/

// Let's reverse an already initialized number sans user input
class ReverseNumber {

    public static void main(String args[]) {
        int num = 123456789;
        int reversenum = 0;
        while( num != 0) {
            reversenum = reversenum * 10;
            reversenum = reversenum + num%10;
            num = num / 10;
        }

        System.out.println("Reverse of specified number is: "+ reversenum);
    }
}