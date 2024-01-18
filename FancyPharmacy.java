import java.util.*;

/**
 * The FancyPharmacy class represents a specific type of room, namely a Fancy Pharmacy, which is a subclass of the Room class.
 * It inherits properties such as description, name, and icon path from the Room class and may have additional
 * instance variables or behaviors specific to a Fancy Pharmacy.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 * 
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0
 */
public class FancyPharmacy extends Room
{   
    private Doubiprane doubiprane;
    
    /**
     * Constructor for objects of the FancyPharmacy class.
     * Initializes the FancyPharmacy with a specific description, name, and icon path.
     * It also adds a Doubiprane item to the room.
     */
    public FancyPharmacy()
    {
       super("I better understand why this room was hidden, there are tons of packaged medicine arranged in a very symmetrical way!"
        +" Among all its well-maintained goods, one of them stands out with a streak of light delicately depositing on the packaging, reflecting all its"
        +" splendor in the room. This is a box of Doubiprane.", "Fancy Pharmacy",
        "ImagesAliceRedimmensionnées/Fancy_farmacy.png",5);
        
        doubiprane = new Doubiprane();
        addItem(doubiprane); 
    }
}
