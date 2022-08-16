package day08_Scanner;

import java.util.Scanner;

public class Employment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your job title");
        String jobTitle = input.nextLine();

        System.out.println("What is your hourly rate");
        double hourlyRate = input.nextDouble();

        System.out.println("What is the average number of hours in a week");
        int hours = input.nextInt();

        double salary = hours * 52 * hourlyRate; // trying to calculate salary. 52 weeks in a year

        System.out.println( "where is the company HQ");
        input.nextLine(); // empty nextline to catch enter input. This is bc we used nextInt() before the nextLine below.
        // if there isn't a nextLine() before a nextLine() then do an empty one
        String hqLocation = input.nextLine();

        System.out.println("Are you full time: true or false");
        boolean isFullTime = input.nextBoolean();

        String report = fullName + " is a " + jobTitle + " they make $ " + salary + " because they are full time: " +
                isFullTime + " the HQ is located in: " + hqLocation;

        System.out.println(report);














    }
}
