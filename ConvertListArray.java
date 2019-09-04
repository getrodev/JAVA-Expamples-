/* We will convert a list to an array using
toArray() and vice versa with asList();
 */

/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListArray {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");

        String[] array = new String[list.size()];
        list.toArray(array);

        System.out.println(Arrays.toString(array));
    }
}

 */

// Convert Array to list this time with asList()

import java.util.Arrays;
import java.util.List;

public class ConvertListArray {

    public static void main(String[] args) {

        String[] array = {"a", "b"};
        List<String> list = Arrays.asList(array);

        System.out.println(list);
    }
}