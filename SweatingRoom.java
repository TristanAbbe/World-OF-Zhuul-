/**
 * The SweatingRoom class represents a specific type of room, namely a Sweating Room, which is a subclass of the Room class.
 * It inherits properties such as description, name, and icon path from the Room class and may have additional
 * instance variables or behaviors specific to a Sweating Room.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 * 
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0 (Date: YYYY-MM-DD)
 */
public class SweatingRoom extends Room
{
    /**
     * Constructor for objects of the SweatingRoom class.
     * Initializes the SweatingRoom with a specific description, name, and icon path.
     */
    public SweatingRoom()
    {
        // Initialization of instance variables
        super("An entrance hall with sofas, armchairs, and a well-stocked fridge. There even are beds. People must come here to"
        +" relax. On the other hand, the atmosphere is really heavy and hot there with all this fog but it seems to be a very particular kind of smoke, very good-smelling.", 
        "Sweating Room","ImagesAlice/Sage_passage.png",6);
        //ImagesAlice/Sweating_room.png
    }

}
