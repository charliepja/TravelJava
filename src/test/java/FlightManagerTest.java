import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flight1;
    private Plane plane1;

    @Before
    public void before() {
        this.flight1 = new FlightManager();
        this.plane1 = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetWeightReservedForBaggage() {
        assertEquals(5000, flight1.weightReservedForBaggage(plane1));
    }
}
