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
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        this.console.println("\nMap of Fairytale Land");
        //display row of column numbers
        String spacer = "     ";
        String bigSpacer = "       ";
        this.console.print(spacer + "0" + bigSpacer + "1" + bigSpacer + "2" + bigSpacer + "3" + bigSpacer + "4" + bigSpacer + "5");

        for (int row = 0; row < locations.length; row++) {
            //display row divider
            this.console.print("\n-------------------------------------------------");
            //display row number
            this.console.print("\n" + row + "|");

            for (int column = 0; column < locations[row].length; column++) {
                //display column divider

                Location location = locations[row][column];
                //if location has been visited, display symbol/name, otherwise ???
                if (location.isVisited() == true) {
                    Scene scene = location.getScene();
                    this.console.print(scene.getMapSymbol());
                } else {
                    this.console.print(" ????? ");
                }
                this.console.print("|");
                //if column end display divider
                if (column == locations.length) {
                    this.console.println("|");
                }

            }

        }
        //display ending row divider
        this.console.println("\n-------------------------------------------------");
    }

    @Override
    public String getInput() {

        String value = null;

        boolean valid = false; //set flag to invalid value entered
        while (!valid) { //while a valid coordinants has not been retrieved
            //prompt for the player's coordinants
            this.console.println("\n Enter your Coordinants by entering two numbers, separated by a comma");

            try {
                value = this.keyboard.readLine(); //get coordinants from keyboard
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(),"Error reading input");
            }
            value = value.trim(); //trim off the exess blanks
            int findComma = value.indexOf(",");
            int numberThing = findComma + 1;
            int numberThing2 = findComma + 2;

            try {

                int x = Integer.parseInt(value.substring(0, findComma));
                int y = Integer.parseInt(value.substring(numberThing, numberThing2));
            } catch (NumberFormatException nf) {
                ErrorView.display(this.getClass().getName(),"****ERROR: You must enter two numbers, seperated by a comma!");
            }

            //if the coordinant is invalid (less than one character in length)
            /*value.useDelimiter (", "); 
            int x = value.nextInt(); 
            int y = value.nextInt();*/
            if (value.length() < 1) {
                ErrorView.display(this.getClass().getName(),"Invalid value - the value can not be blank.");
                continue; //repeat again
            }
            break;
        }
        return value; //
    }
}
