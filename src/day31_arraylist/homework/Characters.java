package day31_arraylist.homework;

import java.util.ArrayList;

public class Characters {
        /*
        Create an ArrayList of Characters
Fill the ArrayList with letters of your name. Each letter as a different element
Print each letters on a separate line by accessing each element

         */

    public static void main(String[] args) {

        ArrayList<Character> name= new ArrayList<>();

        name.add('G');
        name.add('I');
        name.add('S');
        name.add('E');
        name.add('L');
        name.add('L');
        name.add('E');
        System.out.println(name.get(0));
        System.out.println(name.get(1));
        System.out.println(name.get(2));
        System.out.println(name.get(3));
        System.out.println(name.get(4));
        System.out.println(name.get(5));
        System.out.println(name.get(6));


    }
}
