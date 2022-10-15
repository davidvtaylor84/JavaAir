public class Passenger {

    private String name;
    private int noOfBags;
    private String flight;
    private String seatNumber;

    public Passenger(String name, int noOfBags, String flight, String seatNumber){
        this.name = name;
        this.noOfBags = noOfBags;
        this.flight = flight;
        this.seatNumber = seatNumber;
    }

    public String getName() {
        return name;
    }

    public int getNoOfBags() {
        return noOfBags;
    }

    public String getFlight() {
        return flight;
    }

    public String getSeatNumber() {
        return seatNumber;
    }
}
