package day32_arraylist.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SeperateParts {
    /*
    Separate Parts

Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters

Ex:
str = "ABCD123$%#@&456EFG!"
list1: {$, %, #, @, &, !}
list2: {A, B, C, D, E, F, G}
list3: {1, 2, 3, 4, 5, 6}


     */
    public static void main(String[] args) {
        String str= "ABCD123$%#@&456EFG!";

        ArrayList<String>findStr= new ArrayList<>(Arrays.asList(str.split( "")));
        ArrayList<Character> characters= new ArrayList<>();
        ArrayList<Character> letters=new ArrayList<>();
        ArrayList<Character>nums=new ArrayList<>();


        for (int i = 0; i < findStr.size(); i++) {
           Character letter= str.charAt(i);
           if (Character.isDigit(letter)){
               characters.add(letter);
           }else if(Character.isUpperCase(letter)){
               letters.add(letter);
           }else
            nums.add(letter);
           }



        }
        //System.out.println(password);

    }

