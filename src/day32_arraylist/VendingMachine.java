package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
/*
        //Older approach: use add method
        ArrayList<String> drinks= new ArrayList<>();
        drinks.add("Soda");
        drinks.add("juice");
        drinks.add("water");
        drinks.add("coffee");
        System.out.println(drinks);

 */

        Scanner input= new Scanner(System.in);
        ArrayList<String> drinks= new ArrayList<>(Arrays.asList("Soda", "juice", "water", "coffee"));

        System.out.println("Welcome. which drink would you like?");
        String selection= input.next();


        if (drinks.contains(selection)){
            System.out.println(selection + " is vending");
        }else{
            System.out.println(selection+ " is not int he vending machine");
        }

    }
}
