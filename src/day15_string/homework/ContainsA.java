package day15_string.homework;

import java.util.Scanner;

public class ContainsA {
    public static void main(String[] args) {
        /*
    create a class LongestWithA
ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

	Ex:
		"java"
		"mouse"
		"computer"

	Output: java

Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.


     */

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter a word");
        String word = input.nextLine();

        System.out.println("Enter a second word");
        String word2 = input.nextLine();

        System.out.println("Enter a third word");
        String word3 = input.nextLine();



        if (word.contains("a")) {
            System.out.println(word + "contains an \"a\"");
        }
        if (word2.contains("a")) {
            System.out.println(word2 + " contains an \"a\"");
        }
        if (word3.contains("a")) {
            System.out.println(word3 + " contains an \"a\"");
        }

        if (word.length() > word2.length() && word.length() > word3.length()){
            System.out.println(word + " is the longest word");

        } else if (word2.length() > word.length() && word2.length() > word3.length()) {
            System.out.println(word2+ " is the longest word");
        }else{
            System.out.println(word3+ " is the longest word");
        }
    }
}

