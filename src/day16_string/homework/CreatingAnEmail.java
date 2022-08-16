package day16_string.homework;

import java.util.Locale;
import java.util.Scanner;

public class CreatingAnEmail {
    /*
    Ask user to enter two strings. Both strings should be at least 6 character long. If they are shorter
    than that print “Invalid data” and program should end.

If the information provided is valid, you will take the first 4 characters of first string and
combine them with the last three characters of the second string. At the end of your combined
string add “@cydeo.com” and print the final string as your created email.
The final email should be in all lowercase.

    input:
        JamesBond
        Secret
    output:
        jameret@cydeo.com


     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str1=input.nextLine().toLowerCase();

        System.out.println("Enter a second string");
        String str2= input.nextLine().toLowerCase();

        boolean validEmail= str1.length() >= 6 && str2.length() >=6;

       if (validEmail){
           System.out.println(str1.substring(0,4) + str2.substring(str2.length()-3, str2.length()) + "@cydeo.com");
       }else{
           System.out.println("Invalid Data ");
       }

    }
}
