import java.util.*;

/**
 * Décrivez votre classe Hatmakers_bunker ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Hatmakers_bunker extends Room
{
    private MadHatter hatter;
    private List<Character> charactersList = new ArrayList<>();
    /**
     * Constructeur d'objets de classe Hatmakers_bunker
     */
    public Hatmakers_bunker()
    {
      super("A well-protected underground location. It looks like someone lives here given the amount of hats."
        +" These hats decorate the walls in a very original way, especially this little spiked helmet.", "Hatmaker's Bunker", "ImagesAlice/hatmakers_bunker.png");
      //setExit("East", new Blowhard_courtyard());
    }
    public void ajouterPersonnage(){
        hatter= new MadHatter();
        charactersList.add(hatter);
    }
}
