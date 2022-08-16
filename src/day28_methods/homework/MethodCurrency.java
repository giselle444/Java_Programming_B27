package day28_methods.homework;

public class MethodCurrency {
    /*
    Currency Converter

create a method that will accept a currency type(String) and a currency amount (double)[as dollars] and convert the currency from dollars to a different type

Use the following information to convert from given dollars to the desired currency type

1 dollar = 0.91 euro
1 dollar = 121.03 yen
1 dollar = 14.85 lira
1 dollar = 1,217.52 won
1 dollar = 181.45 rupee

Note: Don't worry about decimal formats, focus on method

Ex:
	Input:
		euro, 100

	Output:
		91

Ex:
	Input:
		yen, 50

	Output:
		6051.5

     */
    public static void main(String[] args) {
        currencyConverter("euro", 95.5);
        System.out.println(currencyConverter("euro", 95.5));

    }

    public  static double currencyConverter(String str, double amount){
        double dollar=0;
        switch (str){
            case "Euro":
                dollar= amount * 0.91;
                break;
            case "yen":
                dollar=amount * 121.03;
                break;
            case "lira":
                dollar= amount * 14.85;
                break;
            case "won":
                dollar=amount * 1217.52;
                break;
            case "rupee":
                dollar=amount * 181.45;
                break;

            default:
                dollar=-1;



        }return dollar;

    }



}

