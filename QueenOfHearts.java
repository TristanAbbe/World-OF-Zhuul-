/**
 * Represents the character Queen of Hearts in the game.
 * The QueenOfHearts class is a subclass of the Character class and inherits its properties and methods.
 * It introduces a customized constructor to set the name and description of the Queen of Hearts character.
 *
 * @author (Groupe 01)
 * @version (08/01/2024)
 */
public class QueenOfHearts extends Character {

    // Instance variable for the Queen of Hearts
    private LiltleDrink lilDrink;

    
    /**
     * Constructs the Queen of Hearts character.
     * Initializes Queen of Hearts with the name "Queen of Hearts" and a default description.
     * Also, adds a LilDrink item to the character's inventory.
     */
    public QueenOfHearts() {
        super("Queen of Hearts", "Respect me, I am the Queen of Hearts");
        Item LiltleDrink = new LiltleDrink();
        addItem(lilDrink);
    }
    
    /**
     * Overrides the dialogue method to provide a specific dialogue for the Queen of Hearts.
     * @return The dialogue message specific to the Queen of Hearts.
     */
    //@Override
    public String dialogue(boolean queenControl) {
        String message = "oui"; // Modify the dialogue as needed
        if (queenControl){
            message = "- WHAT IS THIS SMALL-HEAD LADY DOING IN MY CASTLE ?!? CARDS ! CARDS !?\n"+
            "Where are my body-cards when I need them ? Still playing a guardgame I suppose…\n"+
            "What a bunch of useless papers…\n"+
            "- Excuse me my Queen, my name is Alice and I got lost in this strange world.\n"+
            "-This world isn’t strange, you are! This is MY realm and you aren’t supposed to be here !\n"+
            "OFF WITH HER HEAD NOW!!\n"+
            "- No, please don’t cut my head, I am harmless.\n"+
            "- Now, I give you fair warning, either you or your head must be off, and that in about half no time!\n"+
            "Take your choice!\n"+
            "- I choose to go, my Queen.\n"+
            "- Fair enough! But to do so, you have to win a game against my magnificence or else…\n"+
            "You'll be quoicoubeheaded! Do you accept my dice game ?";
        }
        else{   
            message = "- It takes all the running you can do, to keep in the same place.\n"+
            "If you want to get somewhere else, you must run at least twice as fast as that!\n";
        }
        return message;
    }
}

