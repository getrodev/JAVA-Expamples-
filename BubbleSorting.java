/* Compare adjacent strings, and if they are not in the order
then we need to swap those strings.
 */

public class BubbleSorting {
    public static void main(String[] args) {
        String str[] = {"Ajeet", "Steeve", "Rick", "Becky", "Mohan"};
        String temp;
        System.out.println("Strings in sorted order:");
        for (int j = 0; j < str.length; j++) {
            for (int i = j + 1; i < str.length; i++) {
                // comparing adjacent strings

                if (str[i].compareTo(str[j]) < 0) {
                    temp = str[j];
                    str[j] = str[i];
                    str[i] = temp;
                }
            }
            System.out.println(str[j]);
        }
    }
}