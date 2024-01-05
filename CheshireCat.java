import javax.swing.JOptionPane;

/**
 * Represents the character Cheshire Cat in the game.
 * The CheshireCat class is a subclass of the Character class and inherits its properties and methods.
 * It introduces additional features such as customized dialogues based on the character's state.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CheshireCat extends Character {

    /**
     * Constructs the Cheshire Cat character.
     * Initializes Cheshire Cat with the name "Cheshire Cat" and a default welcoming description.
     */
    public CheshireCat() {
        super("Cheshire Cat", "I am the Cheshire Cat: welcome to the game!");
    }

    /**
     * Overrides the dialogue method to provide custom dialogues based on the Cheshire Cat's state.
     *
     * @return A String representing the Cheshire Cat's dialogue.
     */
    @Override
    public String dialogue() {
        String message;

        // Different dialogues based on the state
        switch (getState()) {
            case 1:
                message = "Welcome, Alice! The Caterpillar is waiting for you. Go see him!";
                break;
            case 2:
                message = "Hello again, Alice. I suggest you visit the fancy pharmacy for some medication.";
                break;
            case 3:
                message = "Great to see you, Alice! Take the medication to the Caterpillar; he'll appreciate it.";
                break;
            case 4:
                message = "Alice, why not visit the hat makers? They create the most extraordinary hats!";
                break;
            case 5:
                message = "Alice, the Queen's palace is a fascinating place. Go and explore!";
                break;
            case 6:
                message = "Curiouser and curiouser, Alice! Venture into the bunny hole and see what awaits you.";
                break;
            default:
                message = "Congratulations, Alice! You've completed your adventures. Now, it's time to leave Wonderland.";
                break;
        }

        return message;
    }
}
