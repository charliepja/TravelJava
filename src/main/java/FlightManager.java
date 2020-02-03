public class FlightManager {

    public int weightReservedForBaggage(Plane plane) {
        int totalWeight = plane.getPlaneTotalWeight();
        int result = totalWeight / 2;
        return result;
    }

    public double baggageWeightPerPassenger(Plane plane) {
        int weightForBaggage = weightReservedForBaggage(plane);
        double totalPassengers = (double) plane.getPlaneCapacity();
        double result = weightForBaggage / totalPassengers;
        return result;
    }
}
