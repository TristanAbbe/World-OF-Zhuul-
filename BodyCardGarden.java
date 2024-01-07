/**
 * The BodyCardGarden class represents a specific type of room, namely a Body-Card Garden, which is a subclass of the Room class.
 * It inherits properties such as description, name, and icon path from the Room class and may have additional
 * instance variables or behaviors specific to a Body-Card Garden.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 * 
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0 (Date: YYYY-MM-DD)
 */
public class BodyCardGarden extends Room
{
    /**
     * Constructor for objects of the BodyCardGarden class.
     * Initializes the BodyCardGarden with a specific description, name, and icon path.
     */
    public BodyCardGarden()
    {
        // Initialization of instance variables
        super("A large door adorned with precious stones stands at the end of this immense room. There seem to be cards with"
        +" arms and legs with little pointy helmets standing in front of the door. It looks like they're keeping it. Better to be discreet with them, they look dangerous.", 
        "Body-Card Garden","ImagesAliceRedimmensionnées/Body_card_garden.png",14);
    }
}
