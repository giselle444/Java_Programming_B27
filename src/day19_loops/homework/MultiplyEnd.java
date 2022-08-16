package day19_loops.homework;

import java.util.Scanner;

public class MultiplyEnd {
    /*
    Multiply End

Given a String and a number return a String that has the ending character duplicated and attached by the number amount of times

	Ex:
		Input:
			Hello?
			3
		Output:
			Hello????

	Ex:
		Input:
			java
			5
		Output:
			javaaaaaa


     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word and number");

        String word= input.nextLine();
        int num = input.nextInt();
        String result="";

        for (int i = 0; i < num; i++) {
            result += word.charAt(word.length()-1) + "";


        }
        System.out.println(word + result);






    }
}
