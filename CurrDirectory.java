// Let's obtain th ecurrent working directory

/*
public class CurrDirectory {

    public static void main(String[] args) {

        String path = System.getProperty("user.dir");

        System.out.println("Workking Directory = "+  path);
    }
}


 */
// We used System's getProperty() method to get the user.dir property  of the program.

/* Same program as above, however we
are now using Path
 */

import java.nio.file.Paths;

public class CurrDirectory {

    public static void main(String[] args) {

        // Path's get() method to get the current path of our program.
        String path = Paths.get("").toAbsolutePath().toString();
        // we then change the relative path to absolute path using toAbsolutePath().

        System.out.println("Working Directory = " + path);
    }
}