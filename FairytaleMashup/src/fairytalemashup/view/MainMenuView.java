/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.view;

import fairytalemashup.FairytaleMashup;
import fairytalemashup.control.GameControl;
import fairytalemashup.exceptions.MapControlException;

/**
 *
 * @author charlottehuyett
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n------------------------------------------"
                + "\n| Main Menu                              |"
                + "\n------------------------------------------"
                + "\nN - Start a New Game"
                + "\nR - Retrieve Saved Game"
                + "\nH - Get Help"
                + "\nS - Save Game"
                + "\nE - Exit"
                + "\n------------------------------------------");
    }

    @Override
    public void doAction(char selection) {
        switch (selection) {
            case 'N': //create and start a new game
                this.startNewGame();
                break;
            case 'R': //start saved game
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
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break;
        }
    }

    private void startNewGame() {
        try {
            GameControl.createNewGame(FairytaleMashup.getPlayer());

        } catch (MapControlException me) {
            this.console.println(me.getMessage());
        }

        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();

    }

    private void startExistingGame() {
        //this.console.println("***ExistingGame function called");
        this.console.println("\n\nEnter the file path for the file where the game " +
                 " is to be saved.");
        
        String filePath = this.getInput();
        
        try {
            GameControl.getExistingGame(filePath);
        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(),"MainMenuView");
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
        //create HelpMenuView object
        HelpMenuView helpMenuView = new HelpMenuView();

        //display the help menu view
        helpMenuView.display();
    }

    private void saveGame() {
       // this.console.println("***saveGame function called");
        this.console.println("\n\nEnter the file path for the file where the game " +
                 "is to be saved.");
        String filePath = this.getInput();
        
        try {
            GameControl.saveGame(FairytaleMashup.getCurrentGame(), filePath);
        } catch(Exception ex) {
            ErrorView.display(this.getClass().getName(),"MainMenuView");
        }
    }
}
