// Find GCD of two numbers using while loop
/*
public class GCD {
    public static void main(String[] args) {

        int n1 = 81, n2 = 153, gcd = 1;

        for(int i = 1; i <= n1 && i <= n2; i++) {

            // checks if i is factor of both integers
            if(n1 % i == 0 && n2 % i==0)
                gcd = i;
        }
        System.out.printf("G.C.D of %d and %d is %d ", n1, n2, gcd);
    }
}
 */

/*

public class GCD {
    public static void main(String[] args) {

        int n1 = 81, n2 = 153;

        while(n1 != n2) {
            if(n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }
        System.out.println("G.C.D = " + n1);
    }
}

 */

// GCD for both positive and negative numbers

public class GCD {
    public static void main(String[] args) {
        int n1 = 81, n2 = -153;

        // Always set to positive
        n1 = ( n1 > 0) ? n1 : -n1;
        n2 = ( n2 > 0) ? n2 : -n2;

        while(n1 != n2) {
            if(n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }
        System.out.println("G.C.D = " + n1);
    }
}