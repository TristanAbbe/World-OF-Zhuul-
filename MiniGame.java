import java.util.Random;
import javax.swing.JOptionPane;
/**
 * Décrivez votre classe MiniGame ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class MiniGame
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    boolean aliceWonTwins = false;
    /**
     * Constructeur d'objets de classe MiniGame
     */
    public MiniGame()
    {
        
    }
    
    public boolean getAliceWonTwins(){
        return aliceWonTwins;
    }
    
    /**
     *Dice game : queen of hearts and Alice play together
     *values of dice are random - Alice chooses the rules, she needs to lose to win the game
     *
     */
    public void diceGame ()
    {
        JOptionPane.showMessageDialog(null,"Welcome to the dice game !");
        
        int player1Roll = rollDice();
        int player2Roll = rollDice();
        
    }
    
    public static int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1; // Generates a random number between 1 and 6
    }

    /**
     *ThumbWar : Alice and the twins play together
     *2 rounds, 1 for each twins, Alice wins if she beats both twins 
     */
    public void thumbWar() {
        int manchesAlice = 0;
        int manchesTwins = 0;
        for (int i = 0; i < 2; i++) {
            String gagnant = jouerPileOuFace();
            if (gagnant.equals("Alice")) {
                manchesAlice++;
            } else {
                manchesTwins++;
            }
        }

        if (manchesAlice >= 2) {
            System.out.println("Alice won with " + manchesAlice + " rounds !");
            aliceWonTwins = true;
        } else {
            System.out.println("Twins won with " + manchesTwins + " rounds !");
        }
    }
    
    public String jouerPileOuFace() {
        Random rand = new Random();
        int resultat = rand.nextInt(2); // Génère 0 ou 1 (0:pile ou 1:face)
        if (resultat == 0) {
            return "Alice";
        } else {
            return "Twins";
        }
    }
}