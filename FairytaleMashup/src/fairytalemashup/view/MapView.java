/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.view;

import fairytalemashup.model.Location;

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

    private final String MAP_DISPLAY = buildMap();

    private String buildMap() {

        /*loop through for each coordinate on map, build string out of returns using a loop, return string to MAP_DISPLAY    
        if user has visted location
                display location name
        else
                display ???
        return string
         */
        int i = 1;
        String mapList = null; // string that will contain the map
        mapList = "\n";
        for (int j = 0; j < 6; j++) { //for loop builds coordinates across top of map
            mapList += "[  " + j + "  ] ";

        }
        while (i < 26) { //builds 25 locations for map, plus coordinates down side of map.

            //***********************************
            /*Block of code below was needed in order to run function, but
            will need to change to pull from actual locations instead of blank
            ones generated here.*/
            //***********************************
            Location location = new Location();
            location.setLocationName("Location#" + i);
            //***********************************

            if ((i == 1)) { //creates first row and row coordinate.
                mapList += "\n[  " + i + "  ] ";
            }

            if (!location.isVisited()) { //hides name if user hasn't visted the location yet
                mapList += "[ ??? ] ";
            } else { //displays name if user has visted the location
                mapList += "[ " + location.getLocationName() + " ] ";
            }

            if ((i == 5)||(i == 10) || (i == 15) || (i == 20)) { //breaks string into more rows and adds row coordinates.
                mapList += "\n[  " + (i/5 + 1) + "  ] ";
            
            }

            i++;
        }
        return mapList; //return string with map info.
    }
    
    @Override  
    public void display() {
        System.out.println(MAP_DISPLAY);
    }
}
