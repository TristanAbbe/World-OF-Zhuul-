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
 * Décrivez votre classe MiniGame ici.
 *
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0
 */
public class MiniGame
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    boolean aliceWonTwins = false;
    private int a;
    /**
     * Constructeur d'objets de classe MiniGame
     */
    public MiniGame()
    {
        a=1;
    }
    
    public boolean getAliceWonTwins(){
        return aliceWonTwins;
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
    
    public int rollDice() {
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
            System.out.println("Alice wins this round");
            return "Alice";
        } else {
            System.out.println("The twins win this round");
            return "Twins";
        }
    }
       
    public static int countEvent(){
        Scanner scanner = new Scanner(System.in);
        long startTime = System.currentTimeMillis();
        long endTime = startTime + 10000; // 10 secondes
        int countEspace = 0;
        while (System.currentTimeMillis() < endTime) {
            if (scanner.nextLine().equals(" ")) {
                countEspace++;
            }
        }
        return countEspace;
    }
    
    public int[] thumbsWar2() {
        int[] compteur = {0};
        JFrame buttonFrame = new JFrame("THUMBS WAR !!!");
        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton bouton = new JButton("Click fast on me");
        

        buttonFrame.add(bouton);
        buttonFrame.pack();
        buttonFrame.setVisible(true);
        
                
        bouton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                compteur[0]++;
            }
        });

        Timer timer = new Timer(10000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            buttonFrame.setVisible(false);
            buttonFrame.dispose();
            System.out.println("Nombre de clics sur le bouton en 10 secondes : " + compteur[0]);
            }
        });
        timer.setRepeats(false);
        timer.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return compteur;
    }
}