import java.util.*;

/**
 * Décrivez votre classe Glorious_rabbit_hole ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Glorious_rabbit_hole extends Room
{
    private MarchHare rabbit;
    private List<Character> charactersList = new ArrayList<>();
    /**
     * Constructeur d'objets de classe Glorious_rabbit_hole
     */
    public Glorious_rabbit_hole()
    {
        super("A small room whose entrance is a tiny hole, a normal-sized person wouldn't be able to fit in at all!"
        +" Nevertheless, this room is very warm with gorgeous objects such as a tea set and a toilet brush. Someone must be living there.", "Glorious Rabbit Hole", "ImagesAlice/Glorious_rabbit_hole.png");
        //setExit("East", new Bunny_lobby());
    }
    
    public void ajouterPersonnage(){
        rabbit = new MarchHare();
        charactersList.add(rabbit);
    }
}
