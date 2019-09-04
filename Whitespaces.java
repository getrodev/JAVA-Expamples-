/* Let's learn how to remove all whitespaces
 in a given string using regular expressions
 */

public class Whitespaces {

    public static void main(String[] args) {
        String sentence = "T    his  is b   ett     er.";
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence);
    }
}

//\\s finds all white space characters (tabs, spaces, new line character)