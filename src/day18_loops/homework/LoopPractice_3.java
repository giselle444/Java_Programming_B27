package day18_loops.homework;

import java.util.Scanner;

public class LoopPractice_3 {
    /*
    write a program that calculates the factorial of a number:
    ex: 5! = 5 * 4 * 3 * 2 * 1 = 120


     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number= scan.nextInt();
        int number2=1;

        while (number>=1){
            number2*=number;
            number--;

        }

        System.out.println("the factorial number: " + number2);


    }
}
