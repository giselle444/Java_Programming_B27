package day28_methods;

public class VoidVsReturn {

    public static void main(String[] args) {
        sayHello();
        sayBye(); //the return value was not used, so we dont see any difference
        //charAt(0)
        System.out.println(sayBye()); //methods returns String
        String str= sayBye(); // method returns String and assigned
    }
  public static void sayHello(){
      System.out.println("Hello");

  }
  public static String sayBye(){
        return "Bye";
  }

    }


