/**
 * The NoRestForest class represents a specific type of room, namely a No-Rest Forest, which is a subclass of the Room class.
 * It inherits properties such as description, name, and icon path from the Room class and may have additional
 * instance variables or behaviors specific to a No-Rest Forest.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 * 
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0 
 */
public class NoRestForest extends Room
{
    /**
     * Constructor for objects of the NoRestForest class.
     * Initializes the NoRestForest with a specific description, name, and icon path.
     */
    public NoRestForest()
    {
        // Initialization of instance variables
        super("A big forest with big trees everywhere. There is only one narrow passage to squeeze through. You definitely"
        +" shouldn't stop for a pee break.", "No-Rest Forest","ImagesAliceRedimmensionnées/No_rest_forest.png",12);
    }

}
