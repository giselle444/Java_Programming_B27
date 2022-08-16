package day07_Scanner;

public class ShortCircuitEx {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(false && true);
       // System.out.println(5/0); you cant divide by 0

       // System.out.println( true && 5/0 == 0);
        System.out.println( false && 5/0 == 0);

        int count = 0;
        System.out.println(true || count++ ==1);
        System.out.println(count);
    }
}
