package day16_string.homework;

import java.util.Scanner;

public class RemoveFirstAndLast {
    /*
    Given two words. Print the first word without its first character then print the second word without its last character.

            Input:
    apple
    banana
    Output:
    pple
    banan

     */

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter a word");
        String word= input.nextLine();

        System.out.println("Enter a second word");
        String word2 = input.nextLine();

        System.out.println("" + (word.substring(1)));
        System.out.println("" + word2.substring(0, word2.length()-1));



    }
}
