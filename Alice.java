import java.util.ArrayList;
import java.util.List;

/**
 * Represents the character Alice in the game.
 * The Alice class is responsible for managing Alice's inventory, hunger, and movements.
 * It contains methods for adding and removing items from the inventory, moving to different rooms,
 * and handling Alice's hunger and potential death in the game.
 * It also initializes Alice with a default inventory containing a LilDrink item.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Alice {

    // Instance variables for Alice
    private LilDrink lilDrink;
    private List<Item> inventory;
    private String name;
    private Room room;
    private int hunger = 100;
    private boolean death = false;
    private String path;

    /**
     * Constructs the Alice character.
     * Initializes Alice with the name "Alice," a default path for the image,
     * an empty inventory, and a LilDrink item in the inventory.
     */
    public Alice() {
        setName("Alice");
        path = "ImagesAlice/Alice.png";
        this.inventory = new ArrayList<>();
        lilDrink = new LilDrink();
        addItem(lilDrink);
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
     * Sets the name of Alice.
     * @param nom The name to set for Alice.
     */
    public void setName(String nom) {
        name = nom;
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
     * Checks if Alice is dead.
     * @return True if Alice is dead, false otherwise.
     */
    public boolean getDeath() {
        return death;
    }

    /**
     * Adds an item to Alice's inventory.
     * @param item The item to add to Alice's inventory.
     */
    public void addItem(Item item) {
        inventory.add(item);
    }

    /**
     * Removes an item from Alice's inventory.
     * @param item The item to remove from Alice's inventory.
     */
    public void removeItem(Item item) {
        if (inventory.contains(item))
            inventory.remove(item);
        else
            System.out.println("There is no such item in the inventory");
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
