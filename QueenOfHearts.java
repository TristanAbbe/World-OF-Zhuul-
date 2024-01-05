
/**
 * When Alice meets the Queen, the 2 characters play a game of dice.
 * The player decides the rules: the highest score wins or the 
 * lowest score wins. If the player decides to let the Queen win, 
 * the guards spread around the room point out the direction in 
 * which the rabbit is in order to help Alice, otherwise the guards
 * will cut off its head.
 *
 * @author (Groupe 01)
 * @version (05/01/2024)
 */
public class QueenOfHearts extends Character
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int x;
    
    /**
     * Constructeur d'objets de classe QueenOfHearts
     */
    public QueenOfHearts()
    {
        // initialisation des variables d'instance
        super("Queen of Hearts","Respect me I am the Queen of Hearts");
    }

    @Override
    public void receiveItem(Item item)
    {
        
    }
    
    /**
     * @return     le message
     */
    @Override
      public String dialogue()
    {
        String message = "oui";
        return message;
    }
}
