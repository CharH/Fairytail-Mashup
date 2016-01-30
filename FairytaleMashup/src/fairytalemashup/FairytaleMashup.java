/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup;

import fairytalemashup.model.Battle;
import fairytalemashup.model.Guidebook;
import fairytalemashup.model.Inventory;
import fairytalemashup.model.Location;
import fairytalemashup.model.Map;
import fairytalemashup.model.PotionMaking;
import fairytalemashup.model.Quest;
import fairytalemashup.model.ResourceGathering;
import fairytalemashup.model.Spellcasting;

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
        
    //Spellcasting Test
        Spellcasting spellTest = new Spellcasting();
        
        spellTest.setLocationDescription("Witches Cottage"); //inheritance check
        spellTest.setSpellBook("Turn everything to gingerbread");
        spellTest.setUserAction("Dance wildly around");
        spellTest.setUserVoice("Yell");
        
        String spellInfo = spellTest.toString();
        System.out.println(spellInfo);
        
    //Quests test
        Quest questTest = new Quest();
        
        questTest.setQuestDescription("Slay a dragon!");
        questTest.setQuestStatus("In progress");
        questTest.setLocationName("Burned Castle"); //inheritance check
        
        String questInfo = questTest.toString();
        System.out.println(questInfo);
    
    //PotionMaking test 
        PotionMaking potionTest = new PotionMaking();
        
        potionTest.setVisited(true); //inheritance check
        potionTest.setRecipes("Evil Curse");
        potionTest.setIngredients("Lots of bad stuff");
        potionTest.setSetTimer(30);
        
        String potionInfo = potionTest.toString();
        System.out.println(potionInfo);
        
    //Battle test
        Battle battleTest = new Battle();
        
        battleTest.setLocationName("Hobbiton"); //inheritance check
        battleTest.setEnemyDescription("Weird little dude with ridiculously hairy feet.");
        battleTest.setEnemyStats(44);
        battleTest.setUserWeapons("Acorns, Rocks, and a relatively pointy stick.");
        battleTest.setUserStats(22);
        
        String battleInfo = battleTest.toString();
        System.out.println(battleInfo);
    
    //Inventory test
        Inventory inventoryTest = new Inventory();
        
        inventoryTest.setAmountAvailable(5);
        inventoryTest.setAmountRequired(7);
        inventoryTest.setInventoryType("Resources");
        inventoryTest.setRenewalTimer(2);
        inventoryTest.setTimesUsed(3);
        inventoryTest.setUsesAvailable(4);
        
        String inventoryInfo = inventoryTest.toString();
        System.out.println(inventoryInfo);
        
    
    }
    
}
