
/**
 * Décrivez votre classe Main ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
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
