import java.util.*;

/**
 * The GloriousRabbitHole class represents a specific type of room, namely Glorious Rabbit Hole, which is a subclass of the Room class.
 * It inherits properties such as description, name, and icon path from the Room class and may have additional
 * instance variables or behaviors specific to Glorious Rabbit Hole.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 * 
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0
 */
public class GloriousRabbitHole extends Room {
    private MarchHare rabbit;
    
    /**
     * Constructor for objects of the GloriousRabbitHole class.
     * Initializes the GloriousRabbitHole with a specific description, name, and icon path.
     * It also adds a MarchHare character to the room.
     */
    public GloriousRabbitHole() {
        super("A small room whose entrance is a tiny hole, a normal-sized person wouldn't be able to fit in at all!"
                + " Nevertheless, this room is very warm with gorgeous objects such as a tea set and a toilet brush. Someone must be living there.",
                "Glorious Rabbit Hole", "ImagesAliceRedimmensionnées/Glorious_rabbit_hole.png",19);

        Character rabbit = new MarchHare();
        ajouterPersonnage(rabbit);
    }
}
