package day38_encapsulation.homework;
public class Pizza {

    /*
     - data:

            size (String), number of toppings

     */

    private String size;
    private int numberOfToppings;


    public Pizza(String size, int numberOfToppings) {
        setSize(size);
        setNumberOfToppings(numberOfToppings);

    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    public void setNumberOfToppings(int numberOfToppings) {
        if (numberOfToppings > 0) {
            this.numberOfToppings = numberOfToppings;
        }

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if ((size.equalsIgnoreCase("small")) || (size.equalsIgnoreCase("medium")) || (size.equalsIgnoreCase("large"))) {
            this.size = size;
        }

    }


    public double calculatePrice() {
        double cost = 0;

        if (size == null) {
            System.out.println("Size not valid");

        }else if (size.equals("small")) {
                cost = 4 + (numberOfToppings * .75);
            }else if (size.equals("medium")) {
            cost = 6 + (numberOfToppings * .75);
        }else if (size.equals("large")) {
                        cost = 8 + (numberOfToppings * .75);
                    }

                return cost;


            }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfToppings=" + numberOfToppings +
                ", cost of pizza" + calculatePrice() +
                '}';
    }
}



