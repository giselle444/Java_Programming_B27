package day18_loops.homework;

import java.util.Scanner;

public class LoopPractice_2 {
    /*
    write a program that will ask the user to enter 5 numbers and print how many were positive and how many were negative
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int countNumber = 1;
        int countNegative = 0;
        int countPositive = 0;
        while (countNumber <= 5) {
            int enterNumber = scanner.nextInt();
            countNumber++;
            if (enterNumber >= 0) {
                countPositive++;
            } else {
                countNegative++;
            }
        }
        System.out.println("Positive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);

            }
        }










