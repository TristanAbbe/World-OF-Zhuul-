
/**
 * Décrivez votre classe Weeping_swamp ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Weeping_swamp extends Room
{
    /**
     * Constructeur d'objets de classe Weeping_swamp
     */
    public Weeping_swamp()
    {
        super ("A not very welcoming swamp, the smells emanating from this place are so unpleasant that they make me cry."
        +" I wonder what could be hiding in this slush...", "Weeping Swamp", "ImagesAlice/dumbyard.jfif");
        //setExit("East", new Beaver_river());
        //setExit("West", new Dumbyard());
        //setExit("South",new Bunny_lobby());
    }
}
