/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.control;

import fairytalemashup.FairytaleMashup;
import fairytalemashup.exceptions.MapControlException;
import fairytalemashup.model.Game;
import fairytalemashup.model.Guidebook;
import fairytalemashup.model.InventoryItem;
import fairytalemashup.model.Location;
import fairytalemashup.model.Map;
import fairytalemashup.model.Player;
import fairytalemashup.model.Scene;

/**
 *
 * @author KatieSimons
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        Player player = ProgramControl.createPlayer(playersName);
        return player;
    }

    public static void createNewGame(Player player)throws MapControlException {

        Game game = new Game(); //create new game
        FairytaleMashup.setCurrentGame(game); //save game

        game.setPlayer(player); //save player to game

        //create inventory
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);

        Guidebook[] guidebook = GameControl.createGuidebook(); //create guidebook
        game.setGuidebook(guidebook); //save guidebook to game

        Map map = MapControl.createMap(); //create map and locations
        game.setMap(map); //save map in game
        

    }

    public static InventoryItem[] getSortedInventoryList() {
        return FairytaleMashup.getCurrentGame().getInventory();
    }

    public static Location[][] getMap() {
        return FairytaleMashup.getCurrentGame().getMap().getLocation();
    }
    
    public static Guidebook[] getSortedGuidebookList() {
        return FairytaleMashup.getCurrentGame().getGuidebook();
    }

    public enum Item {
        shrooms,
        herbs,
        shovel,
        rope,
        firestone,
        chickens,
        cloak,
        bread,
        gold,
        gems;
    }

    public static InventoryItem[] createInventoryList() {

        //create array of inventory items
        InventoryItem[] inventory = new InventoryItem[10];

        InventoryItem shrooms = new InventoryItem();
        shrooms.setDescription("Shrooms");
        shrooms.setAmountAvailable(0);
        shrooms.setMultiUse(false);
        inventory[Item.shrooms.ordinal()] = shrooms;

        InventoryItem herbs = new InventoryItem();
        herbs.setDescription("Herbs");
        herbs.setAmountAvailable(0);
        herbs.setMultiUse(false);
        inventory[Item.herbs.ordinal()] = herbs;

        InventoryItem shovel = new InventoryItem();
        shovel.setDescription("Shovel");
        shovel.setAmountAvailable(0);
        shovel.setMultiUse(true);
        inventory[Item.shovel.ordinal()] = shovel;

        InventoryItem rope = new InventoryItem();
        rope.setDescription("Rope");
        rope.setAmountAvailable(0);
        rope.setMultiUse(true);
        inventory[Item.rope.ordinal()] = rope;

        InventoryItem firestone = new InventoryItem();
        firestone.setDescription("Firestone");
        firestone.setAmountAvailable(0);
        firestone.setMultiUse(true);
        inventory[Item.firestone.ordinal()] = firestone;

        InventoryItem chickens = new InventoryItem();
        chickens.setDescription("Chickens");
        chickens.setAmountAvailable(0);
        chickens.setMultiUse(false);
        inventory[Item.chickens.ordinal()] = chickens;

        InventoryItem cloak = new InventoryItem();
        cloak.setDescription("Cloak");
        cloak.setAmountAvailable(0);
        cloak.setMultiUse(true);
        inventory[Item.cloak.ordinal()] = cloak;

        InventoryItem bread = new InventoryItem();
        bread.setDescription("Bread");
        bread.setAmountAvailable(0);
        bread.setMultiUse(false);
        inventory[Item.bread.ordinal()] = bread;

        InventoryItem gold = new InventoryItem();
        gold.setDescription("Gold");
        gold.setAmountAvailable(0);
        gold.setMultiUse(false);
        inventory[Item.gold.ordinal()] = gold;

        InventoryItem gems = new InventoryItem();
        gems.setDescription("Gems");
        gems.setAmountAvailable(0);
        gems.setMultiUse(false);
        inventory[Item.gems.ordinal()] = gems;

        return inventory;
    }

    public enum Fairytales {
        snowWhite,
        sleepingBeauty,
        rumplestiltskin,
        goldenGoose,
        vasilisaTheBeautiful;
    }    
    

    public static Guidebook[] createGuidebook() {
        Guidebook[] guidebook = new Guidebook[5];

        Guidebook snowWhite = new Guidebook();
        snowWhite.setFairytaleTitle("Snow White");
        snowWhite.setFairytaleDescription("Pretty girl gets hunted down by her crazy stepmom.");
        snowWhite.setChallengesAvailable("Carry a message to her boyfriend.");
        snowWhite.setChallengesCompleted(0);
        guidebook[Fairytales.snowWhite.ordinal()] = snowWhite;

        Guidebook sleepingBeauty = new Guidebook();
        sleepingBeauty.setFairytaleTitle("Sleeping Beauty");
        sleepingBeauty.setFairytaleDescription("Pretty girl gets cursed by lonely sorceress.");
        sleepingBeauty.setChallengesAvailable("Make friends with the sorceress.");
        sleepingBeauty.setChallengesCompleted(0);
        guidebook[Fairytales.sleepingBeauty.ordinal()] = sleepingBeauty;

        Guidebook rumplestiltskin = new Guidebook();
        rumplestiltskin.setFairytaleTitle("Rumplestiltskin");
        rumplestiltskin.setFairytaleDescription("Crazy dude wants to adopt.");
        rumplestiltskin.setChallengesAvailable("Beat him at a game.");
        rumplestiltskin.setChallengesCompleted(0);
        guidebook[Fairytales.rumplestiltskin.ordinal()] = rumplestiltskin;

        Guidebook goldenGoose = new Guidebook();
        goldenGoose.setFairytaleTitle("Golden Goose");
        goldenGoose.setFairytaleDescription("Boy is nice to strangers and makes girl laugh.");
        goldenGoose.setChallengesAvailable("Be nice to strangers and feed them.");
        goldenGoose.setChallengesCompleted(0);
        guidebook[Fairytales.goldenGoose.ordinal()] = goldenGoose;

        Guidebook vasilisaTheBeautiful = new Guidebook();
        vasilisaTheBeautiful.setFairytaleTitle("Vasilisa The Beautiful");
        vasilisaTheBeautiful.setFairytaleDescription("Pretty girl is sent to creepy neighbors house for a match.");
        vasilisaTheBeautiful.setChallengesAvailable("Help out Baba Yaga.");
        vasilisaTheBeautiful.setChallengesCompleted(0);
        guidebook[Fairytales.vasilisaTheBeautiful.ordinal()] = vasilisaTheBeautiful;

        return guidebook;
    }

}
