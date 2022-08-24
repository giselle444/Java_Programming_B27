package day38_encapsulation;

public class UseFlightTicket {
    public static void main(String[] args) {
        FlightTicket ticket1= new FlightTicket("first", "chicago","Virginia");

        System.out.println(ticket1.getType());
        System.out.println(ticket1.getDeparture());
        System.out.println(ticket1.getArrival());

        FlightTicket ticket2= new FlightTicket("flying", "new York", "Canada");
        System.out.println(ticket2.getType()); //null the type is not valid

        ticket2.setType("economy");
        System.out.println(ticket2.getType());



    }



}
