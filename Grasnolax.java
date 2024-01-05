/**
 * The Grasnolax class represents a specific type of item, namely a Grasnolax, which is a subclass of the Item class.
 * It inherits properties such as name, description, and icon path from the Item class and may have additional
 * instance variables or behaviors specific to a Grasnolax.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 * 
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0 (Date: YYYY-MM-DD)
 */
public class Grasnolax extends Item
{

    /**
     * Constructor for objects of the Grasnolax class.
     * Initializes the Grasnolax with a specific name, description, and icon path.
     */
    public Grasnolax()
    {
        // Initialization of instance variables
        super("Grasnolax",
              "A large cookie made from a delicious mixture of oilseeds (almonds, hazelnuts, walnuts, cashew nuts) and possibly oats and honey, which give it its fattening powers. However, it is very high in calories: no more than one at a time.",
              "ImagesAlice/Granolax.png");
    }
    
}
