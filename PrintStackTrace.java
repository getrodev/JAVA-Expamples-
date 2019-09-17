/* Let's convert stack t
race to a string in java of course
 */

import java.io.PrintWriter;
import java.io.StringWriter;

public class PrintStackTrace {

    public static void main(String[] args) {

        try {
            int division = 0 / 0;
        } catch (ArithmeticException e) {
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAsString = sw.toString();
            System.out.println(exceptionAsString);
        }
    }
}

/* We have forced our program to
throw ArithmeticException by dividing 0 by 0
 */