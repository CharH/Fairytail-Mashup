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
class GameMenuView {
    
    private final String GAME_MENU = "\n"
            + "\n------------------------------------------"
            + "\n| Game Menu                              |"
            + "\n------------------------------------------"
            + "\nM - View Map"
            + "\nE - Explore Location"
            + "\nI - View Inventory"
            + "\nR - Read Storybook"
            + "\nT - Talk with NPC"
            + "\nG - Gather Resources"
            + "\nB - Brew a Potion"
            + "\nC - Cast a Spell"
            + "\nH - Get Help"
            + "\nQ - Quit Game"
            + "\n------------------------------------------";



    public void displayMenu() {
        char selection = ' ';
        do {
               System.out.println(GAME_MENU); //display the game menu
               String input = this.getInput(); //get user's selection
               selection = input.charAt(0); //get first character of string
               
               this.doAction(selection); //do action based on selection
           
        } while (selection != 'Q'); //if selection is not "Quit"
        
       
    }
     private String getInput() {
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        String value = "";
        String promptMessage = "\nPlease select an action.";
        
        boolean valid = false; //set flag to invalid value entered
        while (!valid) { //while a valid name has not been retrieved
            //prompt for the player's name
            System.out.println(promptMessage);
            
            value = keyboard.nextLine(); //get command from keyboard
            value = value.trim(); //trim off the exess blanks
            value = value.toUpperCase(); //convert to uppercase
            
            //if the name is invalid (less than one character in length)
            if (value.length() <1) {
                System.out.println("Whoops! You can't leave this blank, silly.");
                continue; //repeat again
            }
            valid = true; //set flag to end repetition
          
            
        }
        return value; //
    }
    public void doAction(char selection) {
        switch (selection) {
            case 'M': //view map
                this.viewMap();
                break;
            case 'E': //explore location
                this.exploreLocation();
                break;
            case 'I': //view inventory
                this.displayInventoryMenu();
                break;
            case 'R': //read storybook aka view storybook menu
                this.displayStorybookMenu();
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
            case 'Q': //exit to main menu
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    private void viewMap() {
        System.out.println("***viewMap function called");
    }

    private void exploreLocation() {
        System.out.println("***exploreLocation function called");
    }

    private void displayInventoryMenu() {
        //create InventoryMenuView object
        InventoryMenuView inventoryMenuView = new InventoryMenuView();
        
        //display the main menu view
        inventoryMenuView.displayInventoryMenu();
    }

    private void displayStorybookMenu() {
        System.out.println("***displayStorybookMenu function called");
    }

    private void talkToActor() {
        System.out.println("***talkToActor function called");
    }

    private void gatherResources() {
        System.out.println("***gatherResources function called");
    }

    private void displayPotionMenu() {
        System.out.println("***displayPotionMenu function called");
    }

    private void displaySpellMenu() {
        System.out.println("***displaySpellMenu function called");
    }

    private void displayHelpMenu() {
        //create HelpMenuView object
        HelpMenuView helpMenuView = new HelpMenuView();
        
        //display the help menu view
        helpMenuView.displayMenu();
    }
    

   
}


//[ ??? ][ ??? ][ ??? ][ ??? ][ ??? ]
//[ ??? ][ ??? ][ ??? ][ ??? ][ ??? ]
//[ ??? ][ ??? ][ ??? ][ ??? ][ ??? ]
//[ ??? ][ ??? ][ ??? ][ ??? ][ ??? ]
//[ ??? ][ ??? ][ ??? ][ ??? ][ ??? ]