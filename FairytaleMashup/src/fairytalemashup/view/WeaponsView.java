/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.view;

import fairytalemashup.control.GameControl;
import fairytalemashup.model.Player;
import java.util.Scanner;

/**
 *
 * @author KatieSimons
 */
public class WeaponsView {

    private String promptMessage;

    public WeaponsView() {
        this.promptMessage = "\nEnter the type of weapon you wish to use: ";
        /*In the future weapon inputs will only be valid if player has that weapon in thier
  inventory, but that has not yet been set up.*/
    }

    public void displayWeaponsView() {
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
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        String value = "";

        boolean valid = false; //set flag to invalid value entered
        while (!valid) { //while a weapon type has not been retrieved
            //prompt for the weapon type
            System.out.println(this.promptMessage);

            value = keyboard.nextLine(); //get name from keyboard
            value = value.trim(); //trim off the exess blanks

            //if the weapon type is invalid (less than one character in length)
            if (value.length() < 1) {
                System.out.println("Invalid value - the value can not be blank.");
                continue; //repeat again
            }
            valid = true; //set flag to end repetition
        }
        return value; //
    }

    private boolean doAction(String weaponType) {
        /*if (weaponType != "Sword || ax || crossbow || dagger") { //if unsuccessful
            System.out.println("\n Error: weapon type not valid.");
            return false;
        }*/
        if (weaponType.length() < 1 || weaponType == " ") {
            System.out.println("Error: invlaid entry");
            return false;
        } else {
            System.out.println(weaponType + " has been selected.");
            return true;
        }

    }

}
