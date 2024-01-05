import java.util.*;

/**
 * The HatmakersBunker class represents a specific type of room, namely Hatmaker's Bunker, which is a subclass of the Room class.
 * It inherits properties such as description, name, and icon path from the Room class and may have additional
 * instance variables or behaviors specific to Hatmaker's Bunker.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 * 
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0 (Date: YYYY-MM-DD)
 */
public class HatmakersBunker extends Room
{
    private MadHatter hatter;
    
    /**
     * Constructor for objects of the HatmakersBunker class.
     * Initializes the HatmakersBunker with a specific description, name, and icon path.
     * It also adds a MadHatter character to the room.
     */
    public HatmakersBunker()
    {
      super("A well-protected underground location. It looks like someone lives here given the amount of hats."
        +" These hats decorate the walls in a very original way, especially this little spiked helmet.", "Hatmaker's Bunker","ImagesAlice/hatmakers_bunker.png");
        
        Character hatter= new MadHatter();
        ajouterPersonnage(hatter);
    }
}
