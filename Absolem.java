import javax.swing.JOptionPane;

/**
 * Represents the character Absolem (Caterpillar) in the game.
 * The Absolem class is a subclass of the Character class and inherits its properties and methods.
 * It introduces additional features such as the ability to ask Alice for a Doubiprane and an item (SilkThread).
 *
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0
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
            case 0:
                message = "- Hello, you surely must be Absolem ? My name is Alice.\n"+
                "- Oh... My head...... Are you real or an hallucination ?\n"+
                "- I am a real person, mister Absolem.\n"+
                "- Stupid girl. You're not Absolem, I am Absolem. Oooh I'm such in great pain because of this stupid hookah...\n"+
                "- Are you high ?\n"+
                "- I am exactically three inches high, and it is a very good height indeed!\n"+
                "- What can I do to help you ?\n"+
                "- I need some medications for my head.\n"+
                "- Where can I find that ?\n"+
                "-Stop talking, you hurt my head. Leave now, come back only if you have what I need.\n";
                break;
            case 1:
                message = "Oh you again... Please don't talk.\n"+
                "- I have a medicatin called Doubiprane, will it suit you ?\n"+
                "- Aargh... GIVE IT TO ME! I can't bear the pain.\n";
                //Give the doubiprane
                
                //+"I am good, I don't have a headache anymore.";
                break;
            case 2:
                message = "- Finally! I feel better now, thank you for your help. I will grant you with the most priceless material around here."+
                "I hope you will make great use of it.\n";
                break;
            default:
                message = "* Absolem seems deeply lost in his minds, only smoke comes out of his mouth *\n";
                break;
        }
        int x = getState()+1;
        setState(x);
        return message;
    }

    /**
     * This method allows Absolem to ask Alice for a Doubiprane.
     */
    public void askForDoubiprane() {
        JOptionPane.showMessageDialog(null, "Absolem asks Alice for a Doubiprane.");
    }
}
