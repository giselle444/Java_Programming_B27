package day09_if_statements;

public class Letters {
    public static void main(String[] args) {

        char letter = 'B'; // letter 'B' is 66

        if (letter >= 'A' && letter <= 'Z'){
            System.out.println(letter + " is an uppercase letter");
        }
        /*
        using ASCII value
        if(letter >= 65 && letter <= 90){
         System.out.println( letter + " is an uppercase letter");
         }
         */

        if (letter >= 'a' && letter <= 'z'){ // letter: 'B' is 66 so this is false, will not print
            System.out.println(letter + " is a lowercase letter");
        }
        /*
        using ASCII value
        if(letter >= 97 && letter <= 122){
         System.out.println( letter + " is an uppercase letter");
         }
         */






    }
}
