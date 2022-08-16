package day17_string;

public class PrintLetters {
    public static void main(String[] args) {

        char first = 'A';

        while (first <= 'Z') {
            System.out.println(first++);
        }
        /*
        iteration 1:
        first = 'A'
        'A' < 'Z' true
        loop runs
        prints(first) ->A
        then increments because of post increment
        first ++ -> B

        Iteration 2:
        first = B
        b < z true
        loop runs
        print(first) ->B
        first++ -> C
         */

        System.out.println();
        //printin z-a
        char backwards = 'z';
        while (backwards >= 'a') {
            System.out.println(backwards--);
        }
        

    }
}


