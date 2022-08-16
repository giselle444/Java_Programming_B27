package day20_loops.homework;

public class CountNumber {
    /*
    Count Words
    Given a sentence determine how many words are in the String.
        Ex:
            Input:
                This has multiple words //length
            Output:
                4

     */
    public static void main(String[] args) {

        String str= "This has multiple words";
                   //012345678910
        int count =1;


        for (int i = 0; i < str.length(); i++ ){ //i=0,1,2,3... length of str
            if(str.charAt(i) == ' '){ //T == ' ' (false)
                count++;

            }

        }
        System.out.println("Total words: " + count);
    }
}
