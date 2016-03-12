/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.control;

import fairytalemashup.FairytaleMashup;
import fairytalemashup.model.Game;
import fairytalemashup.model.Location;
import fairytalemashup.model.Map;
import fairytalemashup.model.Scene;

/**
 *
 * @author KatieSimons
 */
public class MapControl {
    
    public static Map createMap() {
        //create the map
        Map map = new Map(6,6);
        //creat a list of the different scenes in teh game
        Scene[] scenes = createScenes();
        //assigne scenes to different locations on map
        assignScenesToLocations(map,scenes);
        
        return map;
    }
    public enum SceneType {
        start,
        snowWhite,
        maleficent,
        rumplestiltskin,
        hungryStranger,
        babaYaga,
        huntsman,
        castleGuards,
        bigBadWolf,
        angryGnome,
        angryBabaYaga,
        forestClearing,
        cottageInTheWoods,
        village,
        castleGates,
        castleCourtyard,
        castleHall,
        bramblePatch,
        cliff,
        lake,
        ocean,
        river,
        forest,
        meadow,
        cowPasture,
        creepyCottage,
        end;
        
    }
    private static Scene[] createScenes() {
        Game game = FairytaleMashup.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
             "\n You set off on your adventure.");
        startingScene.setMapSymbol("START");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene snowWhiteScene = new Scene();
        snowWhiteScene.setDescription(
             "A girl is sitting all alone in the forest and crying.");
        snowWhiteScene.setMapSymbol("snowWhite");
        snowWhiteScene.setBlocked(false);
        snowWhiteScene.setTravelTime(240);
        scenes[SceneType.snowWhite.ordinal()] = snowWhiteScene;
        
        Scene maleficentScene = new Scene();
        maleficentScene.setDescription(
             "\n A shadowy figure steps forward and grabs your arm.");
        maleficentScene.setMapSymbol("maleficent");
        maleficentScene.setBlocked(false);
        maleficentScene.setTravelTime(240);
        scenes[SceneType.maleficent.ordinal()] = maleficentScene;
        
        Scene rumplestiltskinScene = new Scene();
        rumplestiltskinScene.setDescription(
             "\n A weird little creature is dancing around the trees.");
        rumplestiltskinScene.setMapSymbol("rumplestiltskin");
        rumplestiltskinScene.setBlocked(false);
        rumplestiltskinScene.setTravelTime(240);
        scenes[SceneType.rumplestiltskin.ordinal()] = rumplestiltskinScene;
        
        Scene hungryStrangerScene = new Scene();
        hungryStrangerScene.setDescription(
             "\n There is a skinny old man sitting on a tree stump in front of you.");
        hungryStrangerScene.setMapSymbol("hungryStranger");
        hungryStrangerScene.setBlocked(false);
        hungryStrangerScene.setTravelTime(240);
        scenes[SceneType.hungryStranger.ordinal()] = hungryStrangerScene;
        
        Scene babaYagaScene = new Scene();
        babaYagaScene.setDescription(
             "\n A very very scary witch cackles at you.");
        babaYagaScene.setMapSymbol("babaYaga");
        babaYagaScene.setBlocked(false);
        babaYagaScene.setTravelTime(240);
        scenes[SceneType.babaYaga.ordinal()] = babaYagaScene;
        
        Scene huntsmanScene = new Scene();
        huntsmanScene.setDescription(
             "\n A frightening huntsman jumps out at you!");
        huntsmanScene.setMapSymbol("huntsman");
        huntsmanScene.setBlocked(false);
        huntsmanScene.setTravelTime(240);
        scenes[SceneType.huntsman.ordinal()] = huntsmanScene;
        
        Scene castleGuardsScene = new Scene();
        castleGuardsScene.setDescription(
             "\n Halt! Hey, stop! I REALY MEAN IT, HALT OR I'LL SHOOT!");
        castleGuardsScene.setMapSymbol("castleGuards");
        castleGuardsScene.setBlocked(false);
        castleGuardsScene.setTravelTime(240);
        scenes[SceneType.castleGuards.ordinal()] = castleGuardsScene;
        
        Scene bigBadWolfScene = new Scene();
        bigBadWolfScene.setDescription(
             "\n RAWR! A rabid wolf in a nightgown leaps at you!");
        bigBadWolfScene.setMapSymbol("bigBadWolf");
        bigBadWolfScene.setBlocked(false);
        bigBadWolfScene.setTravelTime(240);
        scenes[SceneType.bigBadWolf.ordinal()] = bigBadWolfScene;
        
        Scene angryGnomeScene = new Scene();
        angryGnomeScene.setDescription(
             "\n A little gnome shove you.");
        angryGnomeScene.setMapSymbol("angryGnome");
        angryGnomeScene.setBlocked(false);
        angryGnomeScene.setTravelTime(240);
        scenes[SceneType.angryGnome.ordinal()] = angryGnomeScene;
        
        Scene angryBabaYagaScene = new Scene();
        angryBabaYagaScene.setDescription(
             "\n YOU FAILED! Time for you to become my supper!");
        angryBabaYagaScene.setMapSymbol("angryBabaYaga");
        angryBabaYagaScene.setBlocked(false);
        angryBabaYagaScene.setTravelTime(240);
        scenes[SceneType.angryBabaYaga.ordinal()] = angryBabaYagaScene;
        
        Scene forestClearingScene = new Scene();
        forestClearingScene.setDescription(
             "\n There is a break in the trees and you find yourself in a small clearing.");
        forestClearingScene.setMapSymbol("forestClearing");
        forestClearingScene.setBlocked(false);
        forestClearingScene.setTravelTime(240);
        scenes[SceneType.forestClearing.ordinal()] = forestClearingScene;
        
        Scene cottageInTheWoodsScene = new Scene();
        cottageInTheWoodsScene.setDescription(
             "\n You spy a cute little cottage among the trees.");
        cottageInTheWoodsScene.setMapSymbol("cottageInTheWoods");
        cottageInTheWoodsScene.setBlocked(false);
        cottageInTheWoodsScene.setTravelTime(240);
        scenes[SceneType.cottageInTheWoods.ordinal()] = cottageInTheWoodsScene;
        
        Scene villageScene = new Scene();
        villageScene.setDescription(
             "\n You wander through a small village. It is suprisingly empty.");
        villageScene.setMapSymbol("village");
        villageScene.setBlocked(false);
        villageScene.setTravelTime(240);
        scenes[SceneType.village.ordinal()] = villageScene;
        
        Scene castleGatesScene = new Scene();
        castleGatesScene.setDescription(
             "\n You look up at the heavily fortified castle gates. Guards line the top.");
        castleGatesScene.setMapSymbol("castleGates");
        castleGatesScene.setBlocked(false);
        castleGatesScene.setTravelTime(240);
        scenes[SceneType.castleGates.ordinal()] = castleGatesScene;
        
        Scene castleCourtyardScene = new Scene();
        castleCourtyardScene.setDescription(
             "\n A wide open courtyard. A mouse scampers across it.");
        castleCourtyardScene.setMapSymbol("castleCourtyard");
        castleCourtyardScene.setBlocked(false);
        castleCourtyardScene.setTravelTime(240);
        scenes[SceneType.castleCourtyard.ordinal()] = castleCourtyardScene;
        
        Scene castleHallScene = new Scene();
        castleHallScene.setDescription(
             "\n You walk into the castle hall. There's a throne in the middle.");
        castleHallScene.setMapSymbol("castleHall");
        castleHallScene.setBlocked(false);
        castleHallScene.setTravelTime(240);
        scenes[SceneType.castleHall.ordinal()] = castleHallScene;
        
        Scene bramblePatchScene = new Scene();
        bramblePatchScene.setDescription(
             "\n Ouch!");
        bramblePatchScene.setMapSymbol("bramblePatch");
        bramblePatchScene.setBlocked(false);
        bramblePatchScene.setTravelTime(240);
        scenes[SceneType.bramblePatch.ordinal()] = bramblePatchScene;
        
        Scene cliffScene = new Scene();
        cliffScene.setDescription(
             "\n You come to the edge of a cliff. It's a long way down to the bottom.");
        cliffScene.setMapSymbol("cliff");
        cliffScene.setBlocked(false);
        cliffScene.setTravelTime(240);
        scenes[SceneType.cliff.ordinal()] = cliffScene;
        
        Scene lakeScene = new Scene();
        lakeScene.setDescription(
             "\n You arrive at the edge of a lake.");
        lakeScene.setMapSymbol("lake");
        lakeScene.setBlocked(false);
        lakeScene.setTravelTime(240);
        scenes[SceneType.lake.ordinal()] = lakeScene;
        
        Scene oceanScene = new Scene();
        oceanScene.setDescription(
             "\n You arrive at the edge of what appears to be ocean.");
        oceanScene.setMapSymbol("ocean");
        oceanScene.setBlocked(false);
        oceanScene.setTravelTime(240);
        scenes[SceneType.ocean.ordinal()] = oceanScene;
        
        Scene riverScene = new Scene();
        riverScene.setDescription(
             "\n You arrive at the edge rushing river.");
        riverScene.setMapSymbol("river");
        riverScene.setBlocked(false);
        riverScene.setTravelTime(240);
        scenes[SceneType.river.ordinal()] = riverScene;
        
        Scene forestScene = new Scene();
        forestScene.setDescription(
             "\n It is full of trees. And spiders.");
        forestScene.setMapSymbol("forest");
        forestScene.setBlocked(false);
        forestScene.setTravelTime(240);
        scenes[SceneType.forest.ordinal()] = forestScene;
        
        Scene meadowScene = new Scene();
        meadowScene.setDescription(
             "\n A meadow full of wildflowers.");
        meadowScene.setMapSymbol("meadow");
        meadowScene.setBlocked(false);
        meadowScene.setTravelTime(240);
        scenes[SceneType.meadow.ordinal()] = meadowScene;
        
        Scene cowPastureScene = new Scene();
        cowPastureScene.setDescription(
             "\n A pasture full of cows. And cow poop, yuck.");
        cowPastureScene.setMapSymbol("cowPasture");
        cowPastureScene.setBlocked(false);
        cowPastureScene.setTravelTime(240);
        scenes[SceneType.cowPasture.ordinal()] = cowPastureScene;
        
        Scene creepyCottageScene = new Scene();
        creepyCottageScene.setDescription(
             "\n A tumbledown building half covered in creeping vines.");
        creepyCottageScene.setMapSymbol("creepyCottage");
        creepyCottageScene.setBlocked(false);
        creepyCottageScene.setTravelTime(240);
        scenes[SceneType.creepyCottage.ordinal()] = creepyCottageScene;
        
        Scene endScene = new Scene();
        endScene.setDescription(
             "\n You did it, yay!");
        endScene.setMapSymbol("end");
        endScene.setBlocked(false);
        endScene.setTravelTime(240);
        scenes[SceneType.end.ordinal()] = endScene;
        
        return scenes;
    }
    
    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocation();
        
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.babaYaga.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.forestClearing.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.snowWhite.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.forest.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.angryGnome.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.cottageInTheWoods.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.river.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.cowPasture.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.bigBadWolf.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.forest.ordinal()]);
        locations[1][5].setScene(scenes[SceneType.maleficent.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.cliff.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.creepyCottage.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.bramblePatch.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.forest.ordinal()]);
        locations[2][5].setScene(scenes[SceneType.ocean.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.castleGates.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.castleCourtyard.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.castleGuards.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.castleHall.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.forest.ordinal()]);
        locations[3][5].setScene(scenes[SceneType.huntsman.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.forest.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.forestClearing.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.rumplestiltskin.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.cliff.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.meadow.ordinal()]);
        locations[4][5].setScene(scenes[SceneType.bramblePatch.ordinal()]);
        locations[5][0].setScene(scenes[SceneType.hungryStranger.ordinal()]);
        locations[5][1].setScene(scenes[SceneType.village.ordinal()]);
        locations[5][2].setScene(scenes[SceneType.cowPasture.ordinal()]);
        locations[5][3].setScene(scenes[SceneType.creepyCottage.ordinal()]);
        locations[5][4].setScene(scenes[SceneType.angryBabaYaga.ordinal()]);
        locations[5][5].setScene(scenes[SceneType.end.ordinal()]);
        
    }
}
