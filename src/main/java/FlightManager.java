public class FlightManager {


    private int totalFlightWeight;

    private int flightCapacity;

    public FlightManager(int totalFlightWeight, int flightCapacity){
        this.totalFlightWeight = totalFlightWeight;
        this.flightCapacity = flightCapacity;
    }


    public int getTotalFlightWeight() {
        return totalFlightWeight;
    }

    public int getFlightCapacity() {
        return flightCapacity;
    }

    public int calculateWeightReservedForLuggage(){
        return this.totalFlightWeight /2;
    }

    public int weightOfBagPerPerson(){
        return calculateWeightReservedForLuggage() / this.flightCapacity;
    }

    public int calculatePassengersLuggageWeight(int noOfBags){
        return  weightOfBagPerPerson() * noOfBags;
    }

    public int calculateHowMuchWeightForLuggageRemains(int totalNoOfBags){
        return calculateWeightReservedForLuggage() - (totalNoOfBags * weightOfBagPerPerson());
    }

}
