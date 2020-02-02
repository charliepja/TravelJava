import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    private Plane plane1;

    @Before
    public void before() {
        plane1 = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetPlaneName() {
        assertEquals("BOEING747", plane1.getPlaneName());
    }

    @Test
    public void canGetPlaneCapacity() {
        assertEquals(400, plane1.getPlaneCapacity());
    }

    @Test
    public void canGetPlaneTotalWeight() {
        assertEquals(10000, plane1.getPlaneTotalWeight());
    }
}
