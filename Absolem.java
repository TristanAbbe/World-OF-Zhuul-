import javax.swing.JOptionPane;

/**
 * Represents the character Absolem (Caterpillar) in the game.
 * The Absolem class is a subclass of the Character class and inherits its properties and methods.
 * It introduces additional features such as the ability to ask Alice for a Doubiprane and an item (SilkThread).
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Absolem extends Character {
    private SilkThread silkthread;

    /**
     * Constructs the Absolem character.
     * Initializes Absolem with the name "Absolem" and a default description.
     * Sets the initial state of having a headache and adds a SilkThread item to the character's list of items.
     */
    public Absolem() {
        super("Absolem", "Hi, I'm Absolem");
        Item silkthread = new SilkThread();
        addItem(silkthread);
    }

    /**
     * Overrides the dialogue method from the parent class to provide specific dialogues for Absolem.
     *
     * @return A specific dialogue message based on Absolem's state.
     */
    @Override
    public String dialogue() {
        String message;

        // Different dialogues based on the state
        switch (getState()) {
            case 1:
                message = "- Hello, you surely must be Absolem ? My name is Alice."+
                "- Oh... My head...... Are you real or an hallucination ?"+
                "- I am a real person, mister Absolem"+
                "- Stupid girl. You're not Absolem, I am Absolem. Oooh I'm such in great pain because of this stupid hookah..."+
                "- Are you high ?"+
                "- I am exactically three inches high, and it is a very good height indeed!"+
                "- What can I do to help you ?"+
                "- I need some medications for my head."+
                "- Where can I find that ?"+
                "-Stop talking, you hurt my head. Leave now, come back only if you have what I need.";
                break;
            case 2:
                message = "I am good, I don't have a headache anymore.";
                break;
            case 3:
                message = "I hope this string will help you.";
                break;
            default:
                message = "I am the Caterpillar. Welcome to Wonderland!";
                break;
        }

        return message;
    }

    /**
     * This method allows Absolem to ask Alice for a Doubiprane.
     */
    public void askForDoubiprane() {
        JOptionPane.showMessageDialog(null, "Absolem asks Alice for a Doubiprane.");
    }
}
