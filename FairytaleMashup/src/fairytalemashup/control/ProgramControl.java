/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.control;

import fairytalemashup.FairytaleMashup;
import fairytalemashup.model.Location;
import fairytalemashup.model.Player;

/**
 *
 * @author charlottehuyett
 */
class ProgramControl {

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);
        
        FairytaleMashup.setPlayer(player); //save the player
        
        return player;
    }

   
    
}
