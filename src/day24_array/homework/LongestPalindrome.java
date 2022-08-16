package day24_array.homework;



public class LongestPalindrome {
      /*
        Longest Palindrome

        Given a String array. Find the longest Palindrome String in your array.

        Ex:
        Input:
			["java", "longer word", "civic", "apple", "racecar", "mom", "anna"]
        Output: racecar

        Ex:
        Input: ["abc", "dna", "kevin", "joe", "lamp"]
        Output: No palindrome

         */

    public static void main(String[] args) {


        String[] str = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String palindrome="";
        String longestPalindrome="";


       for (String each : str) {
            String reverse = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);


            }
            if (reverse.equalsIgnoreCase(each)) {
                palindrome += each + " ";

                if ( each.length() > longestPalindrome.length()) {
                    longestPalindrome = each;


            }


            }


        }
        System.out.println(longestPalindrome);




    }
}






