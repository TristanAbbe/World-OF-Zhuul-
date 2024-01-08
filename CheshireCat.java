import javax.swing.JOptionPane;
import java.util.concurrent.TimeUnit;
import java.util.Random; 

/**
 * Represents the character Cheshire Cat in the game.
 * The CheshireCat class is a subclass of the Character class and inherits its properties and methods.
 * It introduces additional features such as customized dialogues based on the character's state.
 *
 * @author (Groupe 01)
 * @version (08/01/2024)
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
        String message = "";

        // Different dialogues based on the state
        switch (getState()) {
            case 1:
                message = ("-Good meowrning pretty girl, what is your name ?\n"+
                //TimeUnit.SECONDS.sleep(1)+
                "- My name is Alice, nice to meet you!n"+
                //TimeUnit.SECONDS.sleep(1)+
                "- What an unusual and weird name! I am the famous, the renowned and esteemed Cheshire Cat!"+ 
                "Welcome to my palace that is world-known as the 'Catwalk'.\n"+
                //TimeUnit.SECONDS.sleep(1)+
                "- Oh… Thank you dear cat for your kindness. I don’t know how I got there and I think I’m lost,"+
                "could you help me find the exit to my human world ?\n"+
                //TimeUnit.SECONDS.sleep(1)+
                "- You’re so sweet Alice, this is the real Wonderland, also known as the World of Zhuul,"+
                "you should take your time to visit it now that you’re there… We’re all mad here.\n"+
                //TimeUnit.SECONDS.sleep(1)+
                "- I guess I could visit this place a bit, which way I ought to go from here?\n"+
                //TimeUnit.SECONDS.sleep(1)+
                "- That depends a good deal on where you want to get to.\n"+
                //TimeUnit.SECONDS.sleep(1)+
                "- I don’t much care where, so long as I get somewhere.\n"+
                //TimeUnit.SECONDS.sleep(1)+
                "- Oh, you’re sure to do that, if you only walk long enough! You should try to visit my dear friend Absolem, the caterpillar."+ 
                "Just folow the clouds, Alice...\n"+
                //TimeUnit.SECONDS.sleep(1)+
                "* The Cheshire Cat mysteriously disappears, only leaving a fading white smile floating in the air *\n"+
                //TimeUnit.SECONDS.sleep(1)+
                "I’ve often seen a cat without a grin, but a grin without a cat! It’s the most curious thing I ever saw in my life!\n");
                break;
            case 2:
                message = "-Hello again, Alice, where are you running like that ?\n"+
                "- I need to find something to cure Absolem'headache...\n"+
                "- I suggest you visit the fancy pharmacy for some medication. It is located North-East from here.\n";
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
            case 7:
                message = "Congratulations, Alice! You've completed your adventures. Now, it's time to leave Wonderland.";
                break;
            default:
                Random random = new Random(); 
                int x = random.nextInt(10); 
                switch(x){
                    case 0:
                        message = "If everybody minded their own business, the world would go around a great deal faster than it does.\n";
                        break;
                    case 1: 
                        message = "We’re all mad here.\n";
                        break;
                    case 2:
                        message = "Can you stand on your head?\n";
                        break;
                    case 3:
                        message = "Let your need guide your behavior.\n";
                        break;
                    case 4:
                        message = "Collect what you can. Use it wisely.\n";
                        break;
                    case 5:
                        message = "The uninformed must improve their deficit, or die.\n";
                        break;
                    case 6:
                        message = "The proper order of things is often a mystery to me.\n";
                        break;
                    case 7:
                        message = "Imagination is the only weapon in the war with reality.\n";
                        break;
                    case 8:
                        message = "Only a few find the way, some don’t recognize it when they do – some… don’t ever want to.\n";
                        break;
                    case 9:
                        message = "I went to a hunting party once, I didn’t like it. Terrible people. They all started hunting me!\n";
                        break;
                    
                }
                return message;
        }

        return message;
    }
}
