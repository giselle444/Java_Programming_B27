package day21_nested_loops.homework;

public class Duplictes {
    public static void main(String[] args) {
        /*
         Given a String, find and print the duplicate characters. A character is duplicate if it appears more than once in the String.

    Ex:
        Input:
            AAABCCDEEF
        Output:
            ACE
         */

        String str = "aapples";
        String duplicates= "";

        for (int j = 0; j < str.length(); j++) {

            int count=0;

            if (!duplicates.contains("" + str.charAt(j))){
                for (int i = 0; i < str.length(); i++) {

                    if (str.charAt(j) == str.charAt(i)){
                        count++;
                    }

                }
            }
            if (count > 1){
                System.out.println(count + " " + str.charAt(j));
            }
            duplicates += str.charAt(j);

        }

    }
}
