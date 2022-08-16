package day10_if_statements;

public class Retake {
    /*

    declare and assign a grade variable
    declare and assign an attempt number

    Doing a retake for the assignment will reduce the grade by a percentage based on the number of attempts taken:

	If its the first attempt -> subtract 10%
	If its the second attempt -> subtract 20%
	If its the third attempt -> subtract 35%

    Based on the retake attempt number calculate the final grade

     */

    public static void main(String[] args) {
        double grade = 80;
        int attempt = 3;
        //double first = grade * .10;
       // double second = grade * .20;
        //double third = grade * .30;
        if (attempt==1){
            System.out.println(grade -(grade * 10/100));
            //System.out.println(grade-first);
        }else if (attempt == 2){
            System.out.println(grade-(grade * 20/100));
            //System.out.println(grade-second);
        }else if (attempt == 3){
            System.out.println(grade - (grade*35/100));
            //System.out.println(grade -third);
        }






    }
}
