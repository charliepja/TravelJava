import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flight1;
    private Plane plane1;
    private Passenger passenger1;
    private Flight flight2;

    @Before
    public void before() {
        this.flight1 = new FlightManager();
        this.plane1 = new Plane(PlaneType.BOEING747);
        this.passenger1 = new Passenger("Charlie", 1);
        this.flight2 = new Flight(plane1, "ABC123", "LON", "GLA", "0700");
    }

    @Test
    public void canGetWeightReservedForBaggage() {
        assertEquals(5000, flight1.weightReservedForBaggage(plane1));
    }

    @Test
    public void canGetBaggagePerPassenger() {
        assertEquals(12.50, flight1.baggageWeightPerPassenger(plane1), 0.01);
    }

    @Test
    public void canGetCurrentBaggageWeightBooked() {
        flight2.addPassenger(passenger1);
        flight2.addPassenger(passenger1);
        flight2.addPassenger(passenger1);
        assertEquals(37.50, flight1.getBookedWeight(flight2, plane1), 0.01);
    }
}
