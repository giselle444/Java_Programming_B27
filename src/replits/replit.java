package replits;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.next();


        int output=0;
        for (int i = 0; i <word.length() ; i++) {
            output++;
        }
        System.out.println("Length is: " + output);



    }
}
