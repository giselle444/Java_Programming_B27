package day06_operators;

public class WalkingPractice {
    public static void main(String[] args) {

        boolean isRaining= false;
        double temperature= 79.5;
        boolean goForAWalk = isRaining != true && temperature > 68;
        System.out.println("Go for a walk: " + goForAWalk);



    }

}
