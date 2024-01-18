
/**
 * The Main class is the entry point for the Alice in Wonderland program.
 * It initializes the game and the GUI, thus starting the execution of the game.
 *
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0
 */
public class Main {
    /**
     * The program's main method.
     * It creates an instance of the AliceInWonderlandGame class, initializes a new game,
     * then creates an instance of the GUI class to start the graphical interface.
     */
    public static void main(String[] args) {
        // Create an instance of AliceInWonderlandGame
        AliceInWonderlandGame game = new AliceInWonderlandGame();

        // Call the newGame method on the instance
        game.newGame();

        // Create an instance of GUI and call the GUI method
        GUI gui = new GUI(game);
    }
}
