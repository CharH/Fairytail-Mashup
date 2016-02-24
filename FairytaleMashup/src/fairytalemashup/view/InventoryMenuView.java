/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.view;

import fairytalemashup.FairytaleMashup;
import fairytalemashup.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author KatieSimons
 */
public class InventoryMenuView {

    private final String INVENTORY_MENU = "\n"
            + "\n------------------------------------------"
            + "\n| Inventory Menu                              |"
            + "\n------------------------------------------"
            + "\nP - Potions Pack"
            + "\nS - Spellbook"
            + "\nR - Resources"
            + "\nW - Weapons"
            + "\nE - Exit Menu"
            + "\n------------------------------------------";

    public void displayInventoryMenu() {

        char selection = ' ';
        do {
            System.out.println(INVENTORY_MENU); //display the inventory menu
            String input = this.getInput(); //get user's selection
            selection = input.charAt(0); //get first character of string

            this.doAction(selection); //do action based on selection

        } while (selection != 'E'); //if selection is not "Exit"

    }

    private String getInput() {
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        String value = "";
        String promptMessage = "\nPlease select an option.";

        boolean valid = false; //set flag to invalid value entered
        while (!valid) { //while a valid name has not been retrieved
            //prompt for the player's name
            System.out.println(promptMessage);

            value = keyboard.nextLine(); //get name from keyboard
            value = value.trim(); //trim off the exess blanks
            value = value.toUpperCase(); //convert to uppercase

            //if the name is invalid (less than one character in length)
            if (value.length() < 1) {
                System.out.println("Invalid value - the value can not be blank.");
                continue; //repeat again
            }
            valid = true; //set flag to end repetition

        }
        return value; //
    }

    public void doAction(char selection) {
        switch (selection) {
            case 'P': //view potions pack
                this.displayPotionsPack();
                break;
            case 'S': //view spellbook
                this.displaySpells();
                break;
            case 'R': //display resources
                this.displayResources();
                break;
            case 'W': //view weapons
                this.displayWeapons();
                break;
            case 'E': //exit the menu
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    private void displayPotionsPack() {
        System.out.println("\n***display PotionsPack stub function called.***");
    }

    private void displaySpells() {
        System.out.println("\n***display Spells stub function called.***");
    }

    private void displayResources() {
        System.out.println("\n***display Resources stub function called.***");
        //create MainMenuView object
        //HelpMenuView helpMenuView = new HelpMenuView();

        //display the main menu view
        //helpMenuView.displayMenu();
    }

    private void displayWeapons() {
        System.out.println("\n***display weapons stub function called.***");
    }
}
