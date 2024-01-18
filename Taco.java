/**
 * The Taco class represents a specific type of item, namely a Taco, which is a subclass of the Item class.
 * It inherits properties such as name, description, and icon path from the Item class and may have additional
 * instance variables or behaviors specific to a Taco.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 * 
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0
 */
public class Taco extends Item
{
    /**
     * Constructor for objects of the Taco class.
     * Initializes the Taco with a specific name, description, and icon path.
     */
    public Taco()
    {
        // Initialization of instance variables
        super("Taco",
              "A specialty from moustache country, it looks very filling.",
              "ImagesAlice/tacos-signatures-big87.png");
    }
}
