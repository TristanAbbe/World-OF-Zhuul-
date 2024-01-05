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
}
