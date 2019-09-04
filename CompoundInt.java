/* Let's calculate the Compound interest
 */

public class CompoundInt {

    public void calculate(int p, int t, double r, int n) {

        double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        System.out.println("Compound Interest ater " + t +" years: "+cinterest);
        System.out.println("Amount after " + t + " years: "+amount);
    }
    public static void main(String args[]) {
        CompoundInt obj = new CompoundInt();
        obj.calculate(2000, 5, .08, 12);
    }
}