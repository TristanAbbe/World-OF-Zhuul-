
/**
 * Décrivez votre classe Body_card_garden ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Body_card_garden extends Room
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int x;

    /**
     * Constructeur d'objets de classe Body_card_garden
     */
    public Body_card_garden()
    {
        // initialisation des variables d'instance
        super("A large door adorned with precious stones stands at the end of this immense room. There seem to be cards with"
        +" arms and legs with little pointy helmets standing in front of the door. It looks like they're keeping it. Better to be discreet with them, they look dangerous.", 
        "Body-Card Garden", "ImagesAlice/Body_card_garden.png");
        //setExit("East", new Heart_queen_arena());
        //setExit("West", new Menace_palace());
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
