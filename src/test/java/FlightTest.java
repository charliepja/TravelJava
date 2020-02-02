import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    private Flight flight1;
    private Plane plane1;
    private Passenger passenger1;

    @Before
    public void before() {
        this.passenger1 = new Passenger("Charlie", 1);
        this.plane1 = new Plane(PlaneType.BOEING747);
        this.flight1 = new Flight(plane1, "ABC123", "PHI", "GLA", "2130");
    }

    @Test
    public void initialPassengerCountIsZero() {
        assertEquals(0, flight1.getTotalPassengers());
    }
}
