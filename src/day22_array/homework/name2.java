package day22_array.homework;

public class name2 {
    public static void main(String[] args) {
        String[] str = {"James Bond", "Harry Poter", "Tony Stark", "Van Damm"};
        String initials = "";


        for (int i = 0; i < str.length; i++) {
            initials = str[i].substring(0, 1) + str[i].substring((str[i].indexOf(" ") + 1+(str[i].indexOf(" ") + 2)));
            System.out.println(initials);
        }
    }
}
