/* We will convert an array to
a set and vice versa
 */

/*

import java.util.*;

public class ConvertArraySet {

    public static void main(String[] args) {

        String[] array = {"a", "b", "c"};
        Set<String> set = new HashSet<>(Arrays.asList(array));

        System.out.println("Set: " = set);
    }
}

/* To convert array to set, we first
convert it to a list using asList() as HashSet
accepts list as a constructor
 */

// Convert Array to Set using stream

/*
import java.util.*;

public class ConvertArraySet {

    public static void main(String[] args) {

        String[] array = {"a", "b", "c"};
        Set<String> set = new HashSet<>(Arrays.stream(array).collect(Collectors.toSet()));

        System.out.println("Set: " + set)
    }
}
 */


import java.util.*;

public class ConvertArraySet {

    public static void main(String[] args) {

        Set<String> set =  new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");

        String[] array = new String[set.size()];
        set.toArray(array);

        System.out.println("Array: " + Arrays.toString(array));
    }
}