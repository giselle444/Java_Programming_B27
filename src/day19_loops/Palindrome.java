package day19_loops;

public class Palindrome {
    /*
    given a String determine if it is a palindrome
    'palindrome means the String is read at the same forwards and backwards

    ex: anna
    racecar
    maam
    abcba

     */

    public static void main(String[] args) {

        String s = "racecar";
        String reverse = " ";

        //reverse my String, read it back from the last index to first, backwards

        for (int i = s.length() - 1; i >= 0; i--) { // i is just a number, but using length-1 allows me to find the last index of the String, that means we can use that index of the String, that means we can us ethat index to read characters

            System.out.println(s.charAt(i));

            reverse += s.charAt(i);


        }
        System.out.println(reverse);
        if (s.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
        System.out.println(s.equals(reverse) ? "Palindrome" : "Not Palindrome");
    }
}

