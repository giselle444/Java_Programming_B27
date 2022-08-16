package day31_arraylist.homework;

import java.util.ArrayList;

public class Thor {
    /*
    Create an ArrayList of Strings
add these elements:
    Iron Man, Spider Man, Thor, Captain America, Hawkeye

    remove Thor by index

    remove Iron Man by element

    remove the first index

Print the ArrayList after each action to see how the change is made

     */


    public static void main(String[] args) {

        ArrayList<String> heroes= new ArrayList<>();
        heroes.add("Iron Man");
        heroes.add("Spider Man");
        heroes.add("Thor");
        heroes.add("Captain America");
        heroes.add("Hawkeye");
        System.out.println(heroes);



        heroes.remove(2);
        System.out.println(heroes);
        heroes.remove("Iron Man");
        System.out.println(heroes);
        heroes.remove(1);
        System.out.println(heroes);
    }
}
