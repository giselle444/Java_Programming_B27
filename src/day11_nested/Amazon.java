package day11_nested;

public class Amazon {
    public static void main(String[] args) {
        double price = 10.99;
        boolean isPrime = true;

        if(isPrime){
            System.out.println("free 2 day shipping");
        }else{
            //you dont have prime

            if(price >= 25){
                System.out.println("Free shipping available");
            }else{
                System.out.println("Shipping cost is $2.99");
            }
        }
        /*
        if the boolean isPrime is true if the block runs
        if the boolean is false if the else block, which has an if statement that if conditions is checked
                price >= 25 : free shipping
                false: pay for shipping
         */
    }
}
