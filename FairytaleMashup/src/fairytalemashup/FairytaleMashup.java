/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup;

import fairytalemashup.model.Battle;

import fairytalemashup.model.Actor;
import fairytalemashup.model.Game;
import fairytalemashup.model.Guidebook;
import fairytalemashup.model.InventoryItem;
import fairytalemashup.model.Location;
import fairytalemashup.model.Map;
import fairytalemashup.model.Player;
import fairytalemashup.model.PotionMaking;
import fairytalemashup.model.Potion;
import fairytalemashup.model.Quest;
import fairytalemashup.model.ResourceGathering;
import fairytalemashup.model.Resource;
import fairytalemashup.model.Spell;
import fairytalemashup.model.Spellcasting;
import fairytalemashup.model.Weapon;
import fairytalemashup.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author charlottehuyett
 */
public class FairytaleMashup {

    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;

    public static void main(String[] args) {
        //create StartProgramViewOrig  
        StartProgramView startProgramView = new StartProgramView();
        try {
            //open character stream files for end user input and output
            FairytaleMashup.inFile = new BufferedReader(new InputStreamReader(System.in));
            FairytaleMashup.outFile = new PrintWriter(System.out, true);
            //open log file
            String filePath = "log.txt";
            FairytaleMashup.logFile = new PrintWriter(filePath);
            //display the start program view
            startProgramView.displayStartProgramView();
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.displayStartProgramView();
        } finally {
            try {
                if (FairytaleMashup.inFile != null) {
                    FairytaleMashup.inFile.close();
                }
                if (FairytaleMashup.outFile != null) {
                    FairytaleMashup.outFile.close();
                }
                if (FairytaleMashup.logFile != null) {
                    FairytaleMashup.logFile.close();
                }
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }

        }
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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        FairytaleMashup.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        FairytaleMashup.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        FairytaleMashup.logFile = logFile;
    }

}
