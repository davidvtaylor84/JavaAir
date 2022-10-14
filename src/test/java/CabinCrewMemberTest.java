import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember crewMember1;
    CabinCrewMember crewMember2;

    @Before
    public void before(){
        crewMember1 = new CabinCrewMember("Helen Holdmywater", CrewMemberRank.LEAD_ATTENDANT);
        crewMember2 = new CabinCrewMember("Mistletoe Wineguzzler", CrewMemberRank.FLIGHT_ATTENDANT);

    }

    @Test
    public void canGetCrewName(){
        assertEquals("Helen Holdmywater", crewMember1.getName());
    }

    @Test
    public void canGetCrewRank(){
        assertEquals(CrewMemberRank.FLIGHT_ATTENDANT, crewMember2.getRank());
    }

    @Test
    public void canTalkToPassengers(){
        assertEquals("Fasten your seatbelt, sir.", crewMember2.talkToPassengers());
    }

}
