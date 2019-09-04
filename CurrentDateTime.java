/* We will learn a few different techniques
regarding how to get the current date and time
in different formats in Java.
 */

// Default format
/*

import java.time.LocalDateTime;

public class CurrentDateTime {

    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();

        System.out.println("Current Date and Time is: " + current);
    }
}

 */

// Get Current date and time with pattern

/*
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {

    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String formatted = current.format(formatter);



        System.out.println("Current Date and Time is: " + formatted);
    }
}

 */

// Using predefined constants

/*
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {

    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
        String formatted = current.format(formatter);

        System.out.println("Current Date is: " + formatted);
    }
}

 */

// This time in localized style

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class CurrentDateTime {

    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        String formatted = current.format(formatter);

        System.out.println("Current Date is: " + formatted);
    }
}