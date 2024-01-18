import java.util.Scanner;
/**
 * Represents the character March Hare in the game.
 * The MarchHare class is a subclass of the Character class and inherits its properties and methods.
 * It introduces a customized constructor to set the name and description of the March Hare character.
 *
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade (Groupe 01)
 * @version (08/01/2024)
 */
public class MarchHare extends Character {

    /**
     * Constructs the March Hare character.
     * Initializes March Hare with the name "March Hare" and a default description.
     */
    public MarchHare() {
        super("March Hare", "Hi, I am the March Hare, and we are late!");
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
                message = "- What are you doing in my home you weird creature ?!\n"+
                "- Oh sorry, I didn't know someone lived here... My name is Alice and I want to rejoign my own home.\n"+
                "- I don't have time for your problems, I'm late, I'm late, I'm late.\n"+
                "- Late for what ?\n"+
                "- Late for everything you must leave now.\n"+
                "- Please tell me where the exit of this realm is, and I shall leave.\n"+
                "- I am not allowed to reaveal this information to unmad people, sorry.\n"+
                "- After seeing all the incredibilities of this world, I think that I am mad now.\n"+
                "- Let me judge about that. If you manage to answer correctly this enigma, you wouldn't be sane so I would help you in your demand."+
                " My question is: 'What comes once in a minute, twice in a moment, but never in a thousand years?'.\n";
                
                break;
            case 2:
                message = "Well... Maybe you're a bit mad after all... This is the correct answer. You've entered in the dirt, by the dirt you will leave."+
                "The only exit of this wonderland is up north, in the joyless toilets, just put your feet in the bowl and flush."+
                "You will regain your sane, tasteless and lazy world... Yuck! 5 flushes should be enough.\n";
                break;
            case 3:
                message = "Oh dear, it's as I thought you've not gone mad at all... I must hurry now, I'm late\n";
                break;
            default:
                message = "I cant talk to you right now, I am in a hurry !\n";
                break;
        }

        return message;
    }
    
    /**
     * Obtain user's answer to the rabbit's enigma.
     *
     * @return the answer for later comparison
     */
    public void getAnswer(String[] args)  
    {  
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream   
        String answer= sc.nextLine();              //reads string   
        if (answer == "m"  || answer == "M"){
            this.setState(2);
        }
        else{
            this.setState(3);
        }
        dialogue();
    }  
}
