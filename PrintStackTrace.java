/* Learn to convert a stack
trace to a sting in java
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
            String exceptionAssString = sw.toString();
            System.out.println(exceptionAssString);
        }
    }
}