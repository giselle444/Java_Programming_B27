package day07_Scanner;

import java.util.Scanner;

public class FirstScannerExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // how to make a scanner variable, object
        System.out.println("Please enter a number");
       int number =  input.nextInt();
        System.out.println("This is your number: " + number);
        number -=15;
        System.out.println(number);





    }
}
