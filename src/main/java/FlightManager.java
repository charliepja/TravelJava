public class FlightManager {

    public int weightReservedForBaggage(Plane plane) {
        int totalWeight = plane.getPlaneTotalWeight();
        int result = totalWeight / 2;
        return result;
    }
}
