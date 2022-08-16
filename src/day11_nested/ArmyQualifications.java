package day11_nested;

public class ArmyQualifications {
    public static void main(String[] args) {


        /*
        ages: 18-35
        high school diploma
        citizen

         */

        int age = 19;
        boolean hasDiploma = true;
        boolean isCitizen = true;

        if ((age >= 18 && age <=35) && hasDiploma && isCitizen) {
            System.out.println("You qualify for the army");
        }else{
            //this multibranch is to give info about the age requirement
            if (age < 0 || age >120){ //checks for valid age numbers first
                System.out.println("Not a valid age");
            }else if (age < 18){
                System.out.println("Too young, need to be at least 18");
            }else{
                System.out.println("You are too old, limit is 35 years old");
            }
            //if to check about the diploma
            if (!hasDiploma){ // if you don't have a diploma then:
                System.out.println("You need at least a high school diploma");

            }
            //if to check about citizenship
            if (!isCitizen){
                System.out.println("You need to be a citizen to enlist");
            }

        }//end of the else for qualifying


    }// end of main method
} //end of the class
