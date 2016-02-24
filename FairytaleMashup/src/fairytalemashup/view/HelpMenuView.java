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
class HelpMenuView {
 
    private final String HELP_MENU = "\n"
            + "\n------------------------------------------"
            + "\n| Help Menu                              |"
            + "\n------------------------------------------"
            + "\nW - What is my goal?"
            + "\nH - How to Play"
            + "\nP - Potion Making"
            + "\nS - Spellcasting"
            + "\nE - Exit Menu"
            + "\n------------------------------------------";


    public void displayMenu() {
        char selection = ' ';
        do {
               System.out.println(HELP_MENU); //display the help menu
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
            case 'W': //What is the player's current goal?
                this.displayPlayerQuest();
                break;
            case 'H': //How to play
                this.displayHowToPlay();
                break;
            case 'P': //Potion making info
                this.displayPotionInfo();
                break;
            case 'S': //spellcasting info
                this.displaySpellInfo();
                break;
            case 'E': //exit the menu
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    private void displayPlayerQuest() {
        System.out.println("\n***displayPlayerQuest stub function called.***");
    }

    private void displayHowToPlay() {
        System.out.println("\n***displayHowToPlay stub function called.***");
    }

    private void displayPotionInfo() {
        System.out.println("\n***displayPotionInfo stub function called.***");
    }

    private void displaySpellInfo() {
        System.out.println("\n***displaySpellInfo stub function called.***");
    }


    
}
