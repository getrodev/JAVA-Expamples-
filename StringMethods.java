/*
class StringMethods {

    // Constructor method

    StringMethods() {
        System.out.println("Constructor method is called when an object of it's class is created");
    }

    // Main method where program execution begins

    public static void main(String[] args) {
        staticMethod();
        StringMethods object = new StringMethods();
        object.nonStaticMethod();
    }

    // Static method
    static void staticMethod() {
        System.out.println("Static method can be called without creating object");
    }


    // Non static method
    void nonStaticMethod() {
        System.out.println("Non static method must be called by creating an object");
    }
}
 */

class StringMethods {

    public static void main(String args[]) {
        int n;
        String s = " Java programming", t = "", u = "";

        System.out.println(s);

        // Find length of string

        n = s.length();
        System.out.println("Number of characters = " + n);

        // Replace characters in string

        t = s.replace("Java", "C++");
        System.out.println(s);
        System.out.println(t);

        // Concatenating string with another string

        u = s.concat(" is fun");
        System.out.println(s);
        System.out.println(u);
    }
}