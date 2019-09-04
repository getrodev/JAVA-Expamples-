// Let's check if a string is Numeric

/*
public class Numeric {
    public static void main(String[] args) {

        String string = "12345.15";
        boolean numeric = true;

        try {
            Double num = Double.parseDouble(string);
        } catch (NumberFormatException e) {
            numeric = false;
        }

        if(numeric)
            System.out.println(string + " is a number");
        else
            System.out.println(string + " is not a number");
    }
}

 */

// check if a string is numeric or no using regular expressions(regex)
public class Numeric {

    public static void main(String[] args) {

        String string = "-1234.15";
        boolean numeric = true;

        numeric = string.matches("-?\\d+(\\.\\d+)?");

        if(numeric)
            System.out.println(string + " is a number");
        else
            System.out.println(string + " is not a number");
    }
}