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
public class MainMenuView {
    
    private final String MENU = "\n"
            + "\n------------------------------------------"
            + "\n| Main Menu                              |"
            + "\n------------------------------------------"
            + "\nN - Start a New Game"
            + "\nG - Retrieve Saved Game"
            + "\nH - Get Help"
            + "\nS - Save Game"
            + "\nE - Exit"
            + "\n------------------------------------------";


    public void displayMenu() {
        char selection = ' ';
        do {
               System.out.println(MENU); //display the main menu
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
            if (value.length() <1) {
                System.out.println("Invalid value - the value can not be blank.");
                continue; //repeat again
            }
            valid = true; //set flag to end repetition
          
            
        }
        return value; //
    }

    public void doAction(char selection) {
        switch (selection) {
            case 'N': //create and start a new game
                this.startNewGame();
                break;
            case 'G': //start saved game
                this.startExistingGame();
                break;
            case 'H': //display help menu
                this.displayHelpMenu();
                break;
            case 'S': //save current game
                this.saveGame();
                break;
            case 'E': //exit the game
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    private void startNewGame() {
        System.out.println("***startNewGame function called");
    }

    private void startExistingGame() {
        System.out.println("***startExistingGame function called");
    }

    private void displayHelpMenu() {
        System.out.println("***displayHelpMenu function called");
    }

    private void saveGame() {
        System.out.println("***saveGame function called");
    }
}
