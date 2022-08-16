package day04_variables;

public class Recap {
    public static void main(String[] args) {

        //declare variables
        double temperature;
        byte numberOfJavaDays;
        short numberOfSoftSkillsDays;

        //assigning value to variables
        temperature= 74.2;
        numberOfJavaDays= 4;
        numberOfSoftSkillsDays=2;
        System.out.println("temperature = " + temperature+ "C"); //Celsius
        System.out.println(numberOfJavaDays);
        System.out.println(numberOfSoftSkillsDays);

        //declare and assign at the same time
        int numberOfCoffeeCups= 2;
        float ratingOfMovie= 8.9F;//compiler takes8.9 as a double type, we add F to the end to make it the float type
        long waterInOcean= 200_000_000_000L;//compiler takes 200000000 as int type, but thus number is too big for int,
        // so it doesn't compile, we need to add L to make it a long type

        System.out.println("numberOfCoffeeCups="+ numberOfCoffeeCups);
        System.out.println("waterInOcean = " + waterInOcean);
        System.out.println("ratingOfMovie = " + ratingOfMovie);




    }
}
