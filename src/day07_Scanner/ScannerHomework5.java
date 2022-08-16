package day07_Scanner;

import java.util.Scanner;

public class ScannerHomework5 {
    /*
    Create a program that will ask the user to enter a salary(double) and number of hours(int). Calculate the hourly rate.
    hourly rate = salary / (hours weekly * 52)
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary:");
        double salary = input.nextDouble();

        System.out.println("Enter your hours worked:");
        int hours = input.nextInt();

        int hourlyRate = (int) ((salary) / (hours * 52));
        System.out.println("Your hourly rate is: " + hourlyRate);







    }
}
