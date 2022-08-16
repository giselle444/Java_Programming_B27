package day19_loops.homework;

public class Reverse {
    /*
    Reverse only second word

Given a String with three words separated by spaces. Reverse only the second word and return the modified String
	Ex:
	I love java

	Ouput:
	I evol java
     */

    public static void main(String[] args) {

       String word1= "I love java";
       String space= "";

       for (int i =9; i < word1.length()-1; i++){
           if (word1.contains("love")){
               space += word1.replace("love", "evol");
               System.out.println(word1);

           }
       }


    }
}
