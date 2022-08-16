package day21_nested_loops;

import java.util.Scanner;

public class PrimeInRange {
    /*
    Prime: number is only divisible by 1 and itself

    print all the prime numbers up to a certain number

    50
    print all prime numbers from 2-50
    2 3 5 7 11...49

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What number do you want to got to?");

        int range = input.nextInt();

        //outer loops checks all the numbers from 2-range
        for (int i = 2; i <= range; i++) {

            boolean isPrime = true; //every time the outer loop runs the boolean variable has a value of true, it means for every number in the range, we start from true

            //inner loop checks if the number is prime
            for (int j = 2; j < i; j++) { //starting from 2 bc i want to check divisibility of the number from2 to number itself

                if (i % j == 0) { //the number we are checking (i) is evenly divisible by the j values (from 2 to the number) it means its not prime
                    isPrime = false;
                    break; //break stops the inner loop

                }


            } // end of the inne rloop
            if (isPrime) {
                System.out.println(i);
            }
        }//end of the outer loop
    }
}
