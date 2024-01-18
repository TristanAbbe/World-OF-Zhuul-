
/**
 * The WinRoom class represents a specific room in the Alice in Wonderland game,
 * where the player reaches a victory state and successfully completes the game.
 *
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0
 */
public class WinRoom extends Room 
{
    
    /**
     * WinRoom class constructor.
     * Initializes the properties of the room linked to the player's victory.
     */
    public WinRoom(){
    
        super("This is the end youre are dead", "WinRoom","ImagesAliceRedimmensionnées/Partie_Gagnée.png",42);
    }
}
