package day17_string;

public class MoreMethods {
    public static void main(String[] args) {

        String s ="hello";
        System.out.println(s.isEmpty()); //false

        String s2= " "; //space char
        System.out.println(s2.isEmpty());//false

        String s3 = ""; //empty space, String but no charCTERS//true
        System.out.println(s3.isEmpty());

        //isBlank()

        String a = "  "; //spaces are characters
        System.out.println(a.isEmpty()); //checks is there is characters//false
        System.out.println(a.isBlank()); //checks for non space characters//true

        //replace
        String str = "java";
       str= str.replace('a','z');
        System.out.println(str);

        String str2 = "an apple path";
        System.out.println(str2.replace("a", "(a)")); // (a)n (a)pple p(a)th

        //common use case: delete spaces

        String str3= "   multiple words here  ";
        str3 = str3.replace(" "," ");
        System.out.println(str3);

        //remove only first
        String z = "wooden spoon";
        System.out.println(z.replace("o"," -"));//w--den sp--n
        System.out.println(z.replaceFirst("o", "-")); //w-oden spoon

        //how to replace middle character only

        String ex = "wooden spoon";
        int firstO = ex.indexOf('o');
        int secondO= ex.indexOf('o', firstO +1);
        System.out.println(ex.substring(0, secondO)); //wo
        System.out.println(ex.substring(secondO).replaceFirst("o", "-")); //-den spoon
        System.out.println(ex.substring(0, secondO) + ex.substring(secondO).replaceFirst("o","-")); //wo-den spoon
    }
}
