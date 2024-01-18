/**
 * The DespairAlley class represents a specific type of room, namely a Despair Alley, which is a subclass of the Room class.
 * It inherits properties such as description, name, and icon path from the Room class and may have additional
 * instance variables or behaviors specific to a DespairAlley.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 * 
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0
 */
public class DespairAlley extends Room
{
    /**
     * Constructor for objects of the DespairAlley class.
     * Initializes the DespairAlley with a specific description, name, and icon path.
     */
    public DespairAlley()
    {
       super("There's a sign with the words: 'You who enter here, abandon all hope…'. Charming…",
       "Despair Alley",
       "ImagesAliceRedimmensionnées/Despair_alley.png"
       ,3);
    }
}
