package day22_array.homework;

import java.util.Scanner;

public class NumberAsAWord {
    /*
    Create a program that will ask the user to enter a number and print the number as a word. Set a range from 0 - 15 and any number not in the range should get an invalid number message

    Ex:
> 1
        one

> 10
        ten

     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter a number from 0-15");
        int num = input.nextInt();

        String[]word= {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen"};

        if (num >= 1 && num <=15){
            System.out.println(word[num-1]);
        }else {
            System.out.println("Invalid number message");
        }


    }
}
