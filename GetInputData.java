// Let's get input from the user

/*
import java.util.Scanner;

class GetInputData {

    public static void main(String args[]) {
        int num;
        float fnum;
        String str;

        Scanner in = new Scanner(System.in);

        // Get input String
        System.out.println("Enter a string: ");
        str = in.nextLine();
        System.out.println("Input String is: "+str);

        // Get input Integer
        System.out.println("Enter an integer: ");
        num = in.nextInt();
        System.out.println("Input Integer is: "+num);

        // Get input float number
        System.out.println("Enter a float number: ");
        fnum = in.nextFloat();
        System.out.println("Input Float number is: "+fnum);
    }
}

 */

import java.util.Scanner;

class GetInputData {
    public static void main(String args[]) {

        int a;
        float b;
        String s;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter an integer");
        a = in.nextInt();
        System.out.println("You entered integer " + a);

        System.out.println("Enter a float");
        b = in.nextFloat();
        in.nextLine();
        System.out.println("You entered float " + b);

        System.out.println("Enter a string");
        s = in.nextLine();
        System.out.println("You entered string " + s);
    }
}

