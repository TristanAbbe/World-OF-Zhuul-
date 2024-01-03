
/**
 * Décrivez votre classe Sweating_room ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Sweating_room extends Room
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int x;

    /**
     * Constructeur d'objets de classe Sweating_room
     */
    public Sweating_room()
    {
        // initialisation des variables d'instance
        super("An entrance hall with sofas, armchairs and a well-stocked fridge. There even are beds. People must come here to"
        +" relax. On the other hand, the atmosphere is really heavy and hot there with all this fog but it seems to be a very particular kind of smoke, very good-smelling.", 
        "Sweating Room", "ImagesAlice/Sweating_room.png");
        //setExit("East", new Smokey_lobby());
        //setExit("North", new Despair_alley());
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
