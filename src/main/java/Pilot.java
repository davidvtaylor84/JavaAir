public class Pilot extends CrewMember{

    private String licenceNumber;
    public Pilot(String name, CrewMemberRank rank, String licenceNumber){
        super(name, rank);
        this.licenceNumber = licenceNumber;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }
}
