
/**
 * Décrivez votre classe Main ici.
 *
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        // Create an instance of AliceInWonderlandGame
        AliceInWonderlandGame game = new AliceInWonderlandGame();

        // Call the newGame method on the instance
        game.newGame();

        // Create an instance of GUI and call the GUI method
        GUI gui = new GUI(game);
    }
}
