/**
 * The Helmet class represents a specific type of item, namely a Helmet, which is a subclass of the Item class.
 * It inherits properties such as name, description, and icon path from the Item class and may have additional
 * instance variables or behaviors specific to a Helmet.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 * 
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0 (Date: YYYY-MM-DD)
 */
public class Helmet extends Item
{
    /**
     * Constructor for objects of the Helmet class.
     * Initializes the Helmet with a specific name, description, and icon path.
     */
    public Helmet()
    {
        // Initialization of instance variables
        super("Helmet",
              "This magnificent headgear adorned with a menacing spike could well come in handy. They seem to be the same ones used by the body cards.",
              "ImagesAlice/casque.png");
    }
}
