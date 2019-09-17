/* Exceptions can only be
detected at run time.
 */

// Let's demonstrate by dividing two integers.

/*
import java.util.Scanner;

class ExceptionEx {
    public static void main(String[] args) {

        int a, b, result;

        Scanner input = new Scanner(System.in);
        System.out.println("Input two integers");

        a = input.nextInt();
        b = input.nextInt();

        result =  a / b;

        System.out.println("Result = " + result);
    }
}
 */

/* While dividing by 0, we encountered
an exception error, let prevent it.
 */

// Java exception handling example.

/*
import java.util.Scanner;

class ExceptionEx {
    public static void main(String[] args) {

        int a, b, result;

        Scanner input = new Scanner(System.in);
        System.out.println("Input two integers");

        a = input.nextInt();
        b = input.nextInt();

        // try block

        try {
            result = a / b;
            System.out.println("Result = " + result);
        }
        // catch block

        catch (ArithmeticException e){
            System.out.println("Exception caught: Divison by zero.");
        }
    }
}
 */

// It's imperative to work to
// take care of all of the exceptions

/*
class ExceptionEx {
    public static void main(String[] args) {

        String languages[] = { "C", "C++", "Java", "Perl", "Python" };


         try {

             for (int c = 1; c <= 5; c++) {
                 System.out.println(languages[c]);
             }
         }


         catch (Exception e) {
             System.out.println(e);
         }
    }
}
 */

/* Once an exception is thrown control
comes out of tru block and
remaining instructions of try block will
not be executed
 */


class ExceptionEx {

    public static void main(String[] args) {
        try {
            long data[] = new long[1000000000];
        }
        catch (Exception e) {
            System.out.println(e);
        }

        finally {
            System.out.println("Finally block will execute always");
        }

    }
}

// An exception occured because we try
// to allocate a large amount of memory which isn't available.

