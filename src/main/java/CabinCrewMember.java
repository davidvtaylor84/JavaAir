public class CabinCrewMember extends CrewMember{

    public CabinCrewMember(String name, CrewMemberRank rank){
        super(name, rank);
    }

    public String talkToPassengers(){
        return "Fasten your seatbelt, sir.";
    }


}
