import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AliceTest {

    private Alice alice;

    @Before
    public void setUp() {
        alice = new Alice();
    }

    @Test
    public void testAliceCreation() {
        assertEquals("Alice", alice.getName());
        assertNotNull(alice.getRoom());
        assertEquals(100, alice.getHunger());
        assertFalse(alice.getDeath());
        assertNotNull(alice.getInventory());
        assertEquals("ImagesAlice/Alice.png", alice.getPath());
        assertTrue(alice.getHaveHelmet());
        assertEquals(1, alice.getHeight());
    }

    @Test
    public void testSetPathImage() {
        alice.setPathImage("ImagesAlice/NewImage.png");
        assertEquals("ImagesAlice/NewImage.png", alice.getPath());

        // Test setting an empty path
        try {
            alice.setPathImage("");
            fail("Expected IllegalArgumentException not thrown for empty path.");
        } catch (IllegalArgumentException e) {
            assertEquals("Path image cannot be null or empty.", e.getMessage());
        }

        // Test setting a null path
        try {
            alice.setPathImage(null);
            fail("Expected IllegalArgumentException not thrown for null path.");
        } catch (IllegalArgumentException e) {
            assertEquals("Path image cannot be null or empty.", e.getMessage());
        }
    }

    @Test
    public void testAddItem() {
        assertFalse(alice.hasItem("Example Item"));

        alice.addItem("LiltleDrink");
        assertTrue(alice.hasItem("LiltleDrink"));
    }

    @Test
    public void testRemoveItem() {
        alice.addItem("grasnolax");
        assertTrue(alice.hasItem("grasnolax"));

        alice.removeItem("grasnolax");
        assertFalse(alice.hasItem("grasnolax"));
    }

    @Test
    public void testDecreaseHunger() {
        alice.decreaseHunger(20);
        assertEquals(80, alice.getHunger());

        alice.decreaseHunger(90);
        assertFalse(alice.getDeath());
        assertEquals(0, alice.getHunger());
    }

}
