// Convert String to Date using predefined formatters

/*
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TimeString {

    public static void main(String[] args) {
        // Format y-M-d or yyyy-MM-d
        String string = "2017-07-25";
        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);

        System.out.println(date);
    }
}

 */

// String to Date conversion using pattern formatters
 import java.time.LocalDate;
 import java.time.format.DateTimeFormatter;
 import java.util.Locale;

 public class TimeString {
     public static void main(String[] args) {
         String string = "July 25, 2017";

         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
         LocalDate date = LocalDate.parse(string, formatter);

         System.out.println(date);

     }
 }