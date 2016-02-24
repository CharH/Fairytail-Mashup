/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.view;

import fairytalemashup.model.Location;

/**
 *
 * @author charlottehuyett
 */
class MapView {

    private final String MAP_DISPLAY = buildMap();

    private String buildMap() {

        /*loop through for each coordinate on map, build string out of returns using a loop, return string to MAP_DISPLAY    
        if user has visted location
                display location name
        else
                display ???
        return string
         */
        int locationNumber = 1;
        String mapList = null;
        mapList = "\n";
        for (int i = 0; i < 6; i++) {
            mapList += "[  " + i + "  ] ";

        }
        while (locationNumber < 26) {

            Location location = new Location();
            location.setLocationName("Location#" + locationNumber);

            if ((locationNumber == 1)) {
                mapList += "\n[  " + locationNumber + "  ] ";
            }

            if (!location.isVisited()) {
                mapList += "[ ??? ] ";
            } else {
                mapList += "[ " + location.getLocationName() + " ] ";
            }

            if ((locationNumber == 5)) {
                mapList += "\n[  " + locationNumber + "  ] ";
            } else if ((locationNumber == 10) || (locationNumber == 15) || (locationNumber == 20)) {
                mapList += "\n[  " + locationNumber + " ] ";
            }

            locationNumber++;
        }
        return mapList;
    }

    public void displayMapView() {
        System.out.println(MAP_DISPLAY);
    }
}
