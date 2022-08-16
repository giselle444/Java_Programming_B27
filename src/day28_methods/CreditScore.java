package day28_methods;

public class CreditScore {
    public static void main(String[] args) {

        checkScore(800);
        checkScore(600);
        System.out.println(checkScore2(789));

        if (checkScore2(600)){
            System.out.println("get a loan");
        }else {
            System.out.println("get a higher score ");
        }
    }

    public static void checkScore(int score){

        if (score > 700){
            System.out.println("Good Score");
        }else{
            System.out.println("Not a good Score");
        }
    }
    public static boolean checkScore2(int score){
        return score>700;
    }
}