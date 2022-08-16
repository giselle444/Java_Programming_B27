package day18_loops;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {

        /*
        ask the user to type 5 numbers
        find the biggest number
        4
        142
        230
        32
        5

         */
        Scanner input = new Scanner(System.in);
        int max = -2147483648;
        int min = -2147483647;
        int num= 0;

        while (num++ <5){//this loop will run for 5 times | start from 1 and go until <=5
            System.out.println("Enter a number");
            int inputNum=input.nextInt();

            if (inputNum > max){
                max=inputNum; //if the new number from the console is bigger than our current biggest number, we found a new max number and should reassign it to the variable

            }
            if (inputNum < min){
                min = inputNum;
            }

        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        /*
        Execution
         */


    }
}
