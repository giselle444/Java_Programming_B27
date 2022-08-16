package day25_arrays;

import java.util.Arrays;

public class Anagram {
      /*
    [IQ] Given two Strings determine if they are anagram or not. day25_arrays.Anagram is when the character of the words can be reordered to get a different word
Ex:
  listen
  silent

The letters of the two words are the same so they are anagram

       */

    public static void main(String[] args) {

        String word1= "listen";
        String word2= "silent";

        char[] first= word1.toCharArray();
        char[] seconds= word2.toCharArray();
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(seconds));

        Arrays.sort(first);
        Arrays.sort(seconds);

        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(seconds));

        if (Arrays.equals(first, seconds)){
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }
        System.out.println(Arrays.equals(first,seconds) ? "Anagram" : "Not Anagram");

    }
}
