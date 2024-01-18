/**
 * The Doubiprane class represents a specific type of item, namely a Doubiprane, which is a subclass of the Item class.
 * It inherits properties such as name, description, and icon path from the Item class and may have additional
 * instance variables or behaviors specific to a Doubiprane.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 * 
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0
 */
public class Doubiprane extends Item
{
    /**
     * Constructor for objects of the Doubiprane class.
     * Initializes the Doubiprane with a specific name, description, and icon path.
     */
    public Doubiprane()
    {
        // Initialization of instance variables
        super("Doubiprane",
              "A small box sold by apothecaries. This product works miracles in cases of malaise and fever. It is written 'not to be taken under penalty of seeing these dreams come true, see prescription with your doctor'.",
              "ImagesAlice/Doubiprane.png");
    }
}
