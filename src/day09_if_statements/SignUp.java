package day09_if_statements;

import java.util.Scanner;

public class SignUp {
    /*
    signing up to join newsletter
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your email");
        String email = input.next();

        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("do you want to sign up for the extra newsletter T/F");
        boolean signUp = input.nextBoolean();
        input.nextLine(); // extra empty nextLine bc we have a boolean before nextLine.

        System.out.println("how did you hear about us");
        String marketing = input.nextLine();

        String confirm = fullName + " you signed up! with email: " + email + ". We are glad to get readers at age: "
            + age + ". You signed up for extra newsletter: " + signUp + " Credit goes to " + marketing;

        System.out.println(confirm);


    }



}
