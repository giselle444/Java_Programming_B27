package day07_Scanner;


import java.util.Scanner;

public class ScannerHomework {
    public static void main(String[] args) {
        //Create a program that will ask the user to enter two numbers. Add the numbers and print the result
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int num1 = number.nextInt();
        int num2 = number.nextInt();
        int addTwoNumbers= num1 + num2;
        System.out.println(" The total of these two numbers is :" + addTwoNumbers);







    }
}
