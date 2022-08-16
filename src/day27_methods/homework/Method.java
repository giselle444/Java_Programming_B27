package day27_methods.homework;

import java.util.Scanner;

public class Method {
    // create a method that will accept a number. Find and print if it is a positive number, negative number, or zero

    public static void Numbers(int num) {

        if (num > 0) {
            System.out.println(num + " is positive");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        } else if (num == 0) {
            System.out.println("Zero" + num);
        }
    }


    public static void main(ex4[] args) {
        Scanner input = new Scanner(System.in);
        Numbers(input.nextInt());
    }
}

