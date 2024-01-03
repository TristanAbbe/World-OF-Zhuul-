import java.util.*;
/**
 * Décrivez votre classe Twins_bin_den ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Twins_bin_den extends Room
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private Twins twins;
    private List<Character> charactersList = new ArrayList<>();
    /**
     * Constructeur d'objets de classe Twins_bin_den
     */
    public Twins_bin_den()
    {
        // initialisation des variables d'instance
        super("This place looks dangerous! Better to keep both eyes open...", "Twins' Bin Den", "ImagesAlice/TwinsBinDen.png");
        //setExit("East", new No_rest_forest());
    }

    public void ajouterPersonnage()
    {
        twins = new Twins();
        charactersList.add(twins);
    }
}
