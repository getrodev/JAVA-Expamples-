// Static Method example program
/* we write static keyword when defining main mehtod because a
progarm execution begins from main an no object has been created.
 */
/*
class StaticInstance {
    public static void main(String[] args) {
        display();
    }

    static void display() {
        System.out.println("Java is my favorite language.");
    }
}
 */

// Instance method requires an object of its class
// to be created before it can be called while

/*
class StaticInstance {

    public static void main(String[] args) {
        display();  // calling without object
        StaticInstance t = new StaticInstance();
        t.show(); // calling using object
    }

    static void display() {
        System.out.println("Programming is amazing.");
    }

    void show() {
        System.out.println("Java is awesome");
    }

}
 */

// Using static method of another class?
// Then you have to write the class name while calling it.

import java.lang.Math;

class StaticInstance {

    public static void main(String[] args) {
        int result;

        result = Math.min(10, 20); // calling static method min by writing class name

        System.out.println(result);
        System.out.println(Math.max(100, 200));
    }
}










