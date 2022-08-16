package day17_string;

public class MiddleChar {
    /*
    Given a String, write a program to display the middle character of a string
    a) If the length of the string is even there will be two middle characters.
    b) If the length of the string is odd there will be one middle character.

    Input:
    elephant
    Output:
    The middle characters: ph

     */

    public static void main(String[] args) {
        String str= "water";
        if (str.length() % 2 ==1) {
            //str has an odd number of characters, so 1 middle char
            int midIndex = str.length()/2;
            System.out.println("The middle character: " + str.charAt(midIndex));


        }else{
            //str has an even number of characters, so 2 middle char
        }
    }

}
