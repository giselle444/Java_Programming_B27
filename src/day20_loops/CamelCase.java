package day20_loops;

import java.util.Locale;
import java.util.Scanner;

public class CamelCase {
    /*
    Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase


    Ex:

    Today is SUNDAY

    Output:

    todayIsSunday

     */

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter multiple words");
        String str= input.nextLine().toLowerCase();
        String camelCase= " ";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' '){

              camelCase +=  str.substring(i+1, i+2).toUpperCase(); //gives the one character after the space
                //str.charAt(i +1)

            }else{
                camelCase += str.charAt(i);

            }

        }
        System.out.println(camelCase);



    }
}
