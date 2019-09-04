// Program to convert Binary to octal  and vice versa
/*
public class BinaryOctal {
    public static void main(String[] args) {
        long binary = 101001;
        int octal = convertBinarytoOctal(binary);
        System.out.printf("%d in binary = %d in octal", binary, octal);
    }

    public static int convertBinarytoOctal(long binaryNumber) {
        int octalNumber = 0, decimalNumber = 0, i = 0;

        while(binaryNumber != 0) {
            decimalNumber += (binaryNumber % 10) * Math.pow(2, i);
            i++;
            binaryNumber /= 10;
        }

        i = 1;

        while (decimalNumber != 0) {
            octalNumber += (decimalNumber % 8) * i;
            decimalNumber /= 8;
            i *= 10;
        }

        return octalNumber;
    }
}
 */

/* The octal number to decimal to decimal at first.
then, the decimal number is converted to binary number.
 */

public class BinaryOctal {

    public static void main(String[] args) {
        int octal = 67;
        long binary = convertOctalToBinary(octal);
        System.out.printf("%d in octal = %d in binary", octal, binary);
    }

    public static long convertOctalToBinary(int octalNumber) {
        int decimalNumber = 0, i = 0;
        long binaryNumber = 0;

        while(octalNumber != 0) {
            decimalNumber += (octalNumber % 10) * Math.pow(8, i);
            ++i;
            octalNumber/=10;
        }
        i = 1;

        while (decimalNumber != 0) {
            binaryNumber += (decimalNumber % 2) * i;
            decimalNumber /= 2;
            i *= 10;
        }
        return binaryNumber;
    }
}