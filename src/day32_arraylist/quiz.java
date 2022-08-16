package day32_arraylist;

import java.util.Arrays;
import java.util.Locale;

public class quiz {
    public static void main(String[] args) {

        String[] words = {"one", "two","three","four"};
        String[] other = new String[words.length];
        int index=0;

        for (String word: words){
            other[index++]=word + word.length();
        }
        System.out.println(other);



           }
        }








