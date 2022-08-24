package day38_encapsulation;

public class testBank {
    public static void main(String[] args) {


        BankAccount account1 = new BankAccount(213334244, 123333);

        System.out.println(account1.getAccountNumber());

        System.out.println(account1.getBalance());
    }

}
