import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import javax.swing.ImageIcon;
/**
 * Class Room - a room in an adventure game.
 * This class is part of a text-based adventure game.
 *
 * A "Room" represents one location in the game. It is connected to
 * other rooms via exits. The exits are labeled by cardinal points
 * such as north, east, south, west.
 * 
 * @author MAZURIE Jules
 * @version 29/11/2023
 */
public class Room {
    private String name;
    private String description;
    private String lienImage;
    private HashMap<String, Room> exits;
    private Character character;
    private int status; // statu 0 (=>pas le dialogue car le joueur n'a pas fais certaines chose), 
    //1 (=>dialogue se fait) 2(=> Alice a terminer sur cette map). Gére quel dialogue on a déclencher.
    private Item item;
    
    public Room(String description, String name, String lienImage) 
    {
        this.description = description;
        this.name = name;
        this.lienImage = lienImage;
        this.exits = new HashMap<>();
        //this.lienImage = lienImage; ajout du lien de l'image
    }

    /**
     * Define an exit from this room.
     * @param direction The exit's direction.
     * @param neighbor The neighboring room.
     */
    public void setExit(String direction, Room neighbor) {
        exits.put(direction, neighbor);
    }
    
    public void setName(String name){
        if (name != null && !name.trim().isEmpty()) {
            this.name = name.trim(); // Trim leading and trailing whitespaces
        } else {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
    }
    
    public void setDescription(String description){
        if (description != null && !description.trim().isEmpty()) {
            this.description = description.trim(); // Trim leading and trailing whitespaces
        } else {
            throw new IllegalArgumentException("Description cannot be null or empty.");
        }
    }

    /**
     * Get the name of the room.
     * @return The name of the room.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the description of the room.
     * @return The description of the room.
     */
    public String getDescription() {
        return description;
    }
    
    // public Room changeRom(String direction){
        
    // }
    
    public void setCharacter(Character character) {
        this.character = character;
    }

    public Character getCharacter() {
        return character;
    }
    
    public String getLienImage(){
        return lienImage;
    }
    
    /**
     * Get the neighboring room in the given direction.
     * @param direction The exit's direction.
     * @return The neighboring room.
     */
    public Room getExit(String direction) {
        return exits.get(direction);
    }

    /**
     * Get a string representation of the exits.
     * @return A string representing the exits.
     */
    public String getExitString() {
        StringBuilder exitString = new StringBuilder("Exits: ");
        for (String direction : exits.keySet()) {
            exitString.append(direction).append(" ");
        }
        return exitString.toString().trim();
    }
}
