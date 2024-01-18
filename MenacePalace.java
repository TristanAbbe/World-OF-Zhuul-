/**
 * The MenacePalace class represents a specific type of room, namely Menace Palace, which is a subclass of the Room class.
 * It inherits properties such as description, name, and icon path from the Room class and may have additional
 * instance variables or behaviors specific to Menace Palace.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 * 
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0
 */
public class MenacePalace extends Room
{
    /**
     * Constructor for objects of the MenacePalace class.
     * Initializes the MenacePalace with a specific description, name, and icon path.
     */
    public MenacePalace()
    {
        super("This is the entrance to a huge, menacing house of cards! The design of this castle must have been very laborious.", 
        "Menace Palace","ImagesAliceRedimmensionnées/menace_palace.jpg",13);
    }
}
