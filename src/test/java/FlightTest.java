import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot1;
    Pilot pilot2;

    CabinCrewMember crewMember1;
    CabinCrewMember crewMember2;
    CabinCrewMember crewMember3;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    Passenger passenger6;

    @Before
    public void before(){
        flight = new Flight("JAV456", "GLA","EDI", "1300", 5);
        pilot1 = new Pilot("Horace Attack-Vector", CrewMemberRank.CAPTAIN, "008008");
        pilot2 = new Pilot("Marlee Tichenor", CrewMemberRank.FIRST_OFFICER, "786023");
        crewMember1 = new CabinCrewMember("Jennifer Fillmeboots", CrewMemberRank.LEAD_ATTENDANT);
        crewMember2 = new CabinCrewMember("The Evil Saint", CrewMemberRank.FLIGHT_ATTENDANT);
        crewMember3 = new CabinCrewMember("Philomena Griswald", CrewMemberRank.FLIGHT_ATTENDANT);
        passenger1 = new Passenger("My-Eyes-Are-Bleeding Johnson", 3, null, null);
        passenger2 = new Passenger("Jane Doe", 2, null, null);
        passenger3 = new Passenger("DB Cooper", 5, null, null);
        passenger4 = new Passenger("Alison Hacker", 2, null, null);
        passenger5 = new Passenger("Wee Jimmy Cranky", 1, null, null);
        passenger6 = new Passenger("Sarah Hassenflug", 2, null, null);
        flight.addPilot(pilot1);
        flight.addPilot(pilot2);
        flight.addCabinCrewMember(crewMember1);
        flight.addCabinCrewMember(crewMember2);
        flight.addCabinCrewMember(crewMember3);
    }

    @Test
    public void haveAddedPilots(){
        assertEquals(2, flight.getNumberOfPilots());
    }

    @Test
    public void haveAddedCrewMembers(){
        assertEquals(3, flight.getNumberOfCrewMembers());
    }

    @Test
    public void canCheckInPassenger(){
        flight.checkInPassenger(passenger1);
        flight.checkInPassenger(passenger2);
        flight.checkInPassenger(passenger3);
        assertEquals(3, flight.getNumberOfPassengers());
    }

    @Test
    public void canGetNumberOfAvailableSeats(){
        flight.checkInPassenger(passenger1);
        assertEquals(4, flight.getNumberOfAvailableSeats());
    }

    @Test
    public void checkCannotExceedFlightCapacity(){
        flight.checkInPassenger(passenger1);
        flight.checkInPassenger(passenger2);
        flight.checkInPassenger(passenger3);
        flight.checkInPassenger(passenger4);
        flight.checkInPassenger(passenger5);
        flight.checkInPassenger(passenger6);
        assertEquals(5, flight.getNumberOfPassengers());
    }

}
