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
    
    public View(){
        super();
    }
    
    public View(String message){
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        boolean done=false;
        do {
            String selection = this.getInput(); //get user's selection

            if (selection.toUpperCase().equals("Q"))
                return;
            done=this.doAction(selection); //do action based on selection

        } while (!done); //if selection is not "Exit"

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
