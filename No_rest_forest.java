
/**
 * Décrivez votre classe No_rest_forest ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class No_rest_forest extends Room
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int x;

    /**
     * Constructeur d'objets de classe No_rest_forest
     */
    public No_rest_forest()
    {
        // initialisation des variables d'instance
        super("A big forest with big trees everywhere. There is only one narrow passage to squeeze through. You definitely"
        +" shouldn't stop for a pee break.", "No-Rest Forest", "ImagesAlice/No_rest_forest.png");
        //setExit("North", new Catwalk());
        //setExit("West", new Twins_bin_den());
        //setExit("South", new Menace_palace());
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
