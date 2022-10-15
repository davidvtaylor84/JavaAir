import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void before(){
        flightManager = new FlightManager(6000, 200);
        passenger1 = new Passenger("My-Eyes-Are-Bleeding Johnson", 3);
        passenger2 = new Passenger("Jane Doe", 2);
    }

    @Test
    public void canGetTotalFlightWeight(){
        assertEquals(6000, flightManager.getTotalFlightWeight());
    }

    @Test
    public void canGetFlightCapacity(){
        assertEquals(200, flightManager.getFlightCapacity());
    }

    @Test
    public void canCalculateOverallWeightForFlightLuggage(){
        assertEquals(3000, flightManager.calculateWeightReservedForLuggage());
    }

    @Test
    public void canCalculateWeightOfBagPerPerson(){
        assertEquals(15, flightManager.weightOfBagPerPerson());
    }

    @Test
    public void canCalculateWeightOfIndividualPassengersLuggage(){
        assertEquals(30, flightManager.calculatePassengersLuggageWeight(passenger2.getNoOfBags()));
    }

    @Test
    public void canCalculateRemainingLuggageWeight(){
        assertEquals(2820, flightManager.calculateHowMuchWeightForLuggageRemains(12));
    }

}
