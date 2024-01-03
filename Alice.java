import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 * Décrivez votre classe Alice ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Alice extends Character
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre/**
    List<Item> inventory = new ArrayList<>(); 
    private int hunger;
    private Room room;
    private boolean death = false ;
    private Room currentRoom ;
    
    public Alice()
    {
        // initialisation des variables d'instance
        super("Alice", "Hello, I am Alice");
        //currentRoom = new Humid_hut();
    }
    
    public void setCurrentRoom(Room room)
    {
        currentRoom = room;
    }
    
    public Room getCurrentRoom()
    {
        return currentRoom;
    }
    
        public void addItem(Item item)
    {
        inventory.add(item);
    }    
    
    public void removeItem(Item item)
    {
        if (inventory.contains(item))
            inventory.remove(item);
        else
            System.out.println("There is no such item in the inventory");
    } 
    
    public void displayInventory() 
    {
    for (Item i : inventory)
        {
            System.out.println(i.getName()); 
        }
    }
    
    public List<Item> getInventory()
    {
        return inventory;   
    }
    
    
    public void receiveItem(Item item) {
        addItem(item);
        System.out.println("you receive an item : " + item.getName());
    }

    @Override
    public void giveItem(Character receiver, Item item) {
        if (inventory != null && !inventory.isEmpty()) {
            removeItem(item);
            Item givenItem = item;
            System.out.println("you give " + givenItem.getName() + " to " + receiver.getName());//à changer dans le GUI
            receiver.receiveItem(givenItem);
        } else {
            System.out.println("your inventory is empty");//à changer dans le GUI
        }
    }
    
    // Méthode pour le déplacement d'Alice
    public void move(String direction) {
    if (!death) {
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("There is no room!");
        } else {
            currentRoom = nextRoom;
            
            // Decrease hunger by 5 units for each move
            decreaseHunger(5);

            if (hunger == 0) {
                death = true;
                System.out.println("You died of hunger");
            }
        }
    }
    }
    
    public void decreaseHunger(int amount) {
    hunger = Math.max(0, hunger - amount);
    }
    
    public int getHunger ()
     {
         return hunger;
     }
     
    public void feed()
    {
        if (!death) {
            //browse the list to know if she owns a taco
            for (int i = 0; i < inventory.size(); i++) {
            Object element = inventory.get(i);
            JOptionPane.showMessageDialog(null, element);
        }
        }
    }
    }
