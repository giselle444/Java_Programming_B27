package day15_string.homework;

import java.util.Scanner;

public class LongestWithA {
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
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println(" Enter a word");
        String word= input.nextLine();

        System.out.println("Enter a second word");
        String word2= input.nextLine();

        System.out.println("Enter a third word");
        String word3 = input.nextLine();

        System.out.println(word + " Contains an \"a\"" + word.contains("a"));

        System.out.println(word2 + " contains an \"a\"" + word2.contains ("a"));
        System.out.println(word3 + " contains an \"a\"" + word3.contains("a"));

        if (word.length() > word2.length() && word.length() > word3.length()){
            if (word.contains("a"))
                System.out.println("The longest word that also contains an \"a\" is " + word);
        }else if (word2.length() > word.length() && word2.length() > word3.length()){
            if (word2.contains("a"))
            System.out.println("The longest word that also contains an \"a\" is " + word2);
        }else {
            if (word3.contains("a"))
            System.out.println("The longest word that also contains an \"a\" is " + word3);
        }










    }
}
