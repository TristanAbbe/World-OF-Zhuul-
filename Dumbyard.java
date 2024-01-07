/**
 * The Dumbyard class represents a specific type of room, namely a Dumbyard, which is a subclass of the Room class.
 * It inherits properties such as description, name, and icon path from the Room class and may have additional
 * instance variables or behaviors specific to a Dumbyard.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 * 
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0 (Date: YYYY-MM-DD)
 */
public class Dumbyard extends Room
{
    /**
     * Constructor for objects of the Dumbyard class.
     * Initializes the Dumbyard with a specific description, name, and icon path.
     */
    public Dumbyard()
    {
        // Initialization of instance variables
        super("This place is quite primitive, a civilized person wouldn't stay there long...",
        "Dumbyard","ImagesAlice/dumbyard.jfif",21);
    }
}
