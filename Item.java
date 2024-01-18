/**
 * The Item class represents a generic object with a name, description, and an optional icon path.
 *
 * @author ABBE Tristan, ANET Janelle, DELPIROU Corentin, MAZURIE Jules, PERSONNE Germain, RIVIERE Jade
 * @version 1.0 (Date: 2024-01-05)
 */
public class Item 
{
    private String name;
    private String description;
    private String iconPath;

    /**
     * Constructor for objects of the Item class.
     * 
     * @param name The name of the item.
     * @param description The description of the item.
     */
    public Item(String name, String description,String iconPath)
    {
        setName(name);
        setDescription(description);
        this.iconPath = iconPath.trim();
    }
    
    /**
     * Sets the name of the item, ensuring it is not null or empty.
     * 
     * @param name The name to set for the item.
     * @throws IllegalArgumentException if the name is null or empty.
     */
    public void setName(String name){
        if (name != null && !name.trim().isEmpty()) {
            this.name = name.trim(); // Trim leading and trailing whitespaces
        } else {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
    }
    
    /**
     * Sets the description of the item, ensuring it is not null or empty.
     * 
     * @param description The description to set for the item.
     * @throws IllegalArgumentException if the description is null or empty.
     */
    public void setDescription(String description){
        if (description != null && !description.trim().isEmpty()) {
            this.description = description.trim(); // Trim leading and trailing whitespaces
        } else {
            throw new IllegalArgumentException("Description cannot be null or empty.");
        }
    }
    
    /**
     * Gets the icon path associated with the item.
     * 
     * @return The icon path of the item.
     */
    public String getIconPath()
    {
        return iconPath;
    }
    
    /**
     * Gets the name of the item.
     * 
     * @return The name of the item.
     */
    public String getName(){
        return name;
    }
    
    /**
     * Gets the description of the item.
     * 
     * @return The description of the item.
     */
    public String getDescription(){
        return description;
    }
    
}
