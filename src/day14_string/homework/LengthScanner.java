package day14_string.homework;

import java.util.Locale;
import java.util.Scanner;
    /*
    Use scanner to read a String from the console
    Remove extra spaces in the beginning or end
    Print in all lowercase
    Print the number of characters

     */

public class LengthScanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your password");
        String s1 = s.nextLine();
        s1= s1.toLowerCase();
        System.out.println("lower case: " + s1);
       // System.out.println("Trim: " + s1.trim());
        System.out.println("Number of character: " + s1.length());
        s1 = s1.toUpperCase();
        System.out.println("Upper case: " + s1);

    }
}
