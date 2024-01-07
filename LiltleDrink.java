/**
 * The LilDrink class represents a specific type of item, namely a LilDrink, which is a subclass of the Item class.
 * It inherits properties such as name, description, and icon path from the Item class and may have additional
 * instance variables or behaviors specific to a LilDrink.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 * 
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0 (Date: YYYY-MM-DD)
 */
public class LiltleDrink extends Item
{
    /**
     * Constructor for objects of the LilDrink class.
     * Initializes the LilDrink with a specific name, description, and icon path.
     */
    public LiltleDrink()
    {
        // Initialization of instance variables
        super("Little Drink",
              "Small, attractive vial containing a bluish liquid with a label reading 'inverso quis fermentum'",
              "ImagesAlice/Ptite_boisson.png");
    }

}
