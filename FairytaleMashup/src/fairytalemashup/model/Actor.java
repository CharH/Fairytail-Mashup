/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author KatieSimons
 */
public enum Actor implements Serializable {

    
    //class instance variables
    
    BabaYaga("A crafty old witch."), //impossible task
    Rumplestiltskin("A wrinkled...man?"), //beat him at a game
    SnowWhite("A beautiful maiden."), //send a message to the prince
    Prince("A knight in shining armor."),
    Maleficent("A tall shadowy figure lurks in the shadows."), //make a potion for her
    RandomStranger("A skinny old man sits on a tree stump. He looks hungry."), //feed him
    HelplessWoodlandAnimal("Aw, look at the poor bunny caought in a trap."); //break free/attack the trap
    
    //cardinality things
    private Player player;
    private Location[][] location;
    
    private final String description;
    private final Point coordinates;

    public Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Location[] getLocation() {
        return location;
    }

    public void setLocation(Location[] location) {
        this.location = location;
    }
    
}
