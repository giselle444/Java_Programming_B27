package day16_string;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your address");
        String address = input.nextLine();
        address = address.toUpperCase();
        address = address.trim();

        /*

        at this point we create the address from the console
        made all the character uppercase
        and removed extra spaces from the beginning and end
        to do all the above steps at the same time we could also chain our methods
        String address = input.nextLine();
         */

        if (address.startsWith("500")){
            System.out.println("house is on the right side");
        }else if (address.startsWith("600")){
            System.out.println("House is on the left side");
        }

        if (address.contains("DRIVE")){
            System.out.println("House is on the right side");
        }else if (address.contains("LANE")){

        }





    }
}
