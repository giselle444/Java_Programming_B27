package day05_arithmetic;

public class SalaryCalculator {
    /*
    create a class SalaryCalculator
    add a main method
    declare and assign these variables:

       salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax

    Sample data:
       100000 (salary)
       0.08 (state tax rate)
       0.21 (federal tax rate)

    Hint: use tax rates of 0.08 and 0.21 for 8% and 21%

    Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes
     */
    public static void main(String[] args) {

        double stateTaxRate = 0.08;

        double federalTaxRate = 0.21;

        int salaryBeforeTax = 100_000 ;

        double stateTax = salaryBeforeTax * stateTaxRate ;

        double federalTax = salaryBeforeTax * federalTaxRate ;

        double totalTax = stateTax + federalTax;

        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $" + salaryBeforeTax);

        System.out.println("State tax = $" + stateTax);

        System.out.println("Federal tax =$" + federalTax);

        System.out.println("Total tax =$" + totalTax);

        System.out.println("Net income = $" + salaryAfterTax);
            





    }

}
