
/**
 * Décrivez votre classe Character ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */

//surcharge : nom, description

public class Character
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String name;
    private String description;
    
    /**
     * Constructeur d'objets de classe Character
     */
    public Character(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    // Getters et setters (méthodes d'accès)
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void dialogue
    // chaque perso on recuperre la metgode dialogue et vcreer boite dialgue
}
