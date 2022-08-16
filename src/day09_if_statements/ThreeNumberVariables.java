package day09_if_statements;

public class ThreeNumberVariables {
    /*
    Create three number variables
    Find and print which number is bigger between the three
	ex:
		50
		45
		100

		output:
		100 is the biggest
     */
    public static void main(String[] args) {
        int num1 = 85;
        int num2 = 55;
        int num3 = 65;

        System.out.println("Three numbers: \n" + num1 + "\n" + num2 + "\n" +num3);
        if (num1>num2 && num1>num3){
            System.out.println(num1 + " is the biggest of three numbers.");
        }
        if (num2>num3 && num2>num1){
            System.out.println(num2 + " is the biggest of three numbers.");
        }
        if (num3>num1 && num3>num2){
            System.out.println(num3 + " is the biggest of three numbers.");
        }else{
            System.out.println("The numbers are all equal.");
        }





    }
}
