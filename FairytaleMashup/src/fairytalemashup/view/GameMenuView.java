/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.view;

import java.util.Scanner;

/**
 *
 * @author charlottehuyett
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n------------------------------------------"
                + "\n| Game Menu                              |"
                + "\n------------------------------------------"
                + "\nV - View Map"
                + "\nM - Move to New Location"
                + "\nE - Explore Location"
                + "\nI - View Inventory"
                + "\nR - Read Story Guidebook"
                + "\nT - Talk with NPC"
                + "\nG - Gather Resources"
                + "\nB - Brew a Potion"
                + "\nC - Cast a Spell"
                + "\nH - Get Help"
                + "\nQ - Quit Game"
                + "\n------------------------------------------");
    }

    @Override
    public void display() {
        char selection = ' ';
        do {
            String input = this.getInput(); //get user's selection
            selection = input.charAt(0); //get first character of string

            this.doAction(selection); //do action based on selection

        } while (selection != 'Q'); //if selection is not "Quit"

    }

    @Override
    public void doAction(char selection) {
        switch (selection) {
            case 'V': //view map
                this.viewMap();
                break;
            case 'M': //move player to new location
                this.movePlayer();
                break;
            case 'E': //explore location
                this.exploreLocation();
                break;
            case 'I': //view inventory
                this.displayInventoryMenu();
                break;
            case 'R': //read Guidebook aka view storybook menu
                this.displayGuidebookMenu();
                break;
            case 'T': //talk to NPC
                this.talkToActor();
                break;
            case 'G': //Gather resources
                this.gatherResources();
                break;
            case 'B': //brew a potion
                this.displayPotionMenu();
                break;
            case 'C': //cast a spell
                this.displaySpellMenu();
                break;
            case 'H': //view help menu
                this.displayHelpMenu();
                break;
            case 'S': //Search Fairytales
                this.displaySearch();
                break;
            case 'Q': //exit to main menu
                return;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break;
        }
    }

    private void viewMap() {
        //create MapView object
        MapView mapView = new MapView();
        //display map view
        mapView.display();
    }

    private void movePlayer() {
        MapView mapView = new MapView();
        String coordinants = mapView.getInput();
        this.console.println("\n Player attempted to move to space " + coordinants + " but failed.");
    }

    private void exploreLocation() {
        this.console.println("***exploreLocation function called");
    }

    private void displayInventoryMenu() {
        //create InventoryMenuView object
        InventoryMenuView inventoryMenuView = new InventoryMenuView();

        //display the inventory menu view
        inventoryMenuView.display();
    }

    private void displayGuidebookMenu() {
        GuidebookView guidebookView = new GuidebookView();
        guidebookView.display();
    }

    private void talkToActor() {
        this.console.println("***talkToActor function called");
    }

    private void gatherResources() {
        this.console.println("***gatherResources function called");
    }

    private void displayPotionMenu() {
        this.console.println("***displayPotionMenu function called");
    }

    private void displaySpellMenu() {
        SpellbookView spellbookView = new SpellbookView();
        spellbookView.display();
    }

    private void displayHelpMenu() {
        //create HelpMenuView object
        HelpMenuView helpMenuView = new HelpMenuView();

        //display the help menu view
        helpMenuView.display();
    }

    private void displaySearch() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
