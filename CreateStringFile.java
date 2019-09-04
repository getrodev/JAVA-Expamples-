/* Here are a few different techniques to create
a string from conjtents of a given file in Java
 */


import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CreateStringFile {

    public static void main(String[] args) throws IOException {

        // readAllLines may also throw an IOEXception

        String path = System.getProperty("user.dir") + "\\src\\test.txt";
        Charset encoding = Charset.defaultCharset();

        List<String> lines = Files.readAllLines(Paths.get(path), encoding);
        System.out.println(lines);

    }
}

/*

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CreateStringFile {

    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir") + "\\src\\test.txt";
        Charset encoding = Charset.defaultCharset();

        byte[] encoded = Files.readAllBytes(Paths.get(path));
        String lines = new String(encoded, encoding);
        System.out.println(lines);
    }
}


 */


