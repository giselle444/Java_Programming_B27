package day05_arithmetic;

public class WithSmallerTypes {
    public static void main(String[] args) {

        byte b1 = 5;
        byte b2 = 4;

        System.out.println(b1 + b2);

        // byte b3 = b1 + b2;  during the calculation, the values are turned to int so the result is int
        // solutions:
        int i = b1 + b2;
        System.out.println( i); //9

        byte b3 = (byte) (b1 + b2); // cast a byte in parentheses
        System.out.println(b3); //9







    }
}
