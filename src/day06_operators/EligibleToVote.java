package day06_operators;

public class EligibleToVote {
    public static void main(String[] args) {

        int age = 21;

        boolean isCitizen = true;
        boolean hasFelony= false;
        boolean over18= age >= 18;

        boolean isEligible = isCitizen && over18 && !hasFelony; // !hasFelony the ! makes this does not have felony
        System.out.println(isEligible); // true you can vote

        /*
        int age = 21;

        boolean isCitizen = true;
        boolean hasFelony= true; you have a felony
        boolean over18= age >= 18;

        boolean isEligible = isCitizen && over18 && !hasFelony;
        System.out.println(isEligible); // false you cannot vote!
        


         */




    }
}
