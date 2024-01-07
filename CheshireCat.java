import javax.swing.JOptionPane;
import java.util.concurrent.TimeUnit;

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
                message = ("-Good meowrning pretty girl, what is your name ?"+
                //TimeUnit.SECONDS.sleep(1)+
                "- My name is Alice, nice to meet you!"+
                //TimeUnit.SECONDS.sleep(1)+
                "- What an unusual and weird name! I am the famous, the renowned and esteemed Cheshire Cat!"+ 
                "Welcome to my palace that is world-known as the 'Catwalk'."+
                //TimeUnit.SECONDS.sleep(1)+
                "- Oh… Thank you dear cat for your kindness. I don’t know how I got there and I think I’m lost,"+
                "could you help me find the exit to my human world ?"+
                //TimeUnit.SECONDS.sleep(1)+
                "- You’re so sweet Alice, this is the real Wonderland, also known as the World of Zhuul,"+
                "you should take your time to visit it now that you’re there… We’re all mad here."+
                //TimeUnit.SECONDS.sleep(1)+
                "- I guess I could visit this place a bit, which way I ought to go from here?"+
                //TimeUnit.SECONDS.sleep(1)+
                "- That depends a good deal on where you want to get to."+
                //TimeUnit.SECONDS.sleep(1)+
                "- I don’t much care where, so long as I get somewhere."+
                //TimeUnit.SECONDS.sleep(1)+
                "- Oh, you’re sure to do that, if you only walk long enough! You should try to visit my dear friend Absolem, the caterpillar."+ 
                "Just folow the clouds, Alice..."+
                //TimeUnit.SECONDS.sleep(1)+
                "* The Cheshire Cat mysteriously disappears, only leaving a fading white smile floating in the air *"+
                //TimeUnit.SECONDS.sleep(1)+
                "I’ve often seen a cat without a grin, but a grin without a cat! It’s the most curious thing I ever saw in my life!");
                break;
            case 2:
                message = "-Hello again, Alice, where are you running like that ?\n"+
                "- I need to find something to cure Absolem'headache...\n"+
                "- I suggest you visit the fancy pharmacy for some medication. It is located North-East from here";
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
