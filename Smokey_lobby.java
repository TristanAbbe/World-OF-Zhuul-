
/**
 * Décrivez votre classe Smokey_lobby ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Smokey_lobby extends Room
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int x;

    /**
     * Constructeur d'objets de classe Smokey_lobby
     */
    public Smokey_lobby()
    {
        // initialisation des variables d'instance
        super("The cloud is denser in this room, it seems to be miles long. A pink elephant appeared for a moment, it's very strange."
        +" Colors become sounds and everything seems to be more intense. It seems that this fog confers extraordinary abilities.", "Smokey Lobby", "ImagesAlice/Smokey_lobby.png");
        //setExit("West", new Sweating_room());
        //setExit("East", new Caterpillar_craddle());
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public int sampleMethod(int y)
    {
        // Insérez votre code ici
        return x + y;
    }
}
