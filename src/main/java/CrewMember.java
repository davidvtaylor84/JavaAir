public abstract class CrewMember {

    private CrewMemberRank rank;
    private String name;

    public CrewMember(String name, CrewMemberRank rank){
        this.name = name;
        this.rank = rank;
    }

    public CrewMemberRank getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }
}
