package day05_arithmetic;

public class KgToPounds {
    /*create a class called KgTopounds, and write a program that can convert Kg to pound and print the result
            Ex:
                kg = 10;
                output:
                    10 kg equal to 22.0462 pounds
                kg = 20
                output:
                    20 kg equal to 44.0924 pounds
                ....
            Hint: 1kg = 2.20462 pounds

     */
    public static void main(String[] args) {
        int kg= 10;
        System.out.println(kg * 2.20462 );
        int kg2 = 20;
        System.out.println(kg2 * 2.20462);

        System.out.println("------");

        //alternate solution:
        double a = 10;
        double b = a * 2.20462;
        System.out.println(b);


        double c = 20;
        double d = c* 2.20462;
        System.out.println(d);






    }
}
