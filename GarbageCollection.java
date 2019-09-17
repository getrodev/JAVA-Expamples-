/* Garbage collection is done using
gc method of RunTime class.
 */

import java.util.*;

class GarbageCollection {
    public static void main(String s[]) throws Exception {
        // we will use the gc method of the RunTime class
        // getRunTime method is used to returns the amount of
        // free memory in JVM
        Runtime rs = Runtime.getRuntime();
        System.out.println("Free memory in JVM before Garbage Collection = "+rs.freeMemory());
        // gc method of RunTime class
        rs.gc();
        System.out.println("Free memory in JVM after Garbage Collection = "+rs.freeMemory());

    }
}