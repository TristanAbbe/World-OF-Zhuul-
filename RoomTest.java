// import org.junit.Test;
// import static org.junit.Assert.*;

// public class RoomTest {

    // @Test
    // public void testRoomCreation() {
        // // Create a room and check its properties
        // Room room = new Room("This is a kitchen.", "Kitchen");
        // assertEquals("Kitchen", room.getName());
        // assertEquals("This is a kitchen.", room.getDescription());
    // }

    // @Test
    // public void testSetAndGetExit() {
        // // Create two rooms
        // Room room1 = new Room("This is a living room.", "Living Room");
        // Room room2 = new Room("This is a bedroom.", "Bedroom");

        // // Set an exit from room1 to room2
        // room1.setExit("north", room2);

        // // Check if the exit is set correctly
        // assertEquals(room2, room1.getExit("north"));
    // }

    // @Test
    // public void testGetExitString() {
        // // Create a room and set exits
        // Room room = new Room("This is a hallway.", "Hallway");
        // Room roomNorth = new Room("This is the north room.", "North Room");
        // Room roomSouth = new Room("This is the south room.", "South Room");

        // room.setExit("north", roomNorth);
        // room.setExit("south", roomSouth);

        // // Check if the string of exits is generated correctly
        // String expected = "Exits: north south";
        // assertEquals(expected, room.getExitString());
    // }

    // @Test(expected = IllegalArgumentException.class)
    // public void testSetNameWithNull() {
        // // Try setting name to null, should throw IllegalArgumentException
        // Room room = new Room("This is a test room.", null);
    // }

    // @Test(expected = IllegalArgumentException.class)
    // public void testSetNameWithEmptyString() {
        // // Try setting name to an empty string, should throw IllegalArgumentException
        // Room room = new Room("This is a test room.", "");
    // }

    // @Test(expected = IllegalArgumentException.class)
    // public void testSetDescriptionWithNull() {
        // // Try setting description to null, should throw IllegalArgumentException
        // Room room = new Room(null, "Test Room");
    // }

    // @Test(expected = IllegalArgumentException.class)
    // public void testSetDescriptionWithEmptyString() {
        // // Try setting description to an empty string, should throw IllegalArgumentException
        // Room room = new Room("", "Test Room");
    // }
// }