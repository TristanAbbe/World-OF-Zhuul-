import java.util.*;

/**
 * The TwinsBinDen class represents a specific type of room, namely a Twins' Bin Den, which is a subclass of the Room class.
 * It inherits properties such as description, name, and icon path from the Room class and may have additional
 * instance variables or behaviors specific to a Twins' Bin Den.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 * 
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0 (Date: YYYY-MM-DD)
 */
public class TwinsBinDen extends Room {
    private Twins twins;
    
    /**
     * Constructor for objects of the TwinsBinDen class.
     * Initializes the TwinsBinDen with a specific description, name, and icon path.
     * It also adds a Twins character to the room.
     */
    public TwinsBinDen() {
        super("This place looks dangerous! Better to keep both eyes open...", "Twins' Bin Den", "ImagesAlice/TwinsBinDen.png");

        twins = new Twins();
        ajouterPersonnage(twins);
    }

}
