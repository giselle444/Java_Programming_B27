package day11_nested.homework;

public class GradeLevel {
    /*
    Create a class called GradeLevel, Given a number grade level
    determine and print which school type someone is in.
    grade level and types are:

	any number less than 1 or more than 18 is not valid
	1-5: Elementary school
	6-8: Middle school
	9-12: High school
	13-16: College
	17-18: Grad School
     */

    public static void main(String[] args) {

        int gradeLevel=12;

        if (gradeLevel >= 1 && gradeLevel <= 18){
            if (gradeLevel <= 5){
                System.out.println("Elementary School");
            }else if (gradeLevel <= 8){
                System.out.println("Middle School");
            }else if (gradeLevel <= 12){
                System.out.println("High School");
            }else if (gradeLevel <= 16){
                System.out.println("College");
            }else{
                System.out.println("Grad School");
            }
        }else{
            if (gradeLevel<1){
                System.out.println("Invalid grade level");
            }else{
                System.out.println("Grade level cannot be over 18");
            }
        }




    }
}
