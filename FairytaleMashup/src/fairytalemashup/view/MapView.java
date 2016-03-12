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
        super();
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
        String spacer = "     ";
        String bigSpacer = "       ";
        System.out.print(spacer + "0" + bigSpacer + "1" + bigSpacer + "2" + bigSpacer + "3" + bigSpacer + "4" + bigSpacer + "5");

        for (int row = 0; row < locations.length; row++) {
            //display row divider
            System.out.print("\n-------------------------------------------------");
            //display row number
            System.out.print("\n" + row + "|");

            for (int column = 0; column < locations[row].length; column++) {
                //display column divider

                Location location = locations[row][column];
                //if location has been visited, display symbol/name, otherwise ???
                if (location.isVisited() == true) {
                    Scene scene = location.getScene();
                    System.out.print(scene.getMapSymbol());
                } else {
                    System.out.print(" ????? ");
                }
                System.out.print("|");
                //if column end display divider
                if (column == locations.length) {
                    System.out.println("|");
                }

            }

        }
        //display ending row divider
        System.out.println("\n-------------------------------------------------");
    }
}
