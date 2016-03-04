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
    
     public HelpMenuView(){
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
