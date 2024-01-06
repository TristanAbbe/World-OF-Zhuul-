/**
 * The WareSquare class represents a specific type of room, namely Ware Square, which is a subclass of the Room class.
 * It inherits properties such as description, name, and icon path from the Room class and may have additional
 * instance variables or behaviors specific to Ware Square.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 * 
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0 (Date: YYYY-MM-DD)
 */
public class WareSquare extends Room
{

    /**
     * Constructor for objects of the WareSquare class.
     * Initializes the WareSquare with a specific description, name, and icon path.
     */
    public WareSquare()
    {
     super("This place appears to be used as storage space, a bit like the cloud, but it is completely empty."
        +" There is a well-camouflaged door at the back of this place. It looks deserted.", "Ware Square","ImagesAlice/Ware_square.png");
    }
}
