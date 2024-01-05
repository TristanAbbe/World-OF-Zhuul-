import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private AliceInWonderlandGame game;
    private Room currentRoomG;
    private JTextArea dialogueTextArea;
    private Alice alice;
    private JProgressBar hungerProgressBar;
    private JLabel roomImageLabel;
    private JPanel centerLeftPanel; // Déclarer centerLeftPanel comme un champ de classe

        public GUI() {
        this.alice = new Alice();
        this.game = new AliceInWonderlandGame();
        roomImageLabel = new JLabel();
        updateRoomImage();
        JFrame frame = new JFrame("Alice in Wonderland Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main content panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Center panel with Grid
        JPanel centerPanel = new JPanel(new GridLayout(1, 3));
        centerLeftPanel = new JPanel(new GridLayout(2, 1)); // Initialiser centerLeftPanel
        JPanel centerRightPanel = new JPanel(new BorderLayout());

        JTextArea descriptionArea = new JTextArea();
        // À remplacer par afficheDescriptionSalle()
        descriptionArea.setText("test");
        descriptionArea.setEditable(false);
        centerLeftPanel.add(descriptionArea);

        centerPanel.add(centerLeftPanel);

        // Créer une instance de JLabel avec une ImageIcon
        roomImageLabel = new JLabel();
        centerPanel.add(roomImageLabel);

        // Create inventory label
        JLabel inventoryLabel = afficheInventaire();
        centerRightPanel.add(inventoryLabel, BorderLayout.NORTH);

        // Create hunger progress bar
        hungerProgressBar = new JProgressBar(0, 100);
        hungerProgressBar.setStringPainted(true); // Show percentage text
        centerRightPanel.add(hungerProgressBar, BorderLayout.SOUTH);

        centerPanel.add(centerRightPanel);

        mainPanel.add(centerPanel, BorderLayout.CENTER);

        // South panel
        JPanel southPanel = new JPanel(new FlowLayout());
        JPanel southWestPanel = new JPanel(new GridLayout(3, 3));

        JButton emptyButton1 = new JButton();
        JButton emptyButton2 = new JButton();
        JButton emptyButton3 = new JButton();
        JButton emptyButton4 = new JButton();
        JButton emptyButton5 = new JButton();

        JButton moveLeftButton = new JButton("Ouest");
        JButton moveUpButton = new JButton("North");
        JButton moveDownButton = new JButton("South");
        JButton moveRightButton = new JButton("East");

        // Create movement buttons
        southWestPanel.add(emptyButton1);
        southWestPanel.add(moveUpButton);
        southWestPanel.add(emptyButton2);
        southWestPanel.add(moveLeftButton);
        southWestPanel.add(emptyButton3);
        southWestPanel.add(moveDownButton);
        southWestPanel.add(emptyButton4);
        southWestPanel.add(moveRightButton);
        southWestPanel.add(emptyButton5);
        southPanel.add(southWestPanel);
        
        //add menu button
        JButton menuButton = new JButton("Menu");
        southPanel.add(menuButton);
        menuButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                showMenu();
            }
        });
       
        
        
        
        
        
        // Add ActionListener to the movement buttons
        moveLeftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleMove("West");
            }
        });

        moveUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleMove("North");
            }
        });

        moveDownButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleMove("South");
            }
        });

        moveRightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleMove("East");
            }
        });

        // Create actions buttons
        JButton actionButton = new JButton("Action");
        actionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action();
            }
        });

        JButton parlerButton = new JButton("Parler");
        parlerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parler();
            }
        });
        southPanel.add(actionButton);
        southPanel.add(parlerButton);

        JPanel southeastPanel = new JPanel(new BorderLayout());
        dialogueTextArea = new JTextArea();
        dialogueTextArea.setEditable(false); // Make it non-editable
        southeastPanel.add(new JScrollPane(dialogueTextArea), BorderLayout.CENTER);
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        frame.getContentPane().add(mainPanel);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

public void parler() {
        // Check if the current room has a character
        if (currentRoomG != null && currentRoomG.getCharacter() != null) {
            // Display the character's dialogue
            String dialogue = currentRoomG.getCharacter().dialogue();
            appendDialogue(dialogue);
        } else {
            // Display a generic message if there is no character in the room
            appendDialogue("There is no one to parler with in this room.");
        }
    }

    // Method to append dialogue to the TextArea
    private void appendDialogue(String dialogue) {
        dialogueTextArea.append(dialogue + "\n");
    }

    // Method to handle movement based on the button clicked
    // Method to handle movement based on the button clicked
    private void handleMove(String direction) {
      Room currentRoom = game.getCurrentRoom();
      Room nextRoom = currentRoom.getExit(direction);

    if (nextRoom == null) {
        JOptionPane.showMessageDialog(null, "Il n'y a pas de chambre dans cette direction !");
    } else {
        game.movePlayer(direction);
        alice.decreaseHunger(5);  // Décrémenter la faim uniquement si la direction mène à une sortie
        updateHungerProgressBar();
        updateRoomInfo();
        updateRoomImage();
    }
    }


    private void updateHungerProgressBar() {
        int hunger = alice.getHunger();
        hungerProgressBar.setValue(hunger);
        hungerProgressBar.setString("Hunger: " + hunger + "%");
    }

    private void updateRoomImage() {
    Room currentRoom = game.getCurrentRoom();
    System.out.println("Current Room: " + currentRoom.getName());

    // Reste du code...

    // Mettre à jour l'image de la chambre
    String roomImage = game.updateRoomImage();
    System.out.println("Room Image: " + roomImage);

    try {
        // Essayer de créer l'ImageIcon et imprimer des informations de débogage
        ImageIcon originalIcon = new ImageIcon(roomImage);
        System.out.println("Original Icon created successfully.");

        int maxWidth = 400;
        int maxHeight = 400;

        Image scaledImage = originalIcon.getImage().getScaledInstance(
                maxWidth, maxHeight, Image.SCALE_SMOOTH);

        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        roomImageLabel.setIcon(scaledIcon);

        updateHungerProgressBar();
    } catch (Exception e) {
        // Attraper toute exception et imprimer des informations de débogage
        e.printStackTrace();
        System.out.println("Exception occurred during ImageIcon creation.");
    }
}

// Method to update room information (name, description, exits)
private void updateRoomInfo() {
    Room currentRoom = game.getCurrentRoom();
    String roomInfo = String.format("You are in: %s\n\nDescription: %s\n\n%s",
            currentRoom.getName(),
            currentRoom.getDescription(),
            currentRoom.getExitString());

    JTextArea descriptionArea = new JTextArea(roomInfo);
    descriptionArea.setEditable(false);
    descriptionArea.setLineWrap(true);
    descriptionArea.setWrapStyleWord(true);

    JScrollPane scrollPane = new JScrollPane(descriptionArea);

    // Vérifier si centerLeftPanel est initialisé
    if (centerLeftPanel == null) {
        centerLeftPanel = new JPanel(new GridLayout(2, 1));
    }

    centerLeftPanel.removeAll();
    centerLeftPanel.add(scrollPane);
    centerLeftPanel.revalidate();
    centerLeftPanel.repaint();
}


    public JLabel afficheInventaire() {
        List<Item> inventory = alice.getInventory();
        // Create a label to hold the inventory icons
        JLabel inventoryLabel = new JLabel();

        // Set the layout to a horizontal flow layout
        inventoryLabel.setLayout(new FlowLayout());

        for (Item item : inventory) {
            // Get the icon path for the current item
            String iconPath = item.getIconPath();

            // Create an ImageIcon using the icon path
            ImageIcon itemIcon = new ImageIcon(iconPath);

            // Create a label with the item's icon
            JLabel itemLabel = new JLabel(itemIcon);

            // Add the label to the inventory label
            inventoryLabel.add(itemLabel);
        }

        return inventoryLabel;
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUI();
            }
        });
    }

    public void action() {

    }
    private void showMenu(){
        // creation of a window about menu
        JFrame menuFrame = new JFrame("Menu");
        menuFrame.setSize(200,150);
        menuFrame.setLocationRelativeTo(null);
        //Add buttons for option of menu
        JButton quitButton = new JButton("Quitter le jeu");
        JButton continueButton = new JButton("Continuer");
        
        quitButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //Pour gérer l'action "quitter le jeu"
                System.exit(0);
            }
        });
        continueButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //Pour gérer l'action "continuer"
                menuFrame.dispose();
            }
        });
        //Add button at menuFrame
        JPanel menuPanel = new JPanel(new GridLayout(2,1));
        menuPanel.add(quitButton);
        menuPanel.add(continueButton);
        menuFrame.add(menuPanel);
        //Display menuFrame
        menuFrame.setVisible(true);
    }
}
