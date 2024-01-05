import java.util.*;

/**
 * The CaterpillarCraddle class represents a specific type of room, namely a Caterpillar Cradle, which is a subclass of the Room class.
 * It inherits properties such as description, name, and icon path from the Room class and may have additional
 * instance variables or behaviors specific to a Caterpillar Cradle.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 * 
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0 (Date: YYYY-MM-DD)
 */
public class CaterpillarCraddle extends Room {
    private Absolem chenille;
    
    /**
     * Constructor for objects of the CaterpillarCraddle class.
     * Initializes the CaterpillarCraddle with a specific description, name, and icon path.
     * It also adds an Absolem character (caterpillar) to the room.
     */
    public CaterpillarCraddle() {
        super("I better understand where the smoke altering reality comes from: a hookah surely coming from the countries"
                + " of sand. On both sides of the room, there are fossilized skins resembling molts of butterflies, normally they should not be this big for such"
                + " a small animal. Very light silk threads starting from the ceiling cross the room with in its center a large red mushroom with white spots on"
                + " which is placed a strange character of an unempathetic nature.", "Caterpillar Cradle", "ImagesAlice/Caterpillar.png");

        Character chenille = new Absolem();
        ajouterPersonnage(chenille);
    }
}
