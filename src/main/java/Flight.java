import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrew;
    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destination;
    private String departureLocation;
    private String departureTime;
    private int capacity;

    public Flight(String flightNumber, String destination, String departureLocation, String departureTime, int capacity){
        this.pilots = new ArrayList<Pilot>();
        this.cabinCrew = new ArrayList<CabinCrewMember>();
        this.passengers = new ArrayList<Passenger>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureLocation = departureLocation;
        this.departureTime = departureTime;
        this.capacity = capacity;
    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

    public ArrayList<CabinCrewMember> getCabinCrew() {
        return cabinCrew;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public int getCapacity() {
        return capacity;
    }

    public void addPilot(Pilot pilot){
        this.pilots.add(pilot);
    }

    public void addCabinCrewMember(CabinCrewMember crew){
        this.cabinCrew.add(crew);
    }

    public int getNumberOfPilots(){
        return this.pilots.size();
    }

    public int getNumberOfCrewMembers(){
        return this.cabinCrew.size();
    }
    public int getNumberOfPassengers(){
        return this.passengers.size();
    }

    public void checkInPassenger(Passenger passenger){
        if(this.capacity > this.getNumberOfPassengers()){
            passenger.setFlight(this.flightNumber);
            this.passengers.add(passenger);}
    }

    public int getNumberOfAvailableSeats(){
        return this.capacity - this.getNumberOfPassengers();
    }
}
