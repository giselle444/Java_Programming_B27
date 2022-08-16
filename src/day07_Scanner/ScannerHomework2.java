package day07_Scanner;

import java.util.Scanner;

public class ScannerHomework2 {
    public static void main(String[] args) {
        /*
        Create a program that will ask the user to enter a price and quantity and then calculate the revenue.
        revenue = price × quantity.
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter a price");

        double price = input.nextDouble();
        int quantity = input.nextInt();
        double totalQuantity = price * quantity;

        System.out.println("---------CYBER STORE---------");
        System.out.println(" Memory ram price is $" + price); //$150.0
        System.out.println("4 memory ram is $" + totalQuantity); //$600.0
        System.out.println("-------------------------------");
    }
}

