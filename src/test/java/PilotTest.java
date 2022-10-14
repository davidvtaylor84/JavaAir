import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Randy Savage", CrewMemberRank.CAPTAIN, "007009");
    }

    @Test
    public void canGetName(){
        assertEquals("Randy Savage", pilot.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals(CrewMemberRank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void canGetLicenceNumber(){
        assertEquals("007009", pilot.getLicenceNumber());
    }
    
    @Test
    public void canFlyPlane(){
        assertEquals("We are cruising at 36,000 feet", pilot.flyPlane());
    }

}
