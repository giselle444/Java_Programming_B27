package day38_encapsulation.homework;

public class Square {


       /*
        Create a class called Square
        - data:

    side

        */

    private double side;

    private double area;
    private double perimeter;

    /*
     - constructor

            - create a constructor that creates a Square object with the side

            	call setter here

     */

    public Square(double side) {
        setSide(side);
        area= calculateArea(side);
        perimeter= calculatePerimeter(side);

    }

    public double calculateArea(double side) {
        area= side * side;
        return area;

   }
   public double calculatePerimeter(double side){
        perimeter= 4*side;
        return perimeter;
   }
     public double getSide() {

      return side;
    }

   public double getArea() {
        return area;
   }



    public double getPerimeter() {
       return perimeter;
   }




    public void setSide(double side) {
        if (side > 0) {
            this.side = side;


        }
        }



    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}



