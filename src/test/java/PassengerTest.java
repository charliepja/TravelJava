import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    private Passenger passenger1;

    @Before
    public void before() {
        this.passenger1 = new Passenger("Charlie", 1);
    }

    @Test
    public void canGetName() {
        assertEquals("Charlie", passenger1.getName());
    }

    @Test
    public void canGetBags() {
        assertEquals(1, passenger1.getBags());
    }
}
