package day06_operators;

public class UnaryExamples {
    public static void main(String[] args) {
        int n=0;//0
        n++;    // post increment value becomes 1
        System.out.println(n); //1

        ++n; //pre increment value becomes 2
        System.out.println(n); //2

        System.out.println(++n); //pre increment, value becomes 3, then it prints the value

        System.out.println(++n); //pre increment, value will become 4 then it prints the value

        System.out.println(n);
        System.out.println(n++); // post increment, prints current value, which is 4, then it will increment by 1

        System.out.println(n);
        System.out.println("---------");

        int x= 4;
        int y=x;
        int z = ++x; // pre increment
        System.out.println("x" + x); //4 -->5
        System.out.println("y" + y); //4
        System.out.println("z" + z); //5

        System.out.println("------");
        int candy = 5;
        System.out.println("Your kid asks for candy, you have " + candy);
        System.out.println("You give them, so now you have " + --candy); // pre decrement subtract 1 first, then print it.
        System.out.println("The sibling comes in  and they look and they want one, you check how many there is, and give one " + candy--);
        System.out.println("total candy in the jar now " + candy);

        //USE CASE: counting:
        //your name, we want to find how many times your name has the letter 'a'

        int counter = 0;
        counter++;
        // we find another a
        counter++;





    }
}
