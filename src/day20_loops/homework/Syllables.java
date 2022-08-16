package day20_loops.homework;

public class Syllables {
    /*
    Syllables
    Given a String separated by dashes calculate how many syllables the words are
        Ex:
            Input:
                ja-va
            Output:
                2

     */
    public static void main(String[] args) {


        String str = "ba-na-na";

        int count = 1;

        for (int i = 0; i < str.length() ; i++) {

            if (str.charAt(i) == '-'){
                count++;



            }

        }
        System.out.println("Total syllables: " + count);

    }
}
