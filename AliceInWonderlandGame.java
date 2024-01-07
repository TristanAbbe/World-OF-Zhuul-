import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.*;
import java.util.List;

/**
 * Represents the main game class for "Alice in Wonderland" adventure.
 * Manages the game state, including the current room, Alice's character, and game events.
 * Handles the initialization of the game world and provides methods for player movement and updates.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AliceInWonderlandGame extends JFrame {
    private Room currentRoom;
    private HashMap<String, Room> roomsMap;
    private Alice alice;
    private boolean death = false;

    /**
     * Initializes a new game, creating rooms and setting up the initial game state.
     */
    public void newGame() {
        roomsMap = new HashMap<>();
        this.alice = new Alice();
        initWorld();
    }

    /**
     * Initializes the game world by creating rooms, defining exits, and adding them to the rooms map.
     */
    public void initWorld() {
        
        HumidHut humidHut = new HumidHut();
        Catwalk catwalk = new Catwalk();
        SagePassage sagePassage = new SagePassage();
        BlowhardCourtyard blowhardCourtyard = new BlowhardCourtyard();
        JoylessToilets joylessToilets = new JoylessToilets();
        HatmakersBunker hatmakersBunker = new HatmakersBunker();
        BeaverRiver beaverRiver = new BeaverRiver();
        WeepingSwamp weepingSwamp = new WeepingSwamp();
        Dumbyard dumbyard = new Dumbyard();
        BunnyLobby bunnyLobby = new BunnyLobby();
        GloriousRabbitHole gloriousRabbitHole = new GloriousRabbitHole();
        DespairAlley despairAlley = new DespairAlley();
        WareSquare wareSquare = new WareSquare();
        FancyPharmacy fancyPharmacy = new FancyPharmacy();
        SweatingRoom sweatingRoom = new SweatingRoom();
        SmokeyLobby smokeyLobby = new SmokeyLobby();
        CaterpillarCraddle caterpillarCraddle = new CaterpillarCraddle();
        NoRestForest noRestForest = new NoRestForest();
        TwinsBinDen twinsBinDen = new TwinsBinDen();
        MenacePalace menacePalace = new MenacePalace();
        LowlandWoodland lowlandWoodland = new LowlandWoodland();
        BodyCardGarden bodyCardGarden = new BodyCardGarden();
        HeartQueenArena heartQueenArena = new HeartQueenArena();
        RoomDeath roomDeath = new RoomDeath();
        WinRoom winRoom = new WinRoom();
        
        //set the exits 
        humidHut.setExit("South", catwalk);
        
        catwalk.setExit("South", noRestForest);
        catwalk.setExit("West", sagePassage);
        catwalk.setExit("East", despairAlley);
        catwalk.setExit("North", humidHut);
        
        sagePassage.setExit("East", catwalk);
        sagePassage.setExit("West", blowhardCourtyard);
        
        blowhardCourtyard.setExit("South", beaverRiver);
        blowhardCourtyard.setExit("West", hatmakersBunker);
        blowhardCourtyard.setExit("East", sagePassage);
        blowhardCourtyard.setExit("North", joylessToilets);
        
        joylessToilets.setExit("South", blowhardCourtyard);
        
        hatmakersBunker.setExit("East", blowhardCourtyard);
        
        beaverRiver.setExit("North", blowhardCourtyard);
        beaverRiver.setExit("West", weepingSwamp);
        
        weepingSwamp.setExit("East", beaverRiver);
        weepingSwamp.setExit("West", dumbyard);
        weepingSwamp.setExit("South", bunnyLobby);
        
        bunnyLobby.setExit("North", weepingSwamp);
        bunnyLobby.setExit("West", gloriousRabbitHole);
        
        gloriousRabbitHole.setExit("East", bunnyLobby);
        
        dumbyard.setExit("East", weepingSwamp);
        
        noRestForest.setExit("North", catwalk);
        noRestForest.setExit("West", twinsBinDen);
        noRestForest.setExit("South", menacePalace);
        
        twinsBinDen.setExit("East", noRestForest);
        
        menacePalace.setExit("North", noRestForest);
        menacePalace.setExit("West", lowlandWoodland);
        menacePalace.setExit("East", bodyCardGarden);
        
        lowlandWoodland.setExit("East", menacePalace);
        
        bodyCardGarden.setExit("East", heartQueenArena);
        bodyCardGarden.setExit("West", menacePalace);
        
        heartQueenArena.setExit("West", bodyCardGarden);
        
        despairAlley.setExit("West", catwalk);
        despairAlley.setExit("North", wareSquare);
        despairAlley.setExit("South", sweatingRoom);
        
        wareSquare.setExit("South", despairAlley);
        wareSquare.setExit("East", fancyPharmacy);
        
        fancyPharmacy.setExit("West", wareSquare);
        
        sweatingRoom.setExit("East", smokeyLobby);
        sweatingRoom.setExit("North", despairAlley);
        
        smokeyLobby.setExit("West", sweatingRoom);
        smokeyLobby.setExit("East", caterpillarCraddle);
        
        caterpillarCraddle.setExit("West", smokeyLobby);

        // Add rooms to the map
        roomsMap.put("HumidHut", humidHut);
        roomsMap.put("Catwalk", catwalk);
        roomsMap.put("SagePassage", sagePassage);
        roomsMap.put("BlowhardCourtyard", blowhardCourtyard);
        roomsMap.put("JoylessToilets", joylessToilets);
        roomsMap.put("HatmakersBunker", hatmakersBunker);
        roomsMap.put("BeaverRiver", beaverRiver);
        roomsMap.put("WeepingSwamp", weepingSwamp);
        roomsMap.put("Dumbyard", dumbyard);
        roomsMap.put("BunnyLobby", bunnyLobby);
        roomsMap.put("GloriousRabbitHole", gloriousRabbitHole);
        roomsMap.put("DespairAlley", despairAlley);
        roomsMap.put("WareSquare", wareSquare);
        roomsMap.put("FancyPharmacy", fancyPharmacy);
        roomsMap.put("SweatingRoom", sweatingRoom);
        roomsMap.put("SmokeyLobby", smokeyLobby);
        roomsMap.put("CaterpillarCraddle", caterpillarCraddle);
        roomsMap.put("NoRestForest", noRestForest);
        roomsMap.put("TwinsBinDen", twinsBinDen);
        roomsMap.put("MenacePalace", menacePalace);
        roomsMap.put("LowlandWoodland", lowlandWoodland);
        roomsMap.put("BodyCardGarden", bodyCardGarden);
        roomsMap.put("HeartQueenArena", heartQueenArena);
        roomsMap.put("RoomDeath",roomDeath);
        roomsMap.put("winRoom",winRoom);
        
        setCurrentRoom(humidHut);
    }

    /**
     * Gets the current room that the player is in.
     *
     * @return The current room.
     */
    public Room getCurrentRoom() {
        return currentRoom;
    }

    /**
     * Sets the current room to the specified room.
     *
     * @param newRoom The new current room.
     */
    public void setCurrentRoom(Room newRoom) {
        currentRoom = newRoom;
    }

    /**
     * Sets the current room to the death room.
     * This is called when the player dies in the game.
     */
    public void setSpecificRoom(String room) {
        currentRoom = roomsMap.get(room);
    }

    /**
     * Gets the instance of the Alice character in the game.
     *
     * @return The Alice character.
     */
    public Alice getAlice() {
        return this.alice;
    }

    /**
     * Checks if the player has encountered a death event in the game.
     *
     * @return True if the player has died, otherwise false.
     */
    public boolean getDeath() {
        return death;
    }

    /**
     * Gets the path to the image file associated with the current room.
     *
     * @return The path to the room image.
     */
    public String roomImage() {
        return currentRoom.getPath();
    }
    
        public void trade(Room currentRoom, Alice alice, String item){
        
        List<Character> charactersList = currentRoom.getCharacterList();
        
        if (!charactersList.isEmpty()){
            Character temporaryCharacter = charactersList.get(0);
            if (!temporaryCharacter.getItemQuest()){
                String characterName = currentRoom.getCharacter(charactersList).getName();
                if (temporaryCharacter.getName() == characterName){
                    String itemName = item;
                    if (alice.hasItem(itemName)){
                        String recievedItem = currentRoom.getCharacter(charactersList).getItem().getName();
                        alice.removeItem(itemName);
                        currentRoom.getCharacter(charactersList).addItem(itemName);
                        currentRoom.getCharacter(charactersList).setItemQuest(true);
                        alice.addItem(recievedItem);
                    }
                }   
            }
        }
        else if (currentRoom.getName()== "Fancy Pharmacy"){
            if (!alice.hasItem(currentRoom.getItem().getName())){
                alice.addItem(currentRoom.getItem().getName());
            }
        }
        else if(currentRoom.getName()== "Bunny Lobby"){
            if (!alice.hasItem(currentRoom.getItem().getName())){
                alice.addItem(currentRoom.getItem().getName());
            }
        }
    }
    
    public void flushToilet(){
        if (currentRoom.getName() == "Joyless Toilets") {
            if (currentRoom instanceof JoylessToilets){
                JoylessToilets toilette = (JoylessToilets) currentRoom;
                if (toilette.getCountFlushRoyal() < 5){
                toilette.setCountFlushRoyal();
                System.out.println("CACA Numéro " + toilette.getCountFlushRoyal());
                
                }
            }
            setSpecificRoom("winRoom");
        }
    }
    
    /**
     * Moves the player to the next room in the specified direction.
     * Decreases Alice's hunger and updates the game state.
     *
     * @param direction The direction in which to move.
     */
    public void movePlayer(String direction) {
        if (!death) {
            Room nextRoom = currentRoom.getExit(direction);

            if (nextRoom == null) {
                JOptionPane.showMessageDialog(null, "Il n'y a pas de chambre dans cette direction !");
            } else {
                setCurrentRoom(nextRoom);
                alice.decreaseHunger(5);
            }
        }
    }
    
}
