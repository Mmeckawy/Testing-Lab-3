import junit.framework.TestCase;

public class Digital_watchTest extends TestCase {

    public void testGetHour() {
        Digital_watch D1 = new Digital_watch(12,44,32);
        assertEquals(12,D1.getHour());
        assertEquals(13,D1.getHour());
    }

    public void testGetMin() {
        Digital_watch D1 = new Digital_watch(12,44,32);
        assertEquals(44,D1.getMin());
        assertEquals(36,D1.getMin());
    }

    public void testGetSec() {
        Digital_watch D1 = new Digital_watch(12,44,32);
        assertEquals(32,D1.getSec());
        assertEquals(58,D1.getSec());
    }
}