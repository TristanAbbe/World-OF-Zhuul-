/**
 * Represents the character Queen of Hearts in the game.
 * The QueenOfHearts class is a subclass of the Character class and inherits its properties and methods.
 * It introduces a customized constructor to set the name and description of the Queen of Hearts character.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QueenOfHearts extends Character {

    // Instance variable for the Queen of Hearts
    private LiltleDrink lilDrink;
    private MiniGame miniGame;

    
    /**
     * Constructs the Queen of Hearts character.
     * Initializes Queen of Hearts with the name "Queen of Hearts" and a default description.
     * Also, adds a LilDrink item to the character's inventory.
     */
    public QueenOfHearts() {
        super("Queen of Hearts", "Respect me, I am the Queen of Hearts");
        Item LiltleDrink = new LiltleDrink();
        addItem(lilDrink);
        MiniGame miniGame = new MiniGame();
    }

    @Override
    public MiniGame getMiniGame(){
        return miniGame;
    }
    
    /**
     * Overrides the dialogue method to provide a specific dialogue for the Queen of Hearts.
     * @return The dialogue message specific to the Queen of Hearts.
     */
    @Override
    public String dialogue() {
        String message = "oui"; // Modify the dialogue as needed
        return message;
    }
}
