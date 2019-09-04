/*
Demonstrates the behavior of value parameters
In Java all parameters are passed by value.
*/
public class PrimitiveParameters {
    public static void main( String[] args) {
        go();
    }

    public static void go() {
        int x = 3;
        int y = 2;
        System.out.println("In method go. x: " + x + "y: " +y);
        falseSwap(x,y);
        System.out.println("in method go. x: " + x + "y: " + y);
        moreParameters(x,y);
        System.out.println("in mehtod go. x: + x + " y: " + y ");
    }

    public static void falseSwap(int x, int y) {
        System.out.println("in method falseSwap. x: " + x + " y: " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("in method falseSwap. x: " + x = ' ')
    }
}