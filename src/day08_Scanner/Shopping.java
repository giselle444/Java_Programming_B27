package day08_Scanner;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        Scanner input = new Scanner( System.in);

        //HARDCODED method:
       /* System.out.println("Enter the item name");
        String item = "Ball";
        System.out.println("What is the item price");
        double price= 5.99;
        System.out.println("How many " + item + " do you want");
        int quantity = 3;

        String report = "Your total for " + quantity + " " + item + " is " + quantity * price;
        System.out.println(report); */

        //Scanner Method

        System.out.println("Enter the item name");
         String item = input.nextLine();

        System.out.println("What is the item price");
        double price= input.nextDouble();

        System.out.println("How many " + item + " do you want");
        int quantity = input.nextInt();

        String report = "Your total for " + quantity + " " + item + " is " + quantity * price;
        System.out.println(report);




    }
}
