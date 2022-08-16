package day23_array;

import java.util.Arrays;
import java.util.Scanner;

public class PartyList {
    /*
    we are throwing a party, we want to gather all the names


     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many people are coming ti the party?");
        int size = input.nextInt();

        String[] names = new String[size];
        System.out.println(Arrays.toString(names)); // will print [null, null, null...] it's a placeholder until you put in names/objects

        for (int i = 0; i < names.length; i++) { //purpose: ask for the name and store to the array
            System.out.println("enter the name of person " + (i + 1));
            String guest= input.next();
            names[i]= guest; //names[i] = input.next();


        }
        System.out.println("Final List coming to the party ");
        System.out.println(Arrays.toString(names));
    }
}
