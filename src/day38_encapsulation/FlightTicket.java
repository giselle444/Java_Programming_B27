package day38_encapsulation;

public class FlightTicket {
    /*
    declare these instance variables:
    type( first,business, economy
    departure location/airport
    arrival location/airport

    encapsulate all of them

    create constructor to set up the object

    Note: the type should only be first business, or economy

     */


private String type;

private  String departure;

private String arrival;

public FlightTicket(String type, String departure, String arrival){
    setType(type);
    this.departure= departure;
    this.arrival=arrival;
}

    public String getType() {
        return type;
    }

    public void setType(String type) {

        if (type.equalsIgnoreCase("first") || type.equalsIgnoreCase("business") || type.equalsIgnoreCase("economy")) {
            this.type = type;
        }
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }


    }

