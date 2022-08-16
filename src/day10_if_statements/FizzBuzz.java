package day10_if_statements;

public class FizzBuzz {
    /*
        [IQ] Given a number n, print the  output based in the following conditions:
        the number is divisible by three print fizz
        the number is divisible by 5 print Buzz
        the number is divisble by 3 and 5 print FizzBuzz
        if the number is not divisible by any THEN PRINT JUST THE NUMBER

        Ex:
        n = 10
        Buzz

        n = 12
        Fizz

        n = 13
        13

        n= 15
        FizzBuzz

     */

    public static void main(String[] args) {

        int n = 15;
        //int divisibleBy3 = n% 3 == 0;
        // int divisibleBy5= n % 5 ==0;


        if ((n % 3 ==0) && (n % 5 == 0)){  // this has two conditions so it has to come first otherwise only n%3==0 will run
            System.out.println("FizzBuzz");

        }else if (n% 3 ==0){
            System.out.println("Fizz");

        }else if (n % 5 == 0){
            System.out.println("Buzz");

        }else{
            System.out.println(n);
        }






    }
}
