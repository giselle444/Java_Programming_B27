package day05_arithmetic;

public class UpdateVariable {
    public static void main(String[] args) {

        int a = 4;
        System.out.println(a + 10);
        System.out.println(a);

        a= a + 20;
        System.out.println(a); // reassigning the value of 'a' so it is 4+20 amd now 'a' is 24

        int b = 5;
        b += 30; // this is the same as this: b = b + 30;
        System.out.println(b); //35
        System.out.println(b + 10); // equals 45 because 'b' was update to 35




    }
}
