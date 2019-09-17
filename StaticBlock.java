/* A static block can be used to check conditions
before execution of the main begins.
 */
/*
class StaticBlock {

    public static void main(String[] args) {
        System.out.println("Main mehtod is executed.");
    }

    static {
        System.out.println("Static block is executed before main method.");
    }
}
 */

class StaticBlock {
    public static void main(String[] args) {
        System.out.println("You are using Windows_NT operating system.");
    }

    static {
        // getenv meth returns value of an env variable.
        String os = System.getenv("OS");
        if (os.equals("Windows_NT") != true)
            System.exit(1);
    }
}