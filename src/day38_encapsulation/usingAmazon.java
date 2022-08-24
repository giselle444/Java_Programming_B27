package day38_encapsulation;

import day38_encapsulation.homework.AmazonAccount;




public class usingAmazon {
    public static void main(String[] args) {

    AmazonAccount account = new AmazonAccount("Lucy", "Lucy@gmail.com", true);

        System.out.println(account.getUserName());
        System.out.println(account.getEmail());
        System.out.println(account.isHasPrime());

}
}



