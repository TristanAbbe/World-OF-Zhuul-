import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.*;

/**
 * Décrivez votre classe Game ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class AliceInWonderlandGame
{   private Room currentRoom;
    private static ArrayList<Room> listRoom;
    private static ArrayList<Item> listItem;
    private static ArrayList<Event> event;
    private static ArrayList<Character> character;
    private boolean death=false ;
    private HashMap<String, Room> roomsMap;
    private Alice alice;
    private GUI gui;
    /**
     * Constructeur d'objets de classe Game
     */
    public AliceInWonderlandGame()
    {
        //this.currentRoom = new Humid_hut();
        initializeRooms();
    }
       
    public void initializeRooms() {
        Room humid_hut = new Humid_hut();
        Room catwalk = new Catwalk();
        Room no_rest_forest = new No_rest_forest();
        Room beaver_river = new Beaver_river();
        Room weeping_swamp = new Weeping_swamp();
        Room ware_square = new Ware_square();
        Room twins_bin_den = new Twins_bin_den();
        Room menace_palace = new Menace_palace();
        Room despair_alley = new Despair_alley();
        Room dumbyard = new Dumbyard();
        Room joyless_toilets = new Joyless_toilets();
        Room bunny_lobby = new Bunny_lobby();
        Room fancy_pharmacy = new Fancy_pharmacy();
        Room heart_queen_arena = new Heart_queen_arena();
        Room blowhard_courtyard = new Blowhard_courtyard();
        Room body_card_garden = new Body_card_garden();
        Room sage_passage = new Sage_passage();
        Room sweating_room = new Sweating_room();
        Room smokey_lobby = new Smokey_lobby();
        Room hatmakers_bunker = new Hatmakers_bunker();
        Room lowland_woodland = new Lowland_woodland();
        Room caterpillar_craddle = new Caterpillar_craddle();
        Room glorious_rabbit_hole = new Glorious_rabbit_hole();
        
        humid_hut.setExit("South", catwalk);
        
        catwalk.setExit("South", no_rest_forest);
        catwalk.setExit("West", sage_passage);
        catwalk.setExit("East", despair_alley);
        catwalk.setExit("North", humid_hut);
        
        sage_passage.setExit("East", catwalk);
        sage_passage.setExit("West", blowhard_courtyard);
        
        blowhard_courtyard.setExit("South", beaver_river);
        blowhard_courtyard.setExit("West", hatmakers_bunker);
        blowhard_courtyard.setExit("East", sage_passage);
        blowhard_courtyard.setExit("North", joyless_toilets);
        
        joyless_toilets.setExit("South", blowhard_courtyard);
        
        hatmakers_bunker.setExit("East", blowhard_courtyard);
        
        beaver_river.setExit("North", blowhard_courtyard);
        beaver_river.setExit("West", weeping_swamp);
        
        weeping_swamp.setExit("East", beaver_river);
        weeping_swamp.setExit("West", dumbyard);
        weeping_swamp.setExit("South", bunny_lobby);
        
        bunny_lobby.setExit("North", weeping_swamp);
        bunny_lobby.setExit("West", glorious_rabbit_hole);
        
        glorious_rabbit_hole.setExit("East", bunny_lobby);
        
        dumbyard.setExit("East", weeping_swamp);
        
        no_rest_forest.setExit("North", catwalk);
        no_rest_forest.setExit("West", twins_bin_den);
        no_rest_forest.setExit("South", menace_palace);
        
        twins_bin_den.setExit("East", no_rest_forest);
        
        menace_palace.setExit("North", no_rest_forest);
        menace_palace.setExit("West", lowland_woodland);
        menace_palace.setExit("East", body_card_garden);
        
        lowland_woodland.setExit("East", menace_palace);
        
        body_card_garden.setExit("East", heart_queen_arena);
        body_card_garden.setExit("West", menace_palace);
        
        heart_queen_arena.setExit("West", body_card_garden);
        
        despair_alley.setExit("West", catwalk);
        despair_alley.setExit("North", ware_square);
        despair_alley.setExit("South", sweating_room);
        
        ware_square.setExit("South", despair_alley);
        ware_square.setExit("East", fancy_pharmacy);
        
        fancy_pharmacy.setExit("West", ware_square);
        
        sweating_room.setExit("East", smokey_lobby);
        sweating_room.setExit("North", despair_alley);
        
        smokey_lobby.setExit("West", sweating_room);
        smokey_lobby.setExit("East", caterpillar_craddle);
        
        caterpillar_craddle.setExit("West", smokey_lobby);
        
        currentRoom = humid_hut;
    }
        public Room getCurrentRoom() {
        return this.currentRoom;
    }

        public void setCurrentRoom(Room newRoom) {
        currentRoom = newRoom;
    }
    
     public boolean getDeath(){
         return death;
     }
     
     // Méthode pour déplacer le joueur vers une nouvelle chambre
    public void movePlayer(String direction) {
        if (!death) {
            Room nextRoom = currentRoom.getExit(direction);

            if (nextRoom == null) {
                JOptionPane.showMessageDialog(null, "Il n'y a pas de chambre dans cette direction !");
            } else {
                setCurrentRoom(nextRoom);
                //updateRoomImage();  // Appeler la méthode pour mettre à jour l'interface Swing
            }
        }
    }
    
    // Méthode pour mettre à jour l'interface Swing avec la nouvelle chambre
    public String updateRoomImage(){
    return currentRoom.getLienImage();  
    }
    
}
