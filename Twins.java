
/**
 * The twins are in the "Thumbs war" room. Alice has to win a thumb 
 * fight to get a taco. If Alice loses, a message appears telling 
 * her that she has lost.
 *
 * @author (Groupe 01)
 * @version (02/01/2024)
 */
public class Twins extends Character
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    MiniGame miniGame;
    Item item;
    Alice alice;
    Taco tacos;
    /**
    * Constructeur d'objets de classe Twins
    */
    public Twins()
    {
        // initialisation des variables d'instance
        super("Twins TweedleDee and TweedleDum", "Hi ! We are the twins TweedleDee and TweedleDum"); ;
    }
    
    public void gameTwins(){
        miniGame.thumbWar(); 
        if (miniGame.aliceWonTwins){
            giveItem();
        }
    }
    
    public void giveItem() {
            Item givenItem = item;
            givenItem.setName("Taco");
            alice.receiveItem(tacos);
        }
    
    @Override
      public String dialogue()
    {
        String message = "oui";
        return message;
    }
}
