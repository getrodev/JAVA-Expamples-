/*How to convert Char To String
and vice versa.
 */

/*
class CharToString {


    public static void main(String args[]) {

        // Method 1: Using toString() method
        char ch = 'a';
        String str = Character.toString(ch);
        System.out.println("String is: "+str);

        // Method 2: Using valueOf() method
        String str2 = String.valueOf(ch);
        System.out.println("String is : "+str2);
    }
}
 */

// converting String to Char

class CharToString { // StringToChar
    public static void main(String args[]) {

        // Using charAt() method
        String str = "Hello";
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println("Character at "+i+" Position: "+ch);
        }
    }
}