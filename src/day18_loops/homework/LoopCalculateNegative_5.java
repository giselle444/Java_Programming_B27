package day18_loops.homework;

import java.util.Scanner;

public class LoopCalculateNegative_5 {
    /*Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int num;
        int counter = 5;
        System.out.println("Enter a number");

        while (counter > 0){
            counter--; // each time when we enter the number it will decrease the entree

            num=scan.nextInt();
            if (num >= 0){
                positive++;
            }else {
                negative++;
            }
        }
        System.out.println("positive: " + positive);
        System.out.println("negative: " + negative);



        }



        }





