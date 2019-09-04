// Find out the duplicate characters in a string
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Details {
    public void countDupChars(String str) {

        // Create a HashMap
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        // Convert the String to char array
        char[] chars = str.toCharArray();

        /* logic: char are inserted as keys and teir count
        as values. If map contains the char already then
        increase the value by 1
         */

        for(Character ch:chars){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+ 1);
            } else {
                map.put(ch, 1);
            }
        }

        // Obtaining set of keys
        Set<Character>keys = map.keySet();

        /* Dispay count of chars if it si
        greater than 1. Al duplicate chars would be
        having value greater thatn 1.
         */

        for(Character ch:keys){
            if(map.get(ch) > 1) {
                System.out.println("Char "+ch+" "+map.get(ch) );
            }
        }
    }

    public static void main(String a[]) {
        Details obj = new Details();
        System.out.println("String: BeginnerBook.com");
        System.out.println("-------------------------");
        obj.countDupChars("BeginnersBook.com");

        System.out.println("\nString: ChaitanyaSingh");
        System.out.println("-------------------------");
        obj.countDupChars("ChaitanyaSingn");

        System.out.println("\nString: #@$@!#$%!!%@");
        System.out.println("------------------------");
        obj.countDupChars("#@$@!#$%!!%@");
    }
}