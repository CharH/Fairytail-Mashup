/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.view;

import fairytalemashup.control.GameControl;
import fairytalemashup.model.Location;
import fairytalemashup.model.Map;
import fairytalemashup.model.Scene;

/*
 *
 * @author charlottehuyett
 */
public class MapView extends View {
    public MapView() {
        super ();
}
    @Override
    public void doAction(char selection) {
        return;
    }

    @Override  
    public void display() {
        Location[][] locations = GameControl.getMap();
        
        //Display Title
        System.out.println("\nMap of Fairytale Land");
        //display row of column numbers
        System.out.println("0" + "\t" + "1" + "\t" + "2" + "\t" + "3" + "\t" + "4" + "\t" + "5");
        
        for ( Location row : locations){
            //display row divider
            System.out.println("-------------------------------------------------");
            //display row number
            System.out.println(row);
            
            for (Location column : locations){
                //display column divider
                System.out.println("\t"+"|*|");
                Location location = locations[row][column];
                //if location has been visited, display symbol/name, otherwise ???
                if (location.isVisited() == true) {
                    System.out.println(location.getMapSymbol());
                } else{
                    System.out.println("?????");
                }
                //if column end display divider
                if (column == locations.length){
                    System.out.println("\t"+"|*|");
                    
                }
                
            }
            //display ending row divider
            System.out.println("-------------------------------------------------");
        }
    }
}
