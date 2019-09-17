// The simplest construction of a constructor
/*
class Programming {
    // constructor method
    Programming() {
        System.out.println("Constructor method called.");
    }

    public static void main(String[] args) {
        Programming object = new Programming(); // Creating an object
        System.out.println(object);
    }
}
 */

/*
class Programming  {
    String name;

    Programming() {
        System.out.println("Constructor method called.");
    }

    Programming(String t) {
        name = t;
    }

    public static void main(String[] args) {
        Programming cpp = new Programming();
        Programming java = new Programming("Java");

        cpp.setName("c++");

        java.getName();
        cpp.getName();
    }

    void setName(String t) {
        name = t;
    }

    void getName() {
        System.out.println("Language name: " + name);
    }

}
 */


// Java constructor chaining

class GrandParent {
    int a;

    GrandParent(int a) {
        this.a = a;
    }
}

class Parent extends GrandParent {
    int b;

    Parent(int a, int b) {
        super(a);
        this.b = b;
    }

    void show() {
        System.out.println("GrandParent's a = " + a);
        System.out.println("Parent's b      =" + b);
    }
}

class Programming {
    public static void main(String[] args) {
        Parent object  = new Parent(8, 9);
        object.show();
    }
}














