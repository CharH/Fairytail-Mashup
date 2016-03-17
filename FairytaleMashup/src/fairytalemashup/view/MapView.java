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
import java.util.Scanner;

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
    
    @Override
        public String getInput() {
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        String value = null;

        boolean valid = false; //set flag to invalid value entered
        while (!valid) { //while a valid coordinants has not been retrieved
            //prompt for the player's coordinants
            System.out.println("\n Enter your Coordinants by entering two numbers, separated by a comma");

            value = keyboard.nextLine(); //get coordinants from keyboard
            value = value.trim(); //trim off the exess blanks
            int findComma = value.indexOf(",");
            int x = Integer.parseInt(value.substring(0, findComma));
            int y = Integer.parseInt(value.substring(findComma,findComma+2));
            //if the coordinant is invalid (less than one character in length)
            
            /*value.useDelimiter (", "); 
            int x = value.nextInt(); 
            int y = value.nextInt();*/
            if (value.length() < 1) {
                System.out.println("Invalid value - the value can not be blank.");
                continue; //repeat again
            }
            break;
        }
        return value; //
     }
}
