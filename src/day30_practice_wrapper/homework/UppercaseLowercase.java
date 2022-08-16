package day30_practice_wrapper.homework;

import java.util.Scanner;

public class UppercaseLowercase {
    /*
    Write program that returns true if the total number of uppercase
characters are equal to total number of lowercase characters of a
string

Ex:
    str = "JAVA java";

output:

    true


     */
    public static void main(String[] args) {

        String str="JAVA java";
        System.out.println(upperEqualToLower(str));
    }

    public static boolean upperEqualToLower(String str){

        int Upper=0;
        int Lower=0;
        for (int i = 0; i <str.length() ; i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                Upper++;
            }

             if (Character.isLowerCase(str.charAt(i))){
                Lower++;
            }

        }
        return Upper==Lower;





    }

}
