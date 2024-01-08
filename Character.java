import java.util.*;

/**
 * Represents a character in the game.
 * Each character has a name, description, state, and an optional quest item.
 * Characters can hold a list of items and provide dialogues.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Character {
    private String name;
    private String description;
    private int state;
    private boolean itemQuest;
    private List<Item> itemList = new ArrayList<>();
    private MiniGame miniGame;
    
    /**
     * Constructs a character with the specified name and description.
     *
     * @param name        The name of the character.
     * @param description The description of the character.
     */
    public Character(String name, String description) {
        setName(name);
        setDescription(description);
        itemQuest = false;
        this.miniGame = new MiniGame();
    }
    
    /**
     * Gets the name of the character.
     *
     * @return The name of the character.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the character.
     *
     * @param name The new name of the character.
     * @throws IllegalArgumentException if the provided name is null or empty.
     */
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name.trim(); // Trim leading and trailing whitespaces
        } else {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
    }
    
    public Item getItem(){
        Item itemInList = itemList.get(0);
        return itemInList;
    }
    
    /**
     * Gets the list of items held by the character.
     *
     * @return The list of items.
     */
    public List<Item> getItemList() {
        return itemList;
    }

    /**
     * Adds an item to the character's list of items.
     *
     * @param item The item to be added.
     */
    public void addItem(Item item) {
        itemList.add(item);
    }
    
        /**
     * Adds an item to Alice's inventory based on its name.
     * @param itemName The name of the item to add to Alice's inventory.
     */
    public void addItem(String itemName) {
        
        try {
            Item newItem = createItemName(itemName);
            itemList.add(newItem);
            System.out.println("Added item: " + itemName);
        } catch (IllegalArgumentException e) {
            System.out.println("Could not add item with name '" + itemName + "'. " + e.getMessage());
        }
    }
    
    private Item createItemName(String itemName) {
        switch (itemName.toLowerCase()) {
            case "liltle drink":
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
        Iterator<Item> iterator = itemList.iterator();
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
        for (Item item : itemList) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Gets the state of the quest of the character.
     *
    * @return The Boolean State ( True = quest ended , False = quest not ended )
     */
    public boolean getItemQuest() {
        return itemQuest;
    }
    
    /**
     * Sets whether the character has a quest item.
     *
     * @param itemQuest True if the character has a quest item, false otherwise.
     */
    public void setItemQuest(boolean itemQuest) {
        this.itemQuest = itemQuest;
    }
    
    /**
     * Gets the description of the character.
     *
     * @return The description of the character.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the character.
     *
     * @param description The new description of the character.
     * @throws IllegalArgumentException if the provided description is null or empty.
     */
    public void setDescription(String description) {
        if (description != null && !description.trim().isEmpty()) {
            this.description = description.trim(); // Trim leading and trailing whitespaces
        } else {
            throw new IllegalArgumentException("Description cannot be null or empty.");
        }
    }

    /**
     * Gets the state of the character.
     *
     * @return The state of the character.
     */
    public int getState() {
        return state;
    }

    /**
     * Sets the state of the character.
     *
     * @param state The new state of the character.
     */
    public void setState(int state) {
        this.state = state;
    }

    /**
     * Provides a dialogue for the character.
     * This method is meant to be overridden by subclasses to provide specific dialogues.
     *
     * @return The dialogue of the character.
     */
    public String dialogue() {
        return null;
    }
    
    public MiniGame getMiniGame(){
        return this.miniGame;
    }
}
