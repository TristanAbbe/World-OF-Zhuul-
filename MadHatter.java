/**
 * Represents the character Mad Hatter in the game.
 * The MadHatter class is a subclass of the Character class and inherits its properties and methods.
 * It introduces additional features such as the Mad Hatter's unique item (Helmet).
 *
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0
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
        Item helmet = new Helmet();
        addItem(helmet);
    }
    
    /**
     * Overrides the dialogue method from the parent class to provide specific dialogues for the Mad Hatter.
     *
     * @return A specific dialogue message based on MadHatter's state.
     */
    @Override
    public String dialogue() {
        String message;

        // Different dialogues based on the state
        switch (getState()) {
            case 1:
                message = "- Alice! You're terribly late, you know. Naughty.\n "+
                "- You know my name ??\n"+
                "- I know every scalp in the realm! What a regrettably large head you have. I would very much like to hat it." 
                +"I used to hat the White Queen, you know. It wasn't very much to work with. Poor dear. Her head was so small."+
                " Do you have something in exchange for a hat ?\n";
                break;
            case 2:
                message = "Wow... That is great quality silk you are bringing me now. I will grant you with this old spiked helmet,"+
                "I think it would suit you well.";
                break;
            default:
                message = "What can I hat for you ?";
                break;
        }

        return message;
    }
    
}
