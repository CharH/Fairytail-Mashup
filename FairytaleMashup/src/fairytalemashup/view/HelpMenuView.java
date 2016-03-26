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
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n"
                + "\n------------------------------------------"
                + "\n| Help Menu                              |"
                + "\n------------------------------------------"
                + "\nW - What is my goal?"
                + "\nH - How to Play"
                + "\nP - Potion Making"
                + "\nS - Spellcasting"
                + "\nE - Exit Menu"
                + "\n------------------------------------------");
    }

    @Override
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
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break;
        }
    }

    private void displayPlayerQuest() {
        this.console.println("\n***displayPlayerQuest stub function called.***");
    }

    private void displayHowToPlay() {
        this.console.println("\n***displayHowToPlay stub function called.***");
    }

    private void displayPotionInfo() {
        this.console.println("\n***displayPotionInfo stub function called.***");
    }

    private void displaySpellInfo() {
        this.console.println("\n***displaySpellInfo stub function called.***");
    }

}
