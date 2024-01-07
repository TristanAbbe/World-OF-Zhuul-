/**
 * The SmokeyLobby class represents a specific type of room, namely a Smokey Lobby, which is a subclass of the Room class.
 * It inherits properties such as description, name, and icon path from the Room class and may have additional
 * instance variables or behaviors specific to a Smokey Lobby.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 * 
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0 (Date: YYYY-MM-DD)
 */
public class SmokeyLobby extends Room
{
    /**
     * Constructor for objects of the SmokeyLobby class.
     * Initializes the SmokeyLobby with a specific description, name, and icon path.
     */
    public SmokeyLobby()
    {
        // Initialization of instance variables
        super("The cloud is denser in this room; it seems to be miles long. A pink elephant appeared for a moment; it's very strange."
        +" Colors become sounds, and everything seems to be more intense. It seems that this fog confers extraordinary abilities.",
        "Smokey Lobby","ImagesAliceRedimmensionnées/Smokey_lobby.png",7);
    }

}
