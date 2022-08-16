package day05_arithmetic;

public class GiftCardPractice {
    public static void main(String[] args) {
        /*
        GiftCard
    declare and assign a gift card variable at 500
    declare and assign times used at 3
    print using giftcard and subtract 150 from the amount
    reduce the times used by one
    print using giftcard and subtract 99 from the amount
    reduce the time used by one
    print information at the end


         */
      int giftCard= 500;
      int timesUsed = 3;
      int balance1= giftCard -150;
      int balance2= balance1- 99;
        System.out.println("Use the card, new balance : $" + balance1); //350
        System.out.println("times remaining: " + --timesUsed); //2
        System.out.println("Use the card, new balance : $" + balance2);//251
        System.out.println("times remaining: " + --timesUsed); //1

        System.out.println("-------");

        /*
        What is the value of a and b

            int a = 8;
            int b = a--;

            what is a?
            what is b?

         */
        int a = 8;
        int b = a--;
        System.out.println(a);
        System.out.println(b);







    }
}
