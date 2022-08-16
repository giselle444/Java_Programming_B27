package day11_nested.homework;

import java.util.Scanner;

public class TwoExpectedNumbers {
    /*
    declare and assign two expected numbers:
	pincode: 1234
	ssn: 1111

ask the user to enter the two numbers and compare them with the system values defined above. If they match print Authentication successful

if they don't match print all the reasons that authentication failed:

	if the pincode was incorrect print: Pin Code is incorrect
	if the ssn was incorrect print: Last 4 SSN numbers are incorrect


     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int validPinCode=1234;
        int validSocial=1111;

        int pinCode= input.nextInt();
        int social=input.nextInt();

        System.out.println("Enter your pincode: ");
        System.out.println("Enter the last 4 digits of your SSN");

        if (pinCode == validPinCode){
            System.out.println("Authentication Successful");
        }
        if (social == validSocial){
            System.out.println("Authentication Successful");
        }

    }
}
