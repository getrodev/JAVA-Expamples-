// Java Program to Append Text to an Existing File

/*
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AppendTextFile {

    public static void main(String[] args) {

        String path = System.getProperty("user.dir") + "\\src\\test.txt";
        String text = "Added text";

        try {
            Files.write(Paths.get(path), text.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {

        }
    }
}
 */

// Same program as above but using FileWriter

import java.io.FileWriter;
import java.io.IOException;

public class AppendTextFile {

    public static void main(String[] args) {

        String path = System.getProperty("user.dir") + "\\src\\test.txt";
        String text = "Added text";

        try {
            FileWriter fw = new FileWriter(path, true);
            // true means we allow the file to be appended
            fw.write(text);
            fw.close();
        }
        catch(IOException e) {
        }
    }
}