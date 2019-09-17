/*
public class SwapNumbers {
    public static void main(String[] args) {

        float first = 1.20f, second = 2.45f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Seconds number = " + second );

        // Value of first is assigned to temporary
        float temporary = first;

        // Value of second is assigned to first
        first = second;

        // Value of temporary (which contains the initial value of first) is assigned
        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}
 */

// Swapping using temporary or third variable

/*
import java.util.Scanner;

class SwapNumbers {

    public static void main(String[] args) {
        int x, y, temp;
        System.out.println("Enter x and y");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();

        System.out.println("Before Swapping\nx = "+x+"\ny = "+y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("After Swapping\nx = "+x+"\ny = "+y);
    }
}
 */

//Swapping without temporary variable

import java.util.Scanner;

class SwapNumbers {
    public static void main(String[] args) {

        int x, y;
        System.out.println("Enter x and y");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();

        System.out.println("Before Swapping\nx = "+x+"\ny = "+y );

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swapping\nx = "+x+"\ny = "+y);
    }
}