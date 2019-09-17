/*  Find the largest among three numbers
 using if ..else statement
*/

/*
public class Largest {

    public static void main(String[] args) {

        double n1 = -4.5, n2 = 3.9, n3 = 2.5;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");
        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");
        else
            System.out.println(n3 + " is the largest number.");
    }
}

 */
// Nested if..else statement

/*
public class Largest {
    public static void main(String[] args) {

        double n1 = -4.5, n2 = 3.9, n3 = 5.5;

        if(n1 >= n2) {
            if(n1 >= n3)
                System.out.println(n1 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        } else {
            if( n2 >= n3)
                System.out.println(n2 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        }
    }
}
 */

import java.util.Scanner;

class Largest {

    public static void main(String args[]) {

        int x, y, z;
        System.out.println("Enter three integers");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        if (x > y && x > z)
            System.out.println("First number is largest.");
        else if (y > x && y > z)
            System.out.println("Second number is largest");
        else if (z > x && z > y)
            System.out.println("Third number is largest.");
        else
            System.out.println("The numbers are not distinct.");
    }
}