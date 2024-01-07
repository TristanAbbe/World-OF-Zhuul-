/**
 * The WeepingSwamp class represents a specific type of room, namely Weeping Swamp, which is a subclass of the Room class.
 * It inherits properties such as description, name, and icon path from the Room class and may have additional
 * instance variables or behaviors specific to Weeping Swamp.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 * 
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0 (Date: YYYY-MM-DD)
 */
public class WeepingSwamp extends Room
{
    /**
     * Constructor for objects of the WeepingSwamp class.
     * Initializes the WeepingSwamp with a specific description, name, and icon path.
     */
    public WeepingSwamp()
    {
        super ("A not very welcoming swamp, the smells emanating from this place are so unpleasant that they make me cry."
        +" I wonder what could be hiding in this slush...", "Weeping Swamp",
        "ImagesAlice/Weeping_swamp.png",17);
    }
}
