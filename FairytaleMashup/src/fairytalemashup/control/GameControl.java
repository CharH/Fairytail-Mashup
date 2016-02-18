/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.control;

import fairytalemashup.model.Player;

/**
 *
 * @author KatieSimons
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        Player player = ProgramControl.createPlayer(playersName);
        return player ;
    }

    public static void createNewGame(Player player) {
        System.out.println("\n***createNewGame stub function called.***");
    }
    
}
