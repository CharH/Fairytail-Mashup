/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.view;

import fairytalemashup.FairytaleMashup;
import fairytalemashup.control.GameControl;
import fairytalemashup.model.Player;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author KatieSimons
 */
public class WeaponsView {

    private String promptMessage;
    private final BufferedReader keyboard = FairytaleMashup.getInFile();
    private final PrintWriter console = FairytaleMashup.getOutFile();

    public WeaponsView() {
        this.promptMessage = "\nEnter the type of weapon you wish to use: ";
        /*In the future weapon inputs will only be valid if player has that weapon in thier
  inventory, but that has not yet been set up.*/
    }

    public void displayWeaponsView() throws IOException {
        boolean done = false; // set flag to not done
        do {
            //prompt and get weapon type
            String weaponType = this.getWeaponType();
            if (weaponType.toUpperCase().equals("E")) //user wants to exit inventory
            {
                return; //exit the game
            }            //do the thing and display the next thing
            done = this.doAction(weaponType);
        } while (!done);
    }

    private String getWeaponType() {

        String value = "";

        boolean valid = false; //set flag to invalid value entered
        try {
            while (!valid) { //while a weapon type has not been retrieved
                //prompt for the weapon type
                this.console.println(this.promptMessage);

                value = this.keyboard.readLine(); //get name from keyboard
                value = value.trim(); //trim off the exess blanks

                //if the weapon type is invalid (less than one character in length)
                if (value.length() < 1) {
                    ErrorView.display(this.getClass().getName(), "Invalid value - the value can not be blank.");
                    continue; //repeat again
                }
                valid = true; //set flag to end repetition
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
        }
        return value; //
    }

    private boolean doAction(String weaponType) {

        if (weaponType.length() < 1 || weaponType == " ") {
            ErrorView.display(this.getClass().getName(), "Error: invlaid entry");
            return false;
        } else {
            this.console.println(weaponType + " has been selected.");
            return true;
        }

    }

}
