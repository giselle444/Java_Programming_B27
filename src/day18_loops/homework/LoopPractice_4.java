package day18_loops.homework;

public class LoopPractice_4 {
    /*
    write a program that will check all the numbers from 1 - 50 and apply fizzbuzz logic to it (see previous task from class if you are not sure)
    1.  For numbers which are divisible by 3, print "Fizz" instead of the number.
    2.  For numbers which are divisible by 5, print "Buzz" instead of the number
    3.  For numbers which are a divisible by both 3 and 5, print "FizzBuzz" instead of the number


     */
    public static void main(String[] args) {
        int limit=50;
        int number=1;

        while (number <= limit){
            if (number %3==0 && number%5 !=0)

                System.out.println("Fizz");
            else if(number % 5 ==0 && number %3 !=0)

                System.out.println("Buzz");
            else if (number % 5 ==0 && number % 3 ==0)

                System.out.println("FizzBuzz");
            else
                System.out.println(number);
            number++;

        }


    }
}
