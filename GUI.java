import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * The GUI class represents the graphical user interface for the Alice in Wonderland game.
 * It includes components such as buttons, progress bars, and text areas to interact with the game.
 * The GUI is responsible for updating the display based on the game state and player actions.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 *
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0 (2024-01-05)
 */
public class GUI {
    private AliceInWonderlandGame game;
    private Room currentRoomG;
    private JTextArea dialogueTextArea;
    private JProgressBar hungerProgressBar;
    private JFrame frame;
    private JPanel mainPanel;
    private JPanel centerPanel;
    private JPanel centerLeftPanel;
    private JPanel centerRightPanel;
    private JLabel roomImageLabel;
    private boolean victory = false;
    // Fonts
    private static final Font FONT_BIG = new Font("Arial", Font.BOLD, 40);
    private static final Font FONT_MEDIUM = new Font("Arial", Font.BOLD, 28);

    /**
     * Constructor for objects of the GUI class.
     * Initializes the GUI components and sets up the initial display.
     *
     * @param game The AliceInWonderlandGame instance associated with the GUI.
     */
    public GUI(AliceInWonderlandGame game) {
        this.game = game;
        initializeGUI();
    }

    /**
     * Initializes the graphical user interface by creating and configuring the main frame and panels.
     * It sets up components like buttons, progress bars, and text areas.
     */
    private void initializeGUI() {
        currentRoomG = game.getCurrentRoom();
        roomImageLabel = new JLabel();
        frame = new JFrame("Alice in Wonderland Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel(new BorderLayout());
        JPanel centerPanel = createCenterPanel();
        JPanel southPanel = createSouthPanel();

        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        frame.getContentPane().add(mainPanel);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }

    /**
     * Creates the center panel, which contains subpanels for room information, images, and character details.
     *
     * @return The JPanel representing the center panel.
     */
    private JPanel createCenterPanel() {
        JPanel centerPanel = new JPanel(new GridLayout(1, 3));
        centerLeftPanel = createCenterLeftPanel();
        centerPanel.add(centerLeftPanel);
        centerPanel.add(createCenterImagePanel());
        centerRightPanel = createCenterRightPanel();
        centerPanel.add(centerRightPanel);
        return centerPanel;
    }

    /**
     * Creates the left center panel, which displays room information.
     *
     * @return The JPanel representing the left center panel.
     */
    private JPanel createCenterLeftPanel() {
        JPanel panel = new JPanel(new GridLayout(2, 1));
        //panel.setPreferredSize(new Dimension(200, 150));

        JLabel nameLabel = createFormattedLabel(game.getCurrentRoom().getName(), FONT_BIG);
        JLabel descriptionLabel = createFormattedLabel(game.getCurrentRoom().getDescription(), FONT_MEDIUM);

        panel.add(nameLabel);
        panel.add(descriptionLabel);

        return panel;
    }

    /**
     * Creates a formatted JLabel with specified text and font.
     *
     * @param text The text to be displayed.
     * @param font The font to be applied to the text.
     * @return The formatted JLabel.
     */
    private JLabel createFormattedLabel(String text, Font font) {
        JLabel label = new JLabel("<html>" + text + "</html>");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(font);
        return label;
    }
    
    /**
     * Creates and returns a JPanel containing the room image displayed in the center of the GUI.
     * The image is retrieved from the current room in the game.
     *
     * @return JPanel containing the room image.
     */
    private JPanel createCenterImagePanel() {
        // Set the icon of the roomImageLabel to the image of the current room
        roomImageLabel.setIcon(new ImageIcon(game.getCurrentRoom().getPath()));
    
        // Create a new JPanel with BorderLayout to hold the room image
        JPanel imagePanel = new JPanel(new BorderLayout());
    
        // Add the roomImageLabel to the center of the imagePanel
        imagePanel.add(roomImageLabel, BorderLayout.CENTER);
    
        // Return the created imagePanel
        return imagePanel;
    }
    
    /**
     * Creates the center-right panel, which displays character images, inventory, and hunger progress bar.
     *
     * @return The JPanel representing the center-right panel.
     */
    private JPanel createCenterRightPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        ImageIcon imageAlice = new ImageIcon(game.getAlice().getPath());
        if (game.getAlice().getHaveHelmet()){
            game.getAlice().setPathImage("ImagesAlice/Alice-Casque.png");
        }
        JLabel imageLabelAlice = new JLabel(imageAlice);
        panel.add(imageLabelAlice, BorderLayout.NORTH);

        JLabel inventoryLabel = createInventoryLabel();
        panel.add(inventoryLabel, BorderLayout.CENTER);

        hungerProgressBar = new JProgressBar(0, 100);
        hungerProgressBar.setStringPainted(true);
        panel.add(hungerProgressBar, BorderLayout.SOUTH);

        return panel;
    }

    /**
     * Creates a JLabel displaying Alice's inventory items.
     *
     * @return The JLabel representing Alice's inventory.
     */
    private JLabel createInventoryLabel() {
        JLabel inventoryLabel = new JLabel("Inventory: ");
        inventoryLabel.setLayout(new FlowLayout());
        for (Item item : game.getAlice().getInventory()) {
            String iconPath = item.getIconPath();
            ImageIcon itemIcon = new ImageIcon(iconPath);
            JLabel itemLabel = new JLabel(itemIcon);
            inventoryLabel.add(itemLabel);
        }
        return inventoryLabel;
    }

    /**
     * Creates the south panel, which includes text area for dialogues and buttons for actions.
     *
     * @return The JPanel representing the south panel.
     */
    private JPanel createSouthPanel() {
        JPanel southPanel = new JPanel(new FlowLayout());
        JPanel southWestPanel = createSouthWestPanel();
        dialogueTextArea = new JTextArea(5, 40);
        dialogueTextArea.setEditable(false);  // Make it non-editable

        southPanel.add(southWestPanel);
        southPanel.add(new JScrollPane(dialogueTextArea));  // Add the dialogueTextArea in a JScrollPane

        return southPanel;
    }

    /**
     * Creates the west panel within the south panel, containing buttons for actions and movements.
     *
     * @return The JPanel representing the west panel within the south panel.
     */
    private JPanel createSouthWestPanel() {
        JPanel southWestPanel = new JPanel(new GridLayout(3, 3));

        JButton actionButton = new JButton("Action");
        JButton parlerButton = new JButton("Parler");
        JButton exitButton = new JButton("Exits");

        JButton moveLeftButton = new JButton("West");
        JButton moveUpButton = new JButton("North");
        JButton moveDownButton = new JButton("South");
        JButton moveRightButton = new JButton("East");

        JButton emptyButton4 = new JButton();
        JButton emptyButton5 = new JButton();

        southWestPanel.add(actionButton);
        southWestPanel.add(moveUpButton);
        southWestPanel.add(parlerButton);
        southWestPanel.add(moveLeftButton);
        southWestPanel.add(exitButton);
        southWestPanel.add(moveRightButton);
        southWestPanel.add(emptyButton4);
        southWestPanel.add(moveDownButton);
        southWestPanel.add(emptyButton5);

        addActionListeners(moveLeftButton, moveUpButton, moveDownButton, moveRightButton, actionButton, parlerButton, exitButton);

        return southWestPanel;
    }

    /**
     * Adds action listeners to specified buttons.
     *
     * @param buttons The buttons to which action listeners will be added.
     */
    private void addActionListeners(JButton... buttons) {
        for (JButton button : buttons) {
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    handleButtonClick(button.getText());
                }
            });
        }
    }

    /**
     * Handles button clicks based on the button label.
     * It triggers corresponding actions in the game, such as movement or interaction.
     *
     * @param buttonLabel The label of the button clicked.
     */
    private void handleButtonClick(String buttonLabel) {
        switch (buttonLabel) {
            case "West":
            case "North":
            case "South":
            case "East":
                handleMove(buttonLabel);
                break;
            case "Action":
                action();
                break;
            case "Parler":
                parler();
                break;
            case "Exits":
                sortie();
                break;
            default:
                // Handle other button actions if needed
                break;
        }
    }

    /**
     * Handles the "Action" button click, triggering the corresponding action in the game.
     */
    private void action() {
        System.out.println("room: " + game.getCurrentRoom().getName());
        
        switch (game.getCurrentRoom().getNumberRoom()) {
            case 8:
                game.trade(game.getCurrentRoom(),game.getAlice(),"Doubiprane");
                game.getAlice().displayInventory();
                break;
            case 5:
                game.trade(game.getCurrentRoom(),game.getAlice(),"");
                game.getAlice().displayInventory();
                break;
            case 11:
                game.trade(game.getCurrentRoom(),game.getAlice(),"Silkthread");
                game.getAlice().displayInventory();
                break;
            case 18:
                game.trade(game.getCurrentRoom(),game.getAlice(),"");
                game.getAlice().displayInventory();
                break;
            case 19:
                //game.hit();
                break;
            case 20:
                if (game.getCurrentRoom() instanceof JoylessToilets) {
                    JoylessToilets toilette = (JoylessToilets) game.getCurrentRoom();
                    game.flushToilet(toilette);
                    if (toilette.getCountFlushRoyal() >= 5) {
                        victory = true ; 
                        System.out.println("1" + toilette.getCountFlushRoyal());
                        handleMove("");
                    }
                    System.out.println("2" + toilette.getCountFlushRoyal());
                }
                break;
            case 14:
                
                break;
            case 15:
                
                break;
            case 22 :
                System.out.println("* Alice gives a look around *");
                parler();
                MiniGame.countEvent();
                break; 
            default:
                System.out.println("Balise 1");
                break;
        }
        System.out.println("Balise 2");
        updateHungerProgressBar();
        updateRoomInfo();
        updateRoomImage();        
    }
    
    /**
     * Handles the "Parler" button click, triggering a dialogue with characters in the current room.
     */
    public void parler() {
        List<Character> charactersList = game.getCurrentRoom().getCharacterList();
        // Check if the current room has characters
        System.out.println("room: " + game.getCurrentRoom().getName());
        System.out.println("character: " + game.getCurrentRoom().getCharacter(charactersList).getName());

        

        if (charactersList.isEmpty()) {
            appendDialogue("There is no one to speak with in this room.");
        } else {
            // take the first character in the list
            Character characterToParler = charactersList.get(0);

            // Get the character's dialogue
            String dialogue = characterToParler.dialogue();

            // Display the dialogue in the dialogueTextArea
            appendDialogue(dialogue);
        }
        updateHungerProgressBar();
        updateRoomInfo();
        updateRoomImage();
    }

    /**
     * Handles the "Exits" button click, displaying available exits from the current room.
     */
    private void sortie() {
        Room currentRoom = game.getCurrentRoom();

        // Retrieve the exits of the current room
        List<String> exits = currentRoom.getAllExits();

        // Check if there are exits
        if (!exits.isEmpty()) {
            // Display the exits in the dialogue area
            String exitsMessage = "You can go : " + String.join(", ", exits);
            appendDialogue(exitsMessage);
        } else {
            // If no exits, display a message
            appendDialogue("There are no exits in this room.");
        }
    }

    /**
     * Appends a specified message to the dialogue text area.
     *
     * @param dialogue The message to be appended to the dialogue text area.
     */
    private void appendDialogue(String dialogue) {
        dialogueTextArea.append(dialogue + "\n");
    }

    /**
     * Handles movement based on the specified direction.
     * Updates the game state and GUI display accordingly.
     *
     * @param direction The direction in which the player intends to move.
     */
    private void handleMove(String direction) {
        Room currentRoom = game.getCurrentRoom();
        Room nextRoom = currentRoom.getExit(direction);
        if (victory){
                game.setSpecificRoom("winRoom");
        }
        
        if (game.getAlice().getHaveHelmet()){
            
        }
        
        
        if (nextRoom == null) {
            JOptionPane.showMessageDialog(null, "Il n'y a pas de chambre dans cette direction !");
        }else {
            game.movePlayer(direction);
            
            if (game.getAlice().getDeath()){
                game.setSpecificRoom("RoomDeath");
            }
            updateHungerProgressBar();
            updateRoomInfo();
            updateRoomImage();
        }
    }
    
    /**
     * Updates the inventory label in the GUI to reflect the current state of Alice's inventory.
     * This method is called when there is a change in the inventory, such as adding or removing items.
     */
    public void updateInventoryLabel() {
        // Update the inventory label in the GUI
        JPanel ImagePabel = createCenterRightPanel();
        //JLabel inventoryLabel = createInventoryLabel();
        centerRightPanel.removeAll();
        centerRightPanel.add(ImagePabel, BorderLayout.CENTER);
        frame.revalidate();
        frame.repaint();
    }
    
    /**
     * Updates the hunger progress bar in the GUI to reflect Alice's current hunger level.
     * This method is called when there is a change in Alice's hunger level.
     */
    private void updateHungerProgressBar() {
        int hunger = game.getAlice().getHunger();
        hungerProgressBar.setValue(hunger);
        hungerProgressBar.setString("Hunger: " + hunger + "%");
    }
    
    /**
     * Updates the room image in the GUI to reflect the current room's image.
     * This method is called when there is a change in the current room.
     */
    private void updateRoomImage() {
        Room currentRoom = game.getCurrentRoom();
        System.out.println("Current Room: " + currentRoom.getName());
    
        // Update the room image
        String roomImagePath = game.roomImage();
        System.out.println("Room Image: " + roomImagePath);
    
        ImageIcon newImageIcon = new ImageIcon(roomImagePath);
        roomImageLabel.setIcon(newImageIcon);  // Update the existing roomImageLabel
        updateHungerProgressBar();
        centerPanel.revalidate();
        centerPanel.repaint();
    }
    
    /**
     * Updates the room information (name, description, exits) in the GUI to reflect the current room.
     * This method is called when there is a change in the current room.
     */
    private void updateRoomInfo() {
        Room currentRoom = game.getCurrentRoom();
        String roomInfo = String.format("You are in: %s\n\nDescription: %s\n\n%s",
                currentRoom.getName(),
                currentRoom.getDescription(),
                currentRoom.getExitString());
    
        JPanel info = createCenterLeftPanel();
    
        centerLeftPanel.removeAll();
        centerLeftPanel.add(info);
        centerLeftPanel.revalidate();
        centerLeftPanel.repaint();
    }
}
