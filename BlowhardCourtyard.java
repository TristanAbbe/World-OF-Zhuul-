/**
 * The BlowhardCourtyard class represents a specific type of room, namely Blowhard Courtyard, which is a subclass of the Room class.
 * It inherits properties such as description, name, and icon path from the Room class and may have additional
 * instance variables or behaviors specific to Blowhard Courtyard.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 * 
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0 (Date: YYYY-MM-DD)
 */
public class BlowhardCourtyard extends Room 
{

    /**
     * Constructor for objects of the BlowhardCourtyard class.
     * Initializes the BlowhardCourtyard with a specific description, name, and icon path.
     */
    public BlowhardCourtyard()
    {
        super ("A very neat courtyard with fountains and sculptures arranged in such a way that you are always amazed."
        +" A little too much decoration, perhaps…", "Blowhard Courtyard",
        "ImagesAlice/blowhard_cotyard.jfif",10);
    }
}
