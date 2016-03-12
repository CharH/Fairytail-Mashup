/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.view;

import java.util.Scanner;

/**
 *
 * @author KatieSimons
 */
public abstract class View implements InterfaceView {

    protected String displayMessage;

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
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        String value = null;

        boolean valid = false; //set flag to invalid value entered
        while (!valid) { //while a valid name has not been retrieved
            //prompt for the player's name
            System.out.println("\n" + this.displayMessage);

            value = keyboard.nextLine(); //get name from keyboard
            value = value.trim(); //trim off the exess blanks
            value = value.toUpperCase(); //make upper case

            //if the name is invalid (less than one character in length)
            if (value.length() < 1) {
                System.out.println("Invalid value - the value can not be blank.");
                continue; //repeat again
            }
            break;

        }
        return value; //
    }
}
