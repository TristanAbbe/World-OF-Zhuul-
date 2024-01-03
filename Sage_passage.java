
/**
 * Décrivez votre classe Sage_passage ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Sage_passage extends Room
{
    /**
     * Constructeur d'objets de classe Sage_passage
     */
    public Sage_passage()
    {
       super("A quiet hallway where you feel safe. Better to follow the path and not deviate.", "Sage Passage", "ImagesAlice/Sage_passage.png");
        //setExit("East", new Catwalk());
        //setExit("West", new Blowhard_courtyard());
    }
}
