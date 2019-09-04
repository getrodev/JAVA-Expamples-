// tound a number using format

/*
public class Decimal {
    public static void main(String[] args) {
        double num = 1.34567;
        System.out.format("%.4f", num);
    }
}
 */

// Round a number using a DecimalFormat

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Decimal {
    public static void main(String[] args) {
        double num = 1.34567;
         DecimalFormat df = new DecimalFormat("#.###");
         df.setRoundingMode(RoundingMode.CEILING);

         System.out.println(df.format(num));
    }
}