/* A few techniques to convert
a map to a list in java.
 */

/*
import java.util.*;

public class ConvertMapList {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");

        List<Integer> keyList = new ArrayList(map.keySet());
        List<String> valueList = new ArrayList(map.values());

        System.out.println("Key List: " + keyList);
        System.out.println("Value List: " + valueList);
    }
}

 */

// convert Map to List using stream

import java.util.*;
import java.util.stream.Collectors;

public class ConvertMapList {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");


        List<Integer> keyList = map.keySet().stream().collect(Collectors.toList());
        List<String> valueList = map.values().stream().collect(Collectors.toList());

        System.out.println("Key List:" + keyList);
        System.out.println("Value List: " + valueList);

    }
}
