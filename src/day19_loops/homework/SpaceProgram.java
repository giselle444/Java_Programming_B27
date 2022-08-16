package day19_loops.homework;

import java.util.Scanner;

public class SpaceProgram {
    /*
    Space program

Given a String return a version of with spaces between all of the letters.
If there is already a space in the String put an underscore

	Ex: java	-> j a v a
		space 	-> s p a c e
		more words -> m o r e _ w o r d s


     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter words");

        String word= input.nextLine();
        String wordWithSpace= "";

        for (int i = 0; i < word.length(); i++) {


            if (word.charAt(i) == ' '){
                wordWithSpace+= word.charAt(i);



            }
            wordWithSpace+= word.charAt(i) + " ";
            word=word.replace(' ','_');


        }
        System.out.println(wordWithSpace);




    }
}
