package day31_arraylist.homework;

import java.util.ArrayList;
import java.util.Collections;

public class PracticeFlow {
    /*
    Practice flow:

Create an ArrayList of Strings
add these elements:
    add Hat
    add Shoes
    add Jacket in middle of Hat and Shoes
    add Towel in the beginning
    add Car between Towel and Hat

Print the ArrayList after each action to see how the change is made



     */

    public static void main(String[] args) {

        ArrayList<String> words= new ArrayList<>();
        System.out.println(words.size());
        words.add("Hat");
        System.out.println(words);

        words.add("Shoes");
        System.out.println(words);
        words.add(1,"Jacket");
        System.out.println(words);
        words.add(0,"Towels");
        System.out.println(words);
        words.add(1,"car") ;
        System.out.println(words);

    }
}
