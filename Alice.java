import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Represents the character Alice in the game.
 * The Alice class is responsible for managing Alice's inventory, hunger, and movements.
 * It contains methods for adding and removing items from the inventory, moving to different rooms,
 * and handling Alice's hunger and potential death in the game.
 * It also initializes Alice with a default inventory containing a LilDrink item.
 *
 * @author (groupe 01)
 * @version (08/01/2024)
 */
public class Alice {

    // Instance variables for Alice
    private List<Item> inventory;
    private final String name;
    private Room room;
    private int hunger = 100;
    private boolean death = false;
    private String path;
    private boolean haveHelmet = false; //remettre a false
    private int Height = 1;
    /**
     * Constructs the Alice character.
     * Initializes Alice with the name "Alice," a default path for the image,
     * an empty inventory, and a LilDrink item in the inventory.
     */
    public Alice() {
        name = "Alice";
        path = "ImagesAlice/Alice.png";
        this.inventory = new ArrayList<>();
    }

    /**
     * Sets the current room for Alice.
     * @param currentRoom The room to set as the current room for Alice.
     */
    public void setRoom(Room currentRoom) {
        room = currentRoom;
    }

    /**
     * Gets the current room of Alice.
     * @return The current room of Alice.
     */
    public Room getRoom() {
        return room;
    }


    /**
     * Gets the name of Alice.
     * @return The name of Alice.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the image path for Alice.
     * @return The image path for Alice.
     */
    public String getPath() {
        return path;
    }
    
    /**
     * Sets the path to the image associated with Alice.
     *
     * @param pathImage The new path to the image.
     * @throws IllegalArgumentException if the path is null or empty.
     */
    public void setPathImage(String pathImage) {
        if (pathImage != null && !pathImage.trim().isEmpty()) {
            this.path = pathImage.trim();
        } else {
            throw new IllegalArgumentException("Path image cannot be null or empty.");
        }
    }
    
    /**
     * Checks if Alice is dead.
     * @return True if Alice is dead, false otherwise.
     */
    public boolean getDeath() {
        return death;
    }
    
    public void setDeath(boolean alive){
        this.death = alive;
    }
        // Getter method for haveHelmet
    public boolean getHaveHelmet() {
        return haveHelmet;
    }

    // Setter method for haveHelmet
    public void setHaveHelmet(boolean haveHelmet) {
        this.haveHelmet = haveHelmet;
    }
    
    public int getHeight() {
        return Height;
    }

    // Setter method for taille
    public void setHeight(int newHeight) {
        this.Height = newHeight;
    }
    
    /**
     * Adds an item to Alice's inventory based on its name.
     * @param itemName The name of the item to add to Alice's inventory.
     */
    public void addItem(String itemName) {
        
        try {
            Item newItem = createItemName(itemName);
            inventory.add(newItem);
            System.out.println("Added item: " + itemName);
        } catch (IllegalArgumentException e) {
            System.out.println("Could not add item with name '" + itemName + "'. " + e.getMessage());
        }
    }
    
    private Item createItemName(String itemName) {
        switch (itemName.toLowerCase()) {
            case "liltledrink":
                return new LiltleDrink();
            case "grasnolax":
                return new Grasnolax();
            case "doubiprane":
                return new Doubiprane();
            case "taco":
                return new Taco();
            case "helmet":
                return new Helmet();
            case "silkthread":
                return new SilkThread();
            default:
                throw new IllegalArgumentException("Unknown item name: " + itemName);
        }
    }
    
    /**
     * Removes an item from Alice's inventory based on its name.
     * @param itemName The name of the item to remove from Alice's inventory.
     */
    public void removeItem(String itemName) {
        Iterator<Item> iterator = inventory.iterator();
        while (iterator.hasNext()) {
            Item currentItem = iterator.next();
            if (currentItem.getName().equals(itemName)) {
                iterator.remove();
                System.out.println("Removed item: " + itemName);
                return;
            }
        }
        System.out.println("Item with name '" + itemName + "' not found in the inventory.");
    }

        /**
     * Checks if Alice's inventory contains an item with the specified name.
     * @param itemName The name of the item to check for in Alice's inventory.
     * @return True if the item is in the inventory, false otherwise.
     */
    public boolean hasItem(String itemName) {
        for (Item item : inventory) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Gets the inventory of Alice.
     * @return The inventory of Alice.
     */
    public List<Item> getInventory() {
        return inventory;
    }

    /**
     * Displays the items in Alice's inventory.
     */
    public void displayInventory() {
        System.out.println("Inventory:");
        for (Item i : inventory) {
            System.out.println(i.getName());
        }
    }

    /**
     * Moves Alice to a new room in the specified direction.
     * @param direction The direction in which to move Alice.
     */
    public void move(String direction) {
        if (!death) {
            Room nextRoom = room.getExit(direction);
            if (nextRoom == null) {
                System.out.println("There is no room!");
            } else {
                Alice currentAlice = this;
                room.removeAlice(this);
                room = nextRoom;
                // Decrease hunger by 5 units before move
                currentAlice.decreaseHunger(5);
                room.ajouterAlice(currentAlice);

                if (hunger <= 0) {
                    death = true;
                }
            }
        }
    }

    /**
     * Decreases Alice's hunger by a specified amount.
     * @param amount The amount by which to decrease Alice's hunger.
     */
    public void decreaseHunger(int amount) {
        if (hunger <= 0) {
            death = true;
        }
        hunger = Math.max(0, hunger - amount);
    }

    /**
     * Gets the current hunger level of Alice.
     * @return The current hunger level of Alice.
     */
    public int getHunger() {
        return hunger;
    }

    /**
     * Feeds Alice by displaying the items in her inventory.
     */
    public void feed() {
        if (!death) {
            // browse the list to know if she owns a taco
            System.out.println("Inventory:");
            for (Item item : inventory) {
                System.out.println(item.getName());
            }
        }
    }
}
