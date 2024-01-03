import java.util.*;

/**
 * Décrivez votre classe Caterpillar_craddle ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Caterpillar_craddle extends Room
{
    private Absolem chenille;
    private List<Character> charactersList = new ArrayList<>();
    /**
     * Constructeur d'objets de classe Caterpillar_craddle
     */
    public Caterpillar_craddle()
    {
        // initialisation des variables d'instance
        super("I better understand where the smoke altering reality comes from: a hookah surely coming from the countries"
        +" of sand. On both sides of the room there are fossilized skins resembling molts of butterflies, normally they should not be this big for such"
        +" a small animal. Very light silk threads starting from the ceiling cross the room with in its center a large red mushroom with white spots on"
        +" which is placed a strange character of an unempathetic nature.", "Caterpillar Craddle", "ImagesAlice/Caterpillar.png");
        //setExit("West", new Smokey_lobby());
    }
    
    public void ajouterPersonnage()
    {
        chenille = new Absolem();
        charactersList.add(chenille);
    }
}
