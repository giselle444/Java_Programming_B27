package day16_string.homework;

import java.util.Scanner;

public class CreateID {
    /*
    Given a first name and last name create and return an id using the following format:
    the first letter of the first name as lowercase,
    the first 3 letters of the last name with the first letter as uppercase and the rest lowercase,
    the length of the first String multiplied by 2

    first name: john
    last name: smith

    id: jSmi8

------------------------------------------------------------------------

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName= input.nextLine();
        System.out.println("Enter you last name");
        String lastName= input.nextLine();

        String ID= firstName.substring(0,1) +  lastName.substring(0,1).toUpperCase() + lastName.substring(1,3) + (firstName.length() *2);
        System.out.println(ID);

    }
}
