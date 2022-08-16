package day09_if_statements;

public class Bank {
    public static void main(String[] args) {

        double balance = 10_000_000;
        double amountToWithdraw = 500_000;

        balance -= amountToWithdraw; // balance = balance - amountToWithdraw
        System.out.println("Withdrew: " + amountToWithdraw);

        if (balance >= 0){
            System.out.println("account balance is: " + balance); // 1000000-500000 your balance will not be overdrafted,
                                                                    // this statement will print
        }

        if (balance < 0){
            System.out.println("Overdraft penalty");
            System.out.println("Amount due: " +  amountToWithdraw * 0.25);
            System.out.println("Account balance is: " + balance);
        }   /* if you have $100 balance and withdraw $500 this statement will print
            Withdrew: 500.0
            Overdraft penalty
            Amount due: 125.0
            Account balance is: -400.0 */



    }
}
