/**
 * The RoomDeathBodyCard class represents a specific room in the Alice in Wonderland game,
 * used to signal the end of the game when the player loses.
 * This room displays an end-of-game message with an image representing the loss.
 *
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0
 */
public class RoomDeathBodyCard extends Room
{
    /**
     * Constructor of the RoomDeathBodyCard class.
     * Initializes the room with a name, description, image and specific number. 
     */
    public RoomDeathBodyCard(){
    
        super("This is the end youre are dead", "The END BodyCard","ImagesAliceRedimmensionnées/Mort_Partie_perdue_Encerclement.png",30);
    }

}