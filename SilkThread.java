/**
 * The SilkThread class represents a specific type of item, namely a Silk Thread, which is a subclass of the Item class.
 * It inherits properties such as name, description, and icon path from the Item class and may have additional
 * instance variables or behaviors specific to a Silk Thread.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 * 
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0 (Date: YYYY-MM-DD)
 */
public class SilkThread extends Item
{
    /**
     * Constructor for objects of the SilkThread class.
     * Initializes the SilkThread with a specific name, description, and icon path.
     */
    public SilkThread()
    {
        // Initialization of instance variables
        super("SilkThread",
              "Despite its fragility, this surprisingly light gift could well be used to make magnificent garments. If you're good with your fingers and your head, you can do it.",
              "ImagesAlice/fil_de_soie.png");
    }

}
