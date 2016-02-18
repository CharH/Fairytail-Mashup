/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup;

import fairytalemashup.model.Battle;



import fairytalemashup.model.Actors;
import fairytalemashup.model.Game;
import fairytalemashup.model.Guidebook;
import fairytalemashup.model.Inventory;
import fairytalemashup.model.Location;
import fairytalemashup.model.Map;
import fairytalemashup.model.Player;
import fairytalemashup.model.PotionMaking;
import fairytalemashup.model.PotionsPack;
import fairytalemashup.model.Quest;
import fairytalemashup.model.ResourceGathering;
import fairytalemashup.model.Resources;
import fairytalemashup.model.Spells;
import fairytalemashup.model.Spellcasting;
import fairytalemashup.model.Weapons;
import fairytalemashup.view.StartProgramView;

/**
 *
 * @author charlottehuyett
 */
public class FairytaleMashup {

    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
        //create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        FairytaleMashup.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        FairytaleMashup.player = player;
    }

    
    
}
