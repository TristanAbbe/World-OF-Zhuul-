/**
 * Represents the character Mad Hatter in the game.
 * The MadHatter class is a subclass of the Character class and inherits its properties and methods.
 * It introduces additional features such as the Mad Hatter's unique item (Helmet).
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MadHatter extends Character {
    private Helmet helmet;

    /**
     * Constructs the Mad Hatter character.
     * Initializes Mad Hatter with the name "MadHatter" and a default description.
     * Adds a Helmet item to the Mad Hatter's list of items.
     */
    public MadHatter() {
        super("MadHatter", "Hello my dear, you are in front of the Mad Hatter!");
        helmet = new Helmet();
        addItem(helmet);
    }
}
