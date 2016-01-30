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
import fairytalemashup.model.PotionsPack;
import fairytalemashup.model.ResourceGathering;
import fairytalemashup.model.Resources;
import fairytalemashup.model.SpellBook;
import fairytalemashup.model.Spellcasting;
import fairytalemashup.model.Weapons;

/**
 *
 * @author charlottehuyett
 */
public class FairytaleMashup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Guidebook test
        Guidebook guidebookThing = new Guidebook();
        
        guidebookThing.setFairytaleDescription("Girl gets new shoes and marries a Prince.");
        guidebookThing.setItemsAvailable(7.5);
        guidebookThing.setChallengesAvailable("Fight a giant");
        guidebookThing.setChallengeScore(0.86);
        guidebookThing.setChallengesCompleted(2);
        guidebookThing.setLocationDescription("Pretty forest");
        
        String guidebookInfo = guidebookThing.toString();
        System.out.println(guidebookInfo);
    //Map test
        Map mapTest = new Map();
        
        mapTest.setColumnCount(4);
        mapTest.setRowCount(7);
        
        String mapInfo = mapTest.toString();
        System.out.println(mapInfo);
        
    //Location test
        Location locationTest = new Location();
        
        locationTest.setColumn(3);
        locationTest.setRow(9);
        locationTest.setVisited(false);
        locationTest.setLocationName("Enchanted Forest");
        locationTest.setLocationDescription("Lots and lots of trees plus a unicorn or two.");
        
        String locationInfo = locationTest.toString();
        System.out.println(locationInfo);
        
    //ResourceGathering test
        ResourceGathering gatheringTest = new ResourceGathering();
    
        gatheringTest.setRow(1); //inheritance check
        gatheringTest.setColumn(3); //inheritance check
        gatheringTest.setResourceType("Spell Ingredient");
        gatheringTest.setResourceAmount(0);
        gatheringTest.setRenewalTimer(60);
        
        String gatheringInfo = gatheringTest.toString();
        System.out.println(gatheringInfo);
        
    //Player Test
        Player playerOne = new Player();
        
        playerOne.setName("Tink");
        playerOne.setBestScore(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
    //Actors Test -- was titled as Charactes in UML Diagram, but java wouldn't accept Character title, changed to Actor
        Actors actorsTest = new Actors();
        
        actorsTest.setName("Baba Yaga");
        actorsTest.setDescription("old deformed and/or ferocious-looking woman that lives in a hut in the forest");
        actorsTest.setAbilities("Witch, can fly, magic spells");
        actorsTest.setHealth(85);
        actorsTest.setRow(5);
        actorsTest.setColumn(15);
        
        String actorsInfo = actorsTest.toString();
        System.out.println(actorsInfo);
        
        
    // Game Tester
        Game gameTest = new Game();
        
        gameTest.setHighScore(100);
        gameTest.setTotalTime(2.5);
        
        String gameInfo = gameTest.toString();
        System.out.println(gameInfo);
        
        
    //SpellBook Tester
        SpellBook bookTest = new SpellBook();
        
        bookTest.setSpellType("Sleeping Spell");
        bookTest.setPiecesCollected(3);
        bookTest.setPiecesRequired(5);
        bookTest.setRenewalTime(25);
        bookTest.setDamages(50);
        
        String bookInfo = bookTest.toString();
        System.out.println(bookInfo);
        
        
    //Potions Pack Tester
        PotionsPack testPotion = new PotionsPack();
        
        testPotion.setPotionType("Truth Potion");
        testPotion.setPotionAmount(4);
        testPotion.setAvailableUses(2);
        testPotion.setAmountUsed(1);
        testPotion.setDamages(15);
        testPotion.setRenewalTime(10);
        
        String packInfo = testPotion.toString();
        System.out.println(packInfo);
        
        
     //Weapons Test
        Weapons weaponTest = new Weapons();
        
        weaponTest.setWeaponType("Battle Ax");
        weaponTest.setDamageInflicted(80);
        weaponTest.setArmour("Breast Plate");
        weaponTest.setProtection(55);
        weaponTest.setWeaponArmed("Bow and Arrow");
        
        String weaponInfo = weaponTest.toString();
        System.out.println(weaponInfo);
     
     //Resources Test
        Resources testResource = new Resources();
        
        testResource.setResourceType("Pinecone");
        testResource.setAvailableAmount(9);
        
        String resourceInfo = testResource.toString();
        System.out.println(resourceInfo);
 
    }
    
}
