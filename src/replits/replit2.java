package replits;

import java.util.Scanner;

public class replit2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();



           boolean a= sentence.contains(word);
        System.out.println(sentence.contains(word));

    }
}
