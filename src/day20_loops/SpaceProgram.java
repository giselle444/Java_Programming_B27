package day20_loops;

public class SpaceProgram {
    /*
    Space program

Given a String return a version of with spaces between all of the letters.
If there is already a space in the String put an underscore

	Ex: java	-> j a v a
		space 	-> s p a c e
		more words -> m o r e _ w o r d s


     */
    public static void main(String[] args) {

        String s = "hello world";
        String result="";
        for (int i = 0; i < s.length(); i++) { // i <= s.length()-1
          char letter=   s.charAt(i); // will become 1 then 2 then 3 then 4 due to the i++, will increase iterations

            if (letter == ' '){
                result += "_ ";

            }else {
                result += letter + " ";

            }



            
        }
        System.out.println(result.trim());



    }
}
