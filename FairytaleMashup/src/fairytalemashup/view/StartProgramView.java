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
 * @author charlottehuyett
 */
public class StartProgramView {

    private String promptMessage;

    public StartProgramView() {
        this.promptMessage = "\nPlease enter your name: ";
        //display the banner when view is created
        this.displayBanner();

    }

    private void displayBanner() {
        System.out.println(
                "\n****************************************************"
                + "\n*                                                  *"
                + "\n* This is the Fairytale Mashup Game.               *"
                + "\n*                                                  *"
                + "\n* In this game you will wander through fairytale   *"
                + "\n* land and help spread happy endings by            *"
                + "\n* completeing quests.                              *"
                + "\n*                                                  *"
                + "\n* During your wanderings you will meet different   *"
                + "\n* fairytale characters and by helping them with    *"
                + "\n* tasks such as defeat the huntsman chasing Snow   *"
                + "\n* White and escort her to the dwarfs cottage, find *"
                + "\n* the Miller's Daughter's lost locket to pay off   *"
                + "\n* Rumplestiltskin, or create a potion to undo      *"
                + "\n* the Wicked Fairy's curse and free Sleeping       *"
                + "\n* Beauty's castle.                                 *"
                + "\n*                                                  *"
                + "\n* Once you have helped restored the characters     *"
                + "\n* happy endings through a combination of resource  *"
                + "\n* gathering, battling, potion making and           *"
                + "\n* spellcasting, you will reach your own.           *"
                + "\n*                                                  *"
                + "\n* Good luck and have fun!                          *"
                + "\n*                                                  *"
                + "\n****************************************************"
        );
    }

    public void displayStartProgramView() {
        boolean done = false; // set flag to not done
        do {
            //prompt and get player's name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) //user wants to quit
            {
                return; //exit the game
            }            //do the thing and display the next thing
            done = this.doAction(playersName);
        } while (!done);
    }

    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        String value = "";

        boolean valid = false; //set flag to invalid value entered
            while (!valid) { //while a valid name has not been retrieved
                //prompt for the player's name
            System.out.println(this.promptMessage);

            value = keyboard.nextLine(); //get name from keyboard
                value = value.trim(); //trim off the exess blanks

                //if the name is invalid (less than one character in length)
                if (value.length() < 1) {
                    ErrorView.display(this.getClass().getName(), "Invalid value - the value can not be blank.");
                    continue; //repeat again
                }
                valid = true; //set flag to end repetition
            }
        return value; //
    }

    private boolean doAction(String playersName) {

        if (playersName.length() < 2) {
            ErrorView.display(this.getClass().getName(), "Invalid players name:"
                    + "Your name is too short! Why don't you try something longer?");
            return false;
        }
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);

        if (player == null) { //if unsuccessful
            ErrorView.display(this.getClass().getName(), "\n Error creating the player.");
            return false;
        }
        this.displayNextView(player);
        return true; //success
    }

    private void displayNextView(Player player) {
        System.out.println("\n==========================================="
                + "\n Welcome to Fairytale Land " + player.getName()
                + "\n We hope you have a magical time playing!"
                + "\n==========================================="
        );
        //create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();

        //display the main menu view
        mainMenuView.display();
    }
}
