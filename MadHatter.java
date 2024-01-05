
/**
 * When Alice meets him, in exchange for a specific object (silk thread),the MadHatter gives 
 * her a guard's helmet so that she can escape the Queen of Hearts'guards.
 *
 * @author (groupe 01)
 * @version (05/01/2024)
 */
public class MadHatter extends Character
{
    /**
     * Constructeur d'objets de classe MadHatter
     */
    public MadHatter()
    {
        // initialisation des variables d'instance
        super("MadHatter","Hello my dear you are in front of the Mad Hatter!");
    }
    
    @Override
    public void receiveItem(Item item)
    {
        if (item.getName() == "Silk Thread")
        {
            setItemQuest(true);
    }
    }
    
    @Override
    public void giveItem(Character receiver, Item item) {
        if (getItemQuest()==true) {
            Item givenItem = item;
            givenItem.setName("Helmet");
            receiver.setName("Alice");
            receiver.receiveItem(givenItem);
        }
    }
    
}
