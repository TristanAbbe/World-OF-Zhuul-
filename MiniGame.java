import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
/**
 * The MiniGame class represents the mini-games that can be played as part of the Alice in Wonderland game.
 * These include a dice game and a Thumb War game.
 *
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0
 */
public class MiniGame
{
    // variables d'instance 
    private int a;
    /**
     * MiniGame class object constructor
     */
    public MiniGame()
    {
        a=1;
    }
    

    /**
     *Dice game : queen of hearts and Alice play together
     *values of dice are random - Alice chooses the rules, she needs to lose to win the game
     *
     */
    public int diceGame()
    {
        //JOptionPane.showMessageDialog(null,"Welcome to the dice game !");
        int player1Roll = rollDice();
        return player1Roll;
    }
    
    /**
     * Method to roll a die and generate a random value between 1 and 6.
     *
     * @return The randomly generated value of the die.
     */
    public int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1; // Generates a random number between 1 and 6
    }
}