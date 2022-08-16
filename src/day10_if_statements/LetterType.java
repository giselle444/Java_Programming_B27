package day10_if_statements;

public class LetterType {
    /*
    reate a char variable letter. Find and print if the character is a letter, number, or special character

	ex: p
		letter

	ex:
		6
		number

	ex:
		$
		special character


     */
    public static void main(String[] args) {

     char c = 'p';

     boolean isLetter = (c >= 'A' && c <= 'Z') ||(c >= 'a' && c <= 'z');
     boolean isNumber = c >= '1' && c <= '9';

     if (isLetter){
         System.out.println(c + " is a letter");
     }
     if (isNumber){
         System.out.println(c + " is a number");
     }
     if (!isLetter && !isNumber){
         System.out.println(c + " is a special character");
     }



    }
}
