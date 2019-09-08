/* We will ask the user to input an integer
and prints it until the user enter 0.
 */

/*
import java.util.Scanner;

class WhileLoop {
    public static void main(String[] args) {
        int n;

        Scanner input =  new Scanner(System.in);
        System.out.println("Input an integer");

        while ((n = input.nextInt()) != 0) {
            System.out.println("You entered " + n);
            System.out.println("Input an integer");
        }

        System.out.println("Out of loop");
    }
}

 */

// Same as above program using a break statement
/*
import java.util.Scanner;

class WhileLoop {
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);

        while (true) { // Condition in while loop is always true here
            System.out.println("Input an integer");
            n = input.nextInt();

            if (n == 0) {
                break;
            }
            System.out.println("You entered " + n);
        }
    }
}

 */

// Different way to leverage the break statement
import java.util.Scanner;

class WhileLoop {
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Input an integer");
            n = input.nextInt();

            if (n != 0) {
                System.out.println("You entered " + n);
                continue;
            }
            else {
                break;
            }

        }
    }
}
