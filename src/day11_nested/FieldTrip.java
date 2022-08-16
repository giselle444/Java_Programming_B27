package day11_nested;

public class FieldTrip {
    public static void main(String[] args) {

        int grade = 6;
        String location= "";
        String teacher = "";
        int numberOfGroups=0;

        if(grade > 0 && grade <= 6){
            //valid grades

            if (grade == 1) {
                location = "apple orchard";
                teacher = "Ms Smith";
                numberOfGroups = 5;
            }else if(grade ==2){
                location = "zoo";
                teacher = "Ms Bond";
                numberOfGroups = 5;
            }else if(grade ==3){
                location = "aquarium";
                teacher = "Mr Reyes";
                numberOfGroups = 5;
            }else if(grade ==4){
                location = "Museum";
                teacher = "Ms Wilson";
                numberOfGroups = 5;
            }else if(grade ==5){
                location = "movie theatre";
                teacher = "Ms lee";
                numberOfGroups = 5;
            }else if(grade ==6){
                location = "Six flags";
                teacher = "Mr Bond";
                numberOfGroups = 5;

            }
        }
    }
}
