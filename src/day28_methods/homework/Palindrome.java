package day28_methods.homework;

public class Palindrome {
   // create a method that will  accept a String and find if it is Palindrome or not (boolean)

    public static boolean isPalindromeOrNot(String str){
        String reverseStr= "";
        for (int i = str.length()-1; i >-1; i--) {
         reverseStr=   reverseStr + str.charAt(i); //reverseStr +=

        }
        return(reverseStr.equalsIgnoreCase(str));

    }

    public static void main(String[] args) {
        System.out.println(isPalindromeOrNot("racecar"));
        System.out.println(isPalindromeOrNot("hello"));
    }






}
