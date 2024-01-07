import java.util.HashMap;
import java.util.*;

/**
 * The Room class represents a location or room within a text-based adventure game.
 * It holds information such as the room's name, description, exits to other rooms,
 * status, associated items, characters, and an optional image path.
 * This class is part of a larger game environment and is intended to be extended
 * for specific room types in the game.
 *
 * The authors of this class are: ABBE Tristan, ANET Janelle, DELPIROU Corentin,
 * MAZURIE Jules, PERSONNE Germain, RIVIERE Jade.
 *
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0 (Date: YYYY-MM-DD)
 */
public class Room {
    private String name;
    private String description;
    private HashMap<String, Room> exits;
    private int numberRoom;
    private Item item;
    private String lienImage;
    private List<Character> characterList = new ArrayList<>();
    private List<Item> itemList = new ArrayList<>();
    private List<Alice> aliceList = new ArrayList<>();

    /**
     * Constructor for objects of the Room class.
     * Initializes a room with a specific description, name, and optional image path.
     *
     * @param description The description of the room.
     * @param name The name of the room.
     * @param pathImage The path to the image associated with the room.
     */
    public Room(String description, String name, String pathImage,int numberRoom) {
        setDescription(description);
        setName(name);
        setNumberRoom(numberRoom);
        exits = new HashMap<>();
        setLienImage(pathImage);
    }

    /**
     * Sets the exit for a specified direction to lead to another room.
     *
     * @param direction The direction of the exit.
     * @param neighbor The room to which the exit leads.
     */
    public void setExit(String direction, Room neighbor) {
        exits.put(direction, neighbor);
    }

    /**
     * Gets the name of the room.
     *
     * @return The name of the room.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the description of the room.
     *
     * @return The description of the room.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the path to the image associated with the room.
     *
     * @return The path to the image.
     */
    public String getPath() {
        return lienImage;
    }

    /**
     * Sets the name of the room.
     *
     * @param name The new name of the room.
     * @throws IllegalArgumentException if the name is null or empty.
     */
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name.trim();
        } else {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
    }

    /**
     * Sets the description of the room.
     *
     * @param description The new description of the room.
     * @throws IllegalArgumentException if the description is null or empty.
     */
    public void setDescription(String description) {
        if (description != null && !description.trim().isEmpty()) {
            this.description = description.trim();
        } else {
            throw new IllegalArgumentException("Description cannot be null or empty.");
        }
    }
    
    public int getNumberRoom(){
        return numberRoom;
    }
    
    public void setNumberRoom(int numberRoom){
        this.numberRoom = numberRoom;
    }
    
    /**
     * Gets the exit for a specified direction.
     *
     * @param direction The direction of the exit.
     * @return The room to which the exit leads.
     */
    public Room getExit(String direction) {
        return exits.get(direction);
    }

    /**
     * Gets a list of all exits from the room.
     *
     * @return A list of all exit directions.
     */
    public List<String> getAllExits() {
        return new ArrayList<>(exits.keySet());
    }

    /**
     * Gets a string representation of all exits from the room.
     *
     * @return A formatted string of all exit directions.
     */
    public String getExitString() {
        StringBuilder exitString = new StringBuilder("Exits: ");
        for (String direction : exits.keySet()) {
            exitString.append(direction).append(" ");
        }
        return exitString.toString().trim();
    }

    /**
     * Sets the path to the image associated with the room.
     *
     * @param pathImage The new path to the image.
     * @throws IllegalArgumentException if the path is null or empty.
     */
    public void setLienImage(String pathImage) {
        if (pathImage != null && !pathImage.trim().isEmpty()) {
            this.lienImage = pathImage.trim();
        } else {
            throw new IllegalArgumentException("Path image cannot be null or empty.");
        }
    }

    /**
     * Gets the list of characters present in the room.
     *
     * @return A list of characters.
     */
    public List<Character> getCharacterList(){
        return characterList;
    }

    /**
     * Gets the first character in the list.
     *
     * @return The first character in the list.
     */
    public Character getCharacter(List<Character> characterList ){
        Character characterInList = characterList.get(0);
        return characterInList;
    }

    /**
     * Adds a character to the list of characters in the room.
     *
     * @param personnage The character to add.
     */
    public void ajouterPersonnage(Character personnage){
        characterList.add(personnage);
    }

    /**
     * Removes a character from the list of characters in the room.
     *
     * @param personnage The character to remove.
     */
    public void removePersonnage(Character personnage){
        characterList.remove(personnage);
    }

    /**
     * Gets the list of Alice characters present in the room.
     *
     * @return A list of Alice characters.
     */
    public List<Alice> getAlice(){
        return aliceList;
    }

    /**
     * Adds an Alice character to the list of Alice characters in the room.
     *
     * @param personnage The Alice character to add.
     */
    public void ajouterAlice(Alice personnage){
        aliceList.add(personnage);
    }

    /**
     * Removes an Alice character from the list of Alice characters in the room.
     *
     * @param personnage The Alice character to remove.
     */
    public void removeAlice(Alice personnage){
        aliceList.remove(personnage);
    }

    /**
     * Gets the list of items present in the room.
     *
     * @return A list of items.
     */
    public List<Item> getItemList() {
        return itemList;
    }
    
    public Item getItem(){
        Item itemInList = itemList.get(0);
        return itemInList;
    }
    
    /**
     * Adds an item to the list of items in the room.
     *
     * @param item The item to add.
     */
    public void addItem(Item item) {
        itemList.add(item);
    }

    /**
     * Removes an item from the list of items in the room.
     *
     * @param item The item to remove.
     */
    public void removeItem(Item item) {
        itemList.remove(item);
    }
}
