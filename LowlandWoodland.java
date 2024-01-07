/**
 * The LowlandWoodland class represents a specific type of room, namely a Lowland Woodland, which is a subclass of the Room class.
 * It inherits properties such as description, name, and icon path from the Room class and may have additional
 * instance variables or behaviors specific to a Lowland Woodland.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 * 
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0 (Date: YYYY-MM-DD)
 */
public class LowlandWoodland extends Room
{
    /**
     * Constructor for objects of the LowlandWoodland class.
     * Initializes the LowlandWoodland with a specific description, name, and icon path.
     */
    public LowlandWoodland()
    {
        // Initialization of instance variables
        super("Plains as far as the eye can see. I don't want to get lost...",
        "Lowland Woodland","ImagesAliceRedimmensionnées/LowlandWoodland.png",23);
    }

}
