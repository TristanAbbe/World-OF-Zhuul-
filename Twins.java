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
        String message;

        // Different dialogues based on the state
        switch (getState()) {
            case 1:
                message = "* Two very similar people stands motionless *\n"+
                "- What peculiar little figures!\n"+
                "- If you think we're waxworks, you ought to pay you know.\n"+
                "- Contrariwise, if you think we're alive, you ought to speak to us."+
                "- Oh sorry, I am called Alice and I am trying to find my way out of here. It's almost tea time and I am beginning to be hungry."+
                "- For that we have the solution ! Always in possession of a snack on us. Will you play for it ? Would you like to play 'hide-and-seek' ?"+
                " Or 'button, button, who's got the button' ? Or a classical thumbs war ?\n";
                break;
            case 2:
                message = "\n";
                //Give the doubiprane
                
                //+"I am good, I don't have a headache anymore.";
                break;
            case 3:
                message = "- Finally! I feel better now, thank you for your help. I will grant you with the most priceless material around here."+
                "I hope you will make great use of it.\n";
                break;
            default:
                message = "* Absolem seems deeply lost in his minds, only smoke comes out of his mouth *\n";
                break;
        }

        return message;
    }
}
