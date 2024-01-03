
/**
 * Décrivez votre classe Ware_square ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Ware_square extends Room
{

    /**
     * Constructeur d'objets de classe Ware_square
     */
    public Ware_square()
    {
     super("This place appears to be used as storage space, a bit like the cloud, but it is completely empty."
        +" There is a well-camouflaged door at the back of this place. It looks deserted.", "Ware Square", "ImagesAlice/Ware_square.png");
     //setExit("South", new Despair_alley());
     //setExit("East", new Fancy_pharmacy());
    }
}
