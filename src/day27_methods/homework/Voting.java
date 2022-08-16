package day27_methods.homework;

import java.util.Scanner;

public class Voting {
    /*
    create a method that will accept an age and determine if the person is eligible to vote. Person must be 18 years or older to vote

     */

    public static void votingEligibility(){
        Scanner input= new Scanner(System.in );
        System.out.println("Please enter your age");

        int age= input.nextInt();
        if (age >= 18){
            System.out.println("Eligible to vote");


        }else{
            System.out.println("Must be 18 or older to be eligible to vote");

        }
    }

    public static void main(ex4[] args) {
        votingEligibility();

        //OR you can bring scanner down here and do:
        //Scanner input= new Scanner(System.in);
        //votingEligibility(scan.nextInt());
    }


}
