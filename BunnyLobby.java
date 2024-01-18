/**
 * The BunnyLobby class represents a specific type of room, namely Bunny Lobby, which is a subclass of the Room class.
 * It inherits properties such as description, name, and icon path from the Room class and may have additional
 * instance variables or behaviors specific to Bunny Lobby.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 * 
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0
 */
public class BunnyLobby extends Room
{   
    private Grasnolax grasnolax;

    /**
     * Constructor for objects of the BunnyLobby class.
     * Initializes the BunnyLobby with a specific description, name, and icon path.
     */
    public BunnyLobby()
    {
        super("A small burrow that you can access through a small door but there seems to be another exit."
        +" A normal-sized person certainly couldn't enter this room. A basket of dusty Grasnolax is lying on the floor in the corner of the room, weird...", 
        "Bunny Lobby","ImagesAliceRedimmensionnées/bunny_lobby.png",18);
        
        grasnolax = new Grasnolax();
        addItem(grasnolax);
    }
}
