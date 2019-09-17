// How to open Notepad using Java program ?

import java.util.*;
import java.io.*;

class OpenNote {
    public static void main(String[] args) {
        Runtime rs = Runtime.getRuntime();

        try {
            rs.exec("notes");
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}

