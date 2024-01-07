/**
 * The SagePassage class represents a specific type of room, namely a Sage Passage, which is a subclass of the Room class.
 * It inherits properties such as description, name, and icon path from the Room class and may have additional
 * instance variables or behaviors specific to a Sage Passage.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 * 
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0 (Date: YYYY-MM-DD)
 */
public class SagePassage extends Room
{
    /**
     * Constructor for objects of the SagePassage class.
     * Initializes the SagePassage with a specific description, name, and icon path.
     */
    public SagePassage()
    {
       super("A quiet hallway where you feel safe. Better to follow the path and not deviate.",
       "Sage Passage","ImagesAliceRedimmensionnées/Sage_passage.png",9);
       
    }
}
