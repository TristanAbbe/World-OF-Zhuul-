
/**
 * Décrivez votre classe Lowland_woodland ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Lowland_woodland extends Room
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int x;

    /**
     * Constructeur d'objets de classe Lowland_woodland
     */
    public Lowland_woodland()
    {
        // initialisation des variables d'instance
        super("Plains as far as the eye can see. I don't want to get lost...","Lowland Woodland", "ImagesAlice/LowlandWoodland.png");
        //setExit("East", new Menace_palace());
    }
}
