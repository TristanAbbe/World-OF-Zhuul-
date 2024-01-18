import java.util.*;

/**
 * The Catwalk class represents a specific type of room, namely a Catwalk, which is a subclass of the Room class.
 * It inherits properties such as description, name, and icon path from the Room class and may have additional
 * instance variables or behaviors specific to a Catwalk.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 * 
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0 
 */
public class Catwalk extends Room {
    private Character chat;
    
    /**
     * Constructor for objects of the Catwalk class.
     * Initializes the Catwalk with a specific description, name, and icon path.
     * It also adds a CheshireCat character to the room.
     */
    public Catwalk() {
        super("A place with cat hair everywhere. A cat basket in the corner of the room with a bowl in the shape of a cat's head next"
                + " to it. There must surely be a cat here. There is also a litter on a mushroom, hence the room's smell...",
                "Catwalk", "ImagesAliceRedimmensionnées/Catwalk.png",2);
        Character chat = new CheshireCat();
        chat.setState(1); 
        ajouterPersonnage(chat);
    }
}
