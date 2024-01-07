import org.junit.Test;
import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void testItemCreation() {
        Item myItem = new Item("Example Item", "This is an example item.", "");
        assertEquals("Example item", myItem.getName());
        assertEquals("This is an example item.", myItem.getDescription());
    }

    @Test
    public void testSetName() {
        Item myItem = new Item("Initial Name", "Initial Description","");

        myItem.setName("New Name");
        assertEquals("New Name", myItem.getName());

        // Test setting an empty name
        try {
            myItem.setName("");
            fail("Expected IllegalArgumentException not thrown for empty name.");
        } catch (IllegalArgumentException e) {
            assertEquals("Name cannot be null or empty.", e.getMessage());
        }

        // Test setting a null name
        try {
            myItem.setName(null);
            fail("Expected IllegalArgumentException not thrown for null name.");
        } catch (IllegalArgumentException e) {
            assertEquals("Name cannot be null or empty.", e.getMessage());
        }
    }

    @Test
    public void testSetDescription() {
        Item myItem = new Item("Initial Name", "Initial Description", "");

        myItem.setDescription("New Description");
        assertEquals("New Description", myItem.getDescription());

        // Test setting an empty description
        try {
            myItem.setDescription("");
            fail("Expected IllegalArgumentException not thrown for empty description.");
        } catch (IllegalArgumentException e) {
            assertEquals("Description cannot be null or empty.", e.getMessage());
        }

        // Test setting a null description
        try {
            myItem.setDescription(null);
            fail("Expected IllegalArgumentException not thrown for null description.");
        } catch (IllegalArgumentException e) {
            assertEquals("Description cannot be null or empty.", e.getMessage());
        }
    }
}
