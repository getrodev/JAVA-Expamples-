// Let's convert Milliseconds to minutes and seconds
/*
import java.util.concurrent.TimeUnit;

public class MilliMiniSec {

    public static void main(String[] args) {
        long milliseconds = 1000000;

        // long minutes = (milliseconds / 1000) / 60;
        long minutes = TimeUnit.MILLISECONDS.toMinutes(milliseconds);

        // long seconds  = (milliseconds / 1000);
        long seconds = TimeUnit.MILLISECONDS .toSeconds(milliseconds);

        System.out.format("%d Milliseconds = %d minutes\n", milliseconds, minutes );
        System.out.println("Or");
        System.out.format("%d Milliseconds = %d seconds", milliseconds, seconds );

    }
}

 */

// Convert Milliseconds to minutes and seconds

public class MilliMiniSec {
    public static void main(String[] args) {
        long milliseconds = 1000000;

        long minutes = (milliseconds / 1000) / 60;
        long seconds = (milliseconds / 1000) % 60;

        System.out.format("%d Milliseconds = %d minutes and %d seconds.", milliseconds, minutes, seconds);
    }
}