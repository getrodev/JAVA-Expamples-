// if-else statement and functions to check if string is empty

/*
public class NullString {

    public static void main(String[] args) {
        String str1 = null;
        String str2 = "";

        if(isNullOrEmpty(str1))
            System.out.println("First string is null or empty.");
        else
            System.out.println("First string is not null or empty.");

        if(isNullOrEmpty(str2))
            System.out.println("Second String is null or empty.");
        else
            System.out.println("Second string is not null or empty");
    }

    public static boolean isNullOrEmpty(String str) {
        if(str != null && !str.isEmpty())
            return false;
        return true;
    }
}

 */

// Check if String with spaces is Empty or null

public class NullString {

    public static void main(String[] args) {
        String str1 = null;
        String str2 = "      ";

        if(isNullOrEmpty(str1))
            System.out.println("Str1 is null or empty.");
        else
            System.out.println("str1 is not null or empty");

        if(isNullOrEmpty(str2))
            System.out.println("Str2 is null or empty.");
        else
            System.out.println("Str2 is not null or empty.");
    }

    public static boolean isNullOrEmpty(String str) {
        if(str != null && !str.trim().isEmpty())
            return false;
        return true;
    }
}