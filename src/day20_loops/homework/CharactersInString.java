package day20_loops.homework;

public class CharactersInString {
    /*

Characters in String
    Given a String print the ascii value codes for each character
        Ex:
            Input:
                java
            Output:
                106 97 118 97

     */

    public static void main(String[] args) {
         //int value = 'j'; //ASCII value of j =106
         //System.out.println(value)


        String str= "java";
                   //0123
        int value=0;
        String storedValue= "";

        for (int i = 0; i < str.length() ; i++) {
             value = str.charAt(i);
             storedValue += value + " ";



    }

        System.out.println(storedValue);


        }



    }

