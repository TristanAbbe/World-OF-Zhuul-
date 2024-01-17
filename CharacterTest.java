import org.junit.Test;
import static org.junit.Assert.*;

public class CharacterTest {

    @Test
    public void testCharacterCreation() {
        Character myCharacter = new Character("Example Character", "This is an example character.");
        assertEquals("Example Character", myCharacter.getName());
        assertEquals("This is an example character.", myCharacter.getDescription());
        assertFalse(myCharacter.getItemQuest());
    }

    @Test
    public void testSetName() {
        Character myCharacter = new Character("Initial Name", "Initial Description");

        myCharacter.setName("New Name");
        assertEquals("New Name", myCharacter.getName());

        // Test setting an empty name
        try {
            myCharacter.setName("");
            fail("Expected IllegalArgumentException not thrown for empty name.");
        } catch (IllegalArgumentException e) {
            assertEquals("Name cannot be null or empty.", e.getMessage());
        }

        // Test setting a null name
        try {
            myCharacter.setName(null);
            fail("Expected IllegalArgumentException not thrown for null name.");
        } catch (IllegalArgumentException e) {
            assertEquals("Name cannot be null or empty.", e.getMessage());
        }
    }

    @Test
    public void testSetDescription() {
        Character myCharacter = new Character("Initial Name", "Initial Description");

        myCharacter.setDescription("New Description");
        assertEquals("New Description", myCharacter.getDescription());

        // Test setting an empty description
        try {
            myCharacter.setDescription("");
            fail("Expected IllegalArgumentException not thrown for empty description.");
        } catch (IllegalArgumentException e) {
            assertEquals("Description cannot be null or empty.", e.getMessage());
        }

        // Test setting a null description
        try {
            myCharacter.setDescription(null);
            fail("Expected IllegalArgumentException not thrown for null description.");
        } catch (IllegalArgumentException e) {
            assertEquals("Description cannot be null or empty.", e.getMessage());
        }
    }

    @Test
    public void testAddItem() {
        Character myCharacter = new Character("Example Character", "This is an example character.");
        assertFalse(myCharacter.hasItem("Example Item"));

        myCharacter.addItemSpe("Example Item");
        assertTrue(myCharacter.hasItem("Example Item"));
    }

    @Test
    public void testRemoveItem() {
        Character myCharacter = new Character("Example Character", "This is an example character.");
        myCharacter.addItemSpe("Example Item");

        assertTrue(myCharacter.hasItem("Example Item"));
        myCharacter.removeItem("Example Item");
        assertFalse(myCharacter.hasItem("Example Item"));
    }
}
