import java.util.*;

/**
 * The HeartQueenArena class represents a specific type of room, namely a Queen of Hearts' Arena, which is a subclass of the Room class.
 * It inherits properties such as description, name, and icon path from the Room class and may have additional
 * instance variables or behaviors specific to a Queen of Hearts' Arena.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 * 
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0 (Date: YYYY-MM-DD)
 */
public class HeartQueenArena extends Room {
    private QueenOfHearts queen;
    
    /**
     * Constructor for objects of the HeartQueenArena class.
     * Initializes the HeartQueenArena with a specific description, name, and icon path.
     * It also adds a Queen of Hearts character to the room.
     */
    public HeartQueenArena() {
        super("I better understand why these body cards were guarding the door: there is a gigantic throne. Next to it, a gold"
                + " table with 2 dice placed on it. On the other side, a bar with piles of bottles as well as a small one which stands out due to its very strange"
                + " appearance. A powerful and very important person must live here, surely a king...",
                "Queen of Hearts' Arena", "ImagesAlice/Heart_queen_arena.png");

        Character queen = new QueenOfHearts();
        ajouterPersonnage(queen);
    }
}
