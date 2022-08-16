package day06_operators;

public class RelationalTasks {
    public static void main(String[] args) {
        /*
        declare a speed variable
        speed limit is 50
        find out if you are speeding
        true/false
         */

        int speed = 56;
        int speedLimit = 50;
        boolean speeding = speed > speedLimit;
        System.out.println(speeding); //true i am speeding

        /*
        declare a number variable
        find out if the number is positive, negative or zero

         */

        int number = 29;
        boolean isPositive = number >0;
        boolean isNegative = number <0;
        boolean isZero = number == 0;
        System.out.println(isNegative); //false
        System.out.println(isPositive); //true
        System.out.println(isZero); //false


        /*
        define a number find out if its even or odd

         */

        int number2 = 45;
        boolean isEven= number2 % 2 == 0;
        boolean isOdd= number2 % 2 != 0;
        System.out.println(isEven);
        System.out.println(isOdd);


    }
}
