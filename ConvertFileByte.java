// Let's convert a File object to byte[] and vice versa

/*
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ConvertFileByte {

    public static void main(String[] args) {

        String path = System.getProperty("user.dir") + "\\src\\test.txt";

        try {
            byte[] encoded = Files.readAllBytes(Paths.get(path));
            System.out.println(Arrays.toString(encoded));
        } catch (IOException e) {

        }
    }
}
 */

// The program below is the inverse of the program above

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ConvertFileByte {

    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "\\src\\test.txt";
        String finalPath = System.getProperty("user.dir") + "\\src\\final.txt";

        try {
            byte[] encoded = Files.readAllBytes(Paths.get(path));
            Files.write(Paths.get(finalPath), encoded);
        } catch (IOException e) {

        }