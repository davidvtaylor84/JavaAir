public class Passenger {

    private String name;
    private int noOfBags;
    private String flight;
    private int seatNumber;

    public Passenger(String name, int noOfBags, String flight, int seatNumber){
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

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}
