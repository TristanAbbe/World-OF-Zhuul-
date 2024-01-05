/**
 * The JoylessToilets class represents a specific type of room, namely Joyless Toilets, which is a subclass of the Room class.
 * It inherits properties such as description, name, and icon path from the Room class and may have additional
 * instance variables or behaviors specific to Joyless Toilets.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 * 
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0 (Date: YYYY-MM-DD)
 */
public class JoylessToilets extends Room
{
    /**
     * Constructor for objects of the JoylessToilets class.
     * Initializes the JoylessToilets with a specific description, name, and icon path.
     */
    public JoylessToilets()
    {
        super("Magnificent toilets but with a slightly worn color making the atmosphere heavy and oppressive."
        +" The brush is missing.", "Joyless Toilets","ImagesAlice/Joyless_toilets.png");
    }
}
