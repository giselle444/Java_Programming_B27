package day07_Scanner;

public class GiftCard {
    public static void main(String[] args) {
        /*
        declare and assign a gift card variable at 500
    declare and assign times used at 3
    print using giftcard and subtract 150 from the amount
    reduce the times used by one
    print using giftcard and subtract 99 from the amount
    reduce the time used by one
    print information at the end

         */

        double giftcard = 500;
        int uses = 3;
        System.out.println( " Using giftcard. $150 removed");
        giftcard -= 150; //giftcard = giftcard - 150
        uses--;
        System.out.println("Using giftcard.$99 removed");
        giftcard -= 99;
        System.out.println("giftcard balance left $" + giftcard);
        System.out.println( "number of times card can be used: " + uses);



    }
}
