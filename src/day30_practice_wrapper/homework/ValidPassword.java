package day30_practice_wrapper.homework;

public class ValidPassword {
    /*
    Valid Password

    Given a String password find out if it is a valid password

    Requirements:

        Must have at least 8 characters
        Must have at least 1 uppercase letter
        Must have at least 1 lowercase letter
        Must have at least 1 number
        Must have one of the follow special characters:
            ! @ # $ % ^ & *

     */
    public static void main(String[] args) {

        System.out.println(validPassword("Cydeotr"));

    }

    public static boolean validPassword(String str) {


        int uppercase = 0, lowercase = 0, number = 0, specialCharacter = 0;

        boolean result = false;
        if (str.length() >= 8) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isUpperCase(str.charAt(i))) {
                    uppercase++;

                } else if (Character.isLowerCase(str.charAt(i))) {
                    lowercase++;
                } else if (Character.isDigit(str.charAt(i))) {
                    number++;
                } else {
                    specialCharacter++;
                }


            }
        }else {
            System.out.println("invalid password");


        }
        result =  uppercase >= 1 && lowercase >= 1 && number >= 1 && specialCharacter == 1;


        return result;
    }

}
