package day37_static.pq1;

public class ComputerObject {
    public static void main(String[] args) {

        Computer obj1= new Computer(500.0, "Apple", "Black");

        System.out.println(obj1);
       // System.out.println(obj1.hasScreen); alt method of calling static

        //Access static members -> class name directly

        System.out.println(Computer.hasMemory);
        System.out.println(Computer.hasBattery);
        System.out.println(Computer.hasScreen);



    }


    }

