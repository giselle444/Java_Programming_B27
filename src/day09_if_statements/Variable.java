package day09_if_statements;

public class Variable {
    /*

    create a sales amount variable
    use the sales amount to determine the bonus you get at end of the month

	if your sales amount is less than 10000 you don't get any bonus

	if your sales amount is more than or equal to 10000 and less than 15000 you get a bonus of 5000

	if your sales amount is more than or equal to 15000 you get a bonus of 7000

	print your bonus number

     */
    public static void main(String[] args) {

        double salesAmount = 12_000;

        if (salesAmount < 10_000){
            System.out.println("No bonus");
        } else if (salesAmount >= 10_000 && salesAmount < 15_000){
            System.out.println("You get a bonus of: $5000");
        }else if (salesAmount >= 15_000){
            System.out.println("You get a bonus of: $7000");
        }

    }
}
