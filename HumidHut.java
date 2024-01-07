/**
 * The HumidHut class represents a specific type of room, namely a Humid Hut, which is a subclass of the Room class.
 * It inherits properties such as description, name, and icon path from the Room class and may have additional
 * instance variables or behaviors specific to a Humid Hut.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 * 
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0 (Date: YYYY-MM-DD)
 */
public class HumidHut extends Room
{   
    /**
     * Constructor for objects of the HumidHut class.
     * Initializes the HumidHut with a specific description, name, and icon path.
     */
    public HumidHut()
    {
        // Initialization of instance variables
        super ("A small, scary and dark dirthole","Humid Hut","ImagesAliceRedimmensionnées/Humid_hut.png",1);
    }
}
