package day37_static.pq1;

public class Computer {
    /*
    Computer - static

    class name: computer:
        instance variables:
            price, brand, color, ...
            */

 public Double price;
 public String brand;
 public String color;

 public Computer(Double price, String brand, String color) {
  this.price = price;
  this.brand = brand;
  this.color = color;
 }

   //    static variables: hasScreen, hasBattery, hasMemory
   public static boolean hasScreen;
 public static boolean hasBattery;
 public static boolean hasMemory;

 static {
  hasScreen= true;
  hasBattery=true;
  hasMemory=true;
 }


   //     make objects of the class in a main method and access both instance and static members from proper references


 @Override
 public String toString() {
  return "Computer{" +
          "price=" + price +
          ", brand='" + brand + '\'' +
          ", color='" + color + '\'' +
          '}';
 }
}








