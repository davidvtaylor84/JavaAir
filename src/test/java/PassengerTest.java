import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){ passenger = new Passenger("Jimmy Schnitzel", 2, null, null);}

    @Test
    public void hasName(){
        assertEquals("Jimmy Schnitzel", passenger.getName());
    }

    @Test
    public void hasNoOfBags(){
        assertEquals(2, passenger.getNoOfBags());
    }


}
