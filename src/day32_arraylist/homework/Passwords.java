package day32_arraylist.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Passwords {
    /*
Hide passwords

Given an ArrayList of passwords (String). Hide each password in a star (*) format where each character is a star and print the ArrayList of hidden passwords
Ex:
Input:
{"one", "hi", "hold}

Output:
[ ***, **, **** ]


     */
    public static void main(String[] args) {
        ArrayList<String> password = new ArrayList<>(Arrays.asList("one", "hi", "hold"));
        ArrayList<String> hiddenPassword = new ArrayList<>();
        String star = "*";

        for (String each: password) {
            hiddenPassword.add(star.repeat(each.length()));
        }
        System.out.println(hiddenPassword);





    }
}
