/* This java program will
calculate simple interest
 */

import java.util.Scanner;
public class SimpleInterest {
    public static void main(String args[]) {

        float p, r, t, sinterest;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the principal : ");
        p = scan.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = scan.nextFloat();
        System.out.print("Enter the time period : ");
        t = scan.nextFloat();
        scan.close();
        sinterest = (p * r * t) / 100;
        System.out.print("Simple Interest is: " +sinterest);
    }
}