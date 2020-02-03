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

    public double getBookedWeight(Flight flight, Plane plane) {
        int currentPassengers = flight.getTotalPassengers();
        double baggagePerPassenger = baggageWeightPerPassenger(plane);
        double result = currentPassengers * baggagePerPassenger;
        return result;
    }
}
