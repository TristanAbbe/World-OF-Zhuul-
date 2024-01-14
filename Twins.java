/**
 * Represents the character Twins TweedleDee and TweedleDum in the game.
 * The Twins class is a subclass of the Character class and inherits its properties and methods.
 * It introduces additional features such as a mini-game and a specific item (Taco).
 *
 * @author (Groupe 01)
 * @version (08/01/2024)
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
        MiniGame miniGame = new MiniGame();
    }
    
    public MiniGame getMiniGame(){
        return miniGame;
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
            case 0:
                message = "* Two very similar people stands motionless *\n"+
                "- What peculiar little figures!\n"+
                "- If you think we're waxworks, you ought to pay you know.\n"+
                "- Contrariwise, if you think we're alive, you ought to speak to us.\n"+
                "- Oh sorry, I am called Alice and I am trying to find my way out of here.\n It's almost tea time and I am beginning to be hungry.\n"+
                "- For that we have the solution ! Always in possession of a snack on us.\n Will you play for it ? Would you like to play 'hide-and-seek' ?\n"+
                " Or 'button, button, who's got the button' ?\n Or a classical thumbs war ?\n"+
                "- Let's go for a thumbs war!"+
                "- Wonderful ! To play this game, press your spacebar as many times as possible during 5 seconds.\n";
                
                
                
                break;
            case 1:
                message = "- Oh... It seems you've won... We're glad for you and we must now give what we promised.\n";
                //Give the doubiprane
                
                //+"I am good, I don't have a headache anymore.";
                break;
            case 2:
                message = "- Hope you appreciate it, it should give you enough energy to leave the place.\n";
                break;
            default:
                message = "*singing* - How do you do and shake hands, shake hands, shake hands.\n"+
                " How do you do and shake hands, state your name and business.\n";
                break;
        }

        return message;
    }
}
