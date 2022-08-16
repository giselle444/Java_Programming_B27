package day06_operators;

public class LogicalExample {
    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isGoodTemp =true;
        boolean doBbq = isWeekend && isGoodTemp;
        System.out.println(doBbq);

        boolean isTeacher = true;
        boolean isPolice = false;
        boolean isFirefighter = false;
        boolean getDiscount = isTeacher || isPolice || isFirefighter; // || or only of the boolean need to be true,
        // for the result to be true
        System.out.println("get a discount: " + getDiscount); // true

        //goal: 5 < number < 10
        int number = 8;
        System.out.println(number > 5 && number < 10); //true && true --> true
        System.out.println(number > 0 && number <5); // true && false --> false

        int age = 40;
        boolean invalidAge = age < 0 || age > 120; // false || false --> false











    }
}
