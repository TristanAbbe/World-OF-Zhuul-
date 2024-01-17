import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AliceInWonderlandGameTest {

    private AliceInWonderlandGame game;

    @Before
    public void setUp() {
        game = new AliceInWonderlandGame();
        game.newGame();
    }

    @Test
    public void testInitialization() {
        assertNotNull("Current room should not be null", game.getCurrentRoom());
        assertNotNull("Alice character should not be null", game.getAlice());
        assertFalse("Player should not be dead initially", game.getDeath());
    }

    @Test
    public void testPlayerMoveToValidRoom() {
        Room currentRoom = game.getCurrentRoom();
        String validDirection = currentRoom.getExitString();
        game.movePlayer(validDirection);
        assertNotEquals("Player should move to a different room", currentRoom, game.getCurrentRoom());
    }

    @Test
    public void testPlayerMoveToInvalidRoom() {
        Room currentRoom = game.getCurrentRoom();
        String invalidDirection = "InvalidDirection";
        game.movePlayer(invalidDirection);
        assertEquals("Player should stay in the same room for an invalid direction", currentRoom, game.getCurrentRoom());
    }
    
    @Test
    public void testHaveHelmet() {
        assertFalse("Player should not have a helmet initially", game.haveHelmet());
        game.getAlice().setHaveHelmet(true);
        assertTrue("Player should have a helmet", game.haveHelmet());
    }
}
