
/**
 * Décrivez votre classe Menace_palace ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Menace_palace extends Room
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int x;

    /**
     * Constructeur d'objets de classe Menace_palace
     */
    public Menace_palace()
    {
        // initialisation des variables d'instance
        super("This is the entrance to a huge, menacing house of cards! The design of this castle must have been very laborious.", 
        "Menace Palace", "ImagesAlice/menace_palace.jpg");
        //setExit("North", new No_rest_forest());
        //setExit("West", new Lowland_woodland());
        //setExit("East", new Body_card_garden());
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
