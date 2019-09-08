// Generate Multiplication table using for loop

/*
public class MultiplicationTable {
    public static void main(String[] args) {

        int num = 5;
        for(int i = 1; i <= 10; ++i ) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}

 */

// This time using the while loop
/*
public class MultiplicationTable {
    public static void main(String[] args) {

        int num = 9, i = 1;
        while(i <= 10) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
            i++;
        }
    }
}

 */
// Program to print multiplication table

/*
import java.util.Scanner;

class MultiplicationTable {

    public static void main(String args[]) {
        int n, c;

        System.out.println("Enter an integer to print it's multiplication table");

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("Multiplication table of " + n);

        for (c = 1; c <= 10; c++)
            System.out.println(n + "*" + c + " = " + (n*c));
    }
}

 */

import java.util.Scanner;

class MultiplicationTable {
    public static void main(String args[]) {
        int a, b, c, d;

        System.out.println("Enter range of numbers to print their multiplication tables");
        Scanner in = new Scanner(System.in);

        a = in.nextInt();
        b = in.nextInt();

        for(c = a; c <= b; c++) {
            System.out.println("Multiplication table of " +c);

            for (d = 1; d <= 10; d++) {
                System.out.println(c+"*"+d+" = "+(c*d));
            }
        }

    }
}










