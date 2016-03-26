/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.view;

import fairytalemashup.control.GameControl;
import fairytalemashup.control.GameControl.Spells;
import fairytalemashup.control.MagicMakingControl;
import fairytalemashup.exceptions.MagicControlException;
import fairytalemashup.model.Spell;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author charlottehuyett
 */
public class SpellbookView extends View {

    public SpellbookView() {

        this.displayMessage = spellList()
                + "\nP - Print Menu"
                + "\nE - Exit Menu"
                + "\n------------------------------------------";
    }

    @Override
    public void display() {
        
        char selection = ' ';
        do {
            this.console.println("\n***To cast a spell, type the name or first letter of the spell you wish to use.***");
            String input = this.getInput(); //get user's selection
            selection = input.charAt(0); //get first character of string

            this.doAction(selection); //do action based on selection

        } while (selection != 'E'); //if selection is not "Quit"

    }

    public String spellList() {
        Spell[] spells = GameControl.getSortedSpellList();
        //create header
        String spellList = ("\n------------------------------------------"
                + "\n Spell List                             "
                + "\n------------------------------------------");
        spellList += ("\nName(Pieces Collected/Pieces Needed)" + "\t"
                + "Description"
                + "\n------------------------------------------");
        //display item info
        for (Spell spell : spells) {
            spellList += ("\n" + spell.getName() + " ("
                    + spell.getPiecesCollected() + "/"
                    + spell.getPiecesRequired() + ") \t - \t"
                    + spell.getDescription());
        }

        return spellList;
    }

    @Override
    public void doAction(char selection) {

        //need this to be dynamic and adjust to available spells.
        switch (selection) {
            case 'F': {
                try {
                    //view potions pack
                    this.castFireball();
                } catch (IOException ex) {
                    Logger.getLogger(SpellbookView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 'H': {
                try {
                    //view spellbook
                    this.castHydroblast();
                } catch (IOException ex) {
                    Logger.getLogger(SpellbookView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 'S': {
                try {
                    //display resources
                    this.castSoundbomb();
                } catch (IOException ex) {
                    Logger.getLogger(SpellbookView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 'I': {
                try {
                    //view weapons
                    this.castInvisibility();
                } catch (IOException ex) {
                    Logger.getLogger(SpellbookView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 'P': {
                this.printMenu();
            }
            break;
            case 'E': //exit the menu
                return;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
                break;
        }
    }

    String tonePrompt = "Would you like to [1] whisper, [2] speak, or [3] yell the spell?";
    String actionPrompt = "Would you like to [1] stand still, [2] wave your arms, or [3]dance while casting the spell?";

    private void castFireball() throws IOException {
        Spell[] spells = GameControl.getSortedSpellList();
        Spell chosenSpell = spells[Spells.fireball.ordinal()];
        boolean viable = MagicMakingControl.castable(chosenSpell);
        if (viable == true) {
            try {
                int playerTone = 0;
                boolean valid = false;
                while (valid == false) {
                    playerTone = Integer.parseInt(getInput(tonePrompt));
                    valid = MagicMakingControl.inputCheck(playerTone);
                }
                int playerAction = Integer.parseInt(getInput(actionPrompt));
                int spellEffect = MagicMakingControl.castSpell(playerAction, playerTone, chosenSpell);

                this.console.println("You cast " + chosenSpell.getName() + " and it does "
                        + spellEffect + " damage to your surroundings.");
            } catch (MagicControlException mce) {
                ErrorView.display(this.getClass().getName(), mce.getMessage());
            } catch (NumberFormatException nf) {
                ErrorView.display(this.getClass().getName(), "****ERROR: You must enter a number.");
            }
        }
    }

    private void castHydroblast() throws IOException {
        Spell[] spells = GameControl.getSortedSpellList();
        Spell chosenSpell = spells[Spells.hydroblast.ordinal()];
        boolean viable = MagicMakingControl.castable(chosenSpell);
        if (viable == true) {
            try {
                int playerTone = 0;
                boolean valid = false;
                while (valid == false) {
                    playerTone = Integer.parseInt(getInput(tonePrompt));
                    valid = MagicMakingControl.inputCheck(playerTone);
                }
                int playerAction = Integer.parseInt(getInput(actionPrompt));
                int spellEffect = MagicMakingControl.castSpell(playerAction, playerTone, chosenSpell);

                this.console.println("You cast " + chosenSpell.getName() + " and it does "
                        + spellEffect + " damage to your surroundings.");
            } catch (MagicControlException mce) {
                ErrorView.display(this.getClass().getName(), mce.getMessage());
            } catch (NumberFormatException nf) {
                ErrorView.display(this.getClass().getName(), "****ERROR: You must enter a number.");
            }
        }
    }

    private void castSoundbomb() throws IOException {
        Spell[] spells = GameControl.getSortedSpellList();
        Spell chosenSpell = spells[Spells.soundbomb.ordinal()];
        boolean viable = MagicMakingControl.castable(chosenSpell);
        if (viable == true) {
            try {
                int playerTone = 0;
                boolean valid = false;
                while (valid == false) {
                    playerTone = Integer.parseInt(getInput(tonePrompt));
                    valid = MagicMakingControl.inputCheck(playerTone);
                }
                int playerAction = Integer.parseInt(getInput(actionPrompt));
                int spellEffect = MagicMakingControl.castSpell(playerAction, playerTone, chosenSpell);

                this.console.println("You cast " + chosenSpell.getName() + " and it does "
                        + spellEffect + " damage to your surroundings.");
            } catch (MagicControlException mce) {
                ErrorView.display(this.getClass().getName(), mce.getMessage());
            } catch (NumberFormatException nf) {
                ErrorView.display(this.getClass().getName(), "****ERROR: You must enter a number.");
            }
        }
    }

    private void castInvisibility() throws IOException {
        Spell[] spells = GameControl.getSortedSpellList();
        Spell chosenSpell = spells[Spells.invisibility.ordinal()];
        boolean viable = MagicMakingControl.castable(chosenSpell);
        if (viable == true) {
            try {
                int playerTone = 0;
                boolean valid = false;
                while (valid == false) {
                    playerTone = Integer.parseInt(getInput(tonePrompt));
                    valid = MagicMakingControl.inputCheck(playerTone);
                }
                int playerAction = Integer.parseInt(getInput(actionPrompt));
                int spellEffect = MagicMakingControl.castSpell(playerAction, playerTone, chosenSpell);

                this.console.println("You cast " + chosenSpell.getName() + " and it does "
                        + spellEffect + " damage to your surroundings.");
            } catch (MagicControlException mce) {
                ErrorView.display(this.getClass().getName(), mce.getMessage());
            } catch (NumberFormatException nf) {
                ErrorView.display(this.getClass().getName(), "****ERROR: You must enter a number.");
            }
        }
    }

    private void printMenu() {
        this.console.println("\n\nEnter a file path for where the menu is to be printed.");
        String filePath = this.getInput();
        boolean printTest = true;
        try {
            GameControl.printMenu(spellList(), filePath);

        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "****ERROR: There has been an error printing the menu.");
            printTest = false;
        }
        if (printTest != false) {
            this.console.println("The menu has been printed to " + filePath);
        }

    }

}
