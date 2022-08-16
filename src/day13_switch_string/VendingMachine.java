package day13_switch_string;

import java.util.Scanner;

public class VendingMachine {
/*
    Vending machine
    snacks
    1
    2
    3

    Drinks
    4
    5
    6

 */
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to the vending machine. Select the menu you want to see: \n\tSnacks\n\tDrinks");
    String menu = input.next();

    switch (menu){
        case "Snacks":

        case "Drinks":
    }
}

}
