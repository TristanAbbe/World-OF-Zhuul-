/**
 * Represents the character Twins TweedleDee and TweedleDum in the game.
 * The Twins class is a subclass of the Character class and inherits its properties and methods.
 * It introduces additional features such as a mini-game and a specific item (Taco).
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Twins extends Character {
    private MiniGame miniGame;
    private Taco taco;

    /**
     * Constructs the Twins character.
     * Initializes the twins with the name "Twins TweedleDee and TweedleDum"
     * and a default description.
     * It also adds a Taco item to the character's list of items.
     */
    public Twins() {
        super("Twins TweedleDee and TweedleDum", "Hi! We are the twins TweedleDee and TweedleDum");
        Item taco = new Taco();
        addItem(taco);
    }

    /**
     * Overrides the dialogue method from the parent class to provide a specific dialogue for the Twins.
     *
     * @return A specific dialogue message for the Twins.
     */
    @Override
    public String dialogue() {
        return "oui";
    }
}
