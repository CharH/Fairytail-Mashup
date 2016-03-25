/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.view;

import fairytalemashup.FairytaleMashup;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KatieSimons
 */
public abstract class View implements InterfaceView {

    protected String displayMessage;
    protected final BufferedReader keyboard = FairytaleMashup.getInFile();
    protected final PrintWriter console = FairytaleMashup.getOutFile();

    public View() {
        super();
    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {
        char selection = ' ';
        do {

            String input = this.getInput(); //get user's selection
            selection = input.charAt(0); //get first character of string

            this.doAction(selection); //do action based on selection

        } while (selection != 'E'); //if selection is not "Exit"
    }

    @Override
    public String getInput() {
 
        String value = null;

        boolean valid = false; //set flag to invalid value entered
        while (!valid) { //while a valid name has not been retrieved
            //prompt for the player's name
            this.console.println("\n" + this.displayMessage);

            try {
                value = this.keyboard.readLine(); //get name from keyboard
            } catch (IOException ex) {
                this.console.println("Error Reading Inpunt");
            }
            value = value.trim(); //trim off the exess blanks
            value = value.toUpperCase(); //make upper case

            //if the name is invalid (less than one character in length)
            if (value.length() < 1) {
                this.console.println("Invalid value - the value can not be blank.");
                continue; //repeat again
            }
            break;

        }
        return value; //
    }
    public String getInput(String s) throws IOException {
        String value = null;

        boolean valid = false; //set flag to invalid value entered
        while (!valid) { //while a valid name has not been retrieved
            //prompt for the player's name
            this.console.println("\n" + s);

            value = this.keyboard.readLine(); //get name from keyboard
            value = value.trim(); //trim off the exess blanks
            value = value.toUpperCase(); //make upper case

            //if the name is invalid (less than one character in length)
            if (value.length() < 1) {
                this.console.println("Invalid value - the value can not be blank.");
                continue; //repeat again
            }
            break;

        }
        return value; //
    }
}
