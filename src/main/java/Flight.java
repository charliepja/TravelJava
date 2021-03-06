import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public int getTotalPassengers() {
        return this.passengers.size();
    }

    public int availableSeats() {
        int currentPassengers = getTotalPassengers();
        int capacity = this.plane.getPlaneCapacity();

        return capacity - currentPassengers;
    }

    public void addPassenger(Passenger newPassenger) {
        if(availableSeats() > 0) {
            this.passengers.add(newPassenger);
        }
    }

}
