package replits;

import java.util.Scanner;

public class replit4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();

        //WRITE YOUR CODE BELOW
        System.out.println("word: " + word);


        word = word.toUpperCase();
        System.out.println("uppercase: " + word);

        word=word.toLowerCase();
        System.out.println("lowercase: " + word);

    }
}
