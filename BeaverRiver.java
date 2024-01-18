/**
 * The BeaverRiver class represents a specific type of room, namely a Beaver River, which is a subclass of the Room class.
 * It inherits properties such as description, name, and icon path from the Room class and may have additional
 * instance variables or behaviors specific to a Beaver River.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 * 
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0
 */
public class BeaverRiver extends Room
{
    /**
     * Constructor for objects of the BeaverRiver class.
     * Initializes the BeaverRiver with a specific description, name, and icon path.
     */
    public BeaverRiver()
    {
       super("A small river, not that deep. However, a small animal would not be able to swim across it without a good tail.", 
        "Beaver River","ImagesAliceRedimmensionnées/Beaver_river.jpg",16);
    }
}
