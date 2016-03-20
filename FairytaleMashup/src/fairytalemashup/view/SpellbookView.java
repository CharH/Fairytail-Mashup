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

/**
 *
 * @author charlottehuyett
 */
public class SpellbookView extends View {

    public SpellbookView() {

        this.displayMessage = "\nTo use a spell, type in the name or type E to exit this menu.";
    }

    @Override
    public void display() {
        System.out.println(spellList());
        char selection = ' ';
        do {
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
            case 'F': //view potions pack
                this.castFireball();
                break;
            case 'H': //view spellbook
                this.castHydroblast();
                break;
            case 'S': //display resources
                this.castSoundbomb();
                break;
            case 'I': //view weapons
                this.castInvisibility();
                break;
            case 'E': //exit the menu
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    String tonePrompt = "Would you like to [1] whisper, [2] speak, or [3] yell the spell?";
    String actionPrompt = "Would you like to [1] stand still, [2] wave your arms, or [3]dance while casting the spell?";

    private void castFireball() {
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
                    continue;
                }
                int playerAction = Integer.parseInt(getInput(actionPrompt));
                int spellEffect = MagicMakingControl.castSpell(playerAction, playerTone, chosenSpell);

                System.out.println("You cast " + chosenSpell.getName() + " and it does "
                        + spellEffect + " damage to your surroundings.");
            } catch (MagicControlException mce) {
                System.out.println(mce.getMessage());
            } catch (NumberFormatException nf) {
                System.out.println("****ERROR: You must enter a number.");
            }
        }
        return;
    }

    private void castHydroblast() {
        Spell[] spells = GameControl.getSortedSpellList();
        Spell chosenSpell = spells[Spells.hydroblast.ordinal()];
        boolean viable = MagicMakingControl.castable(chosenSpell);
        if (viable == true) {
            try {
                int playerTone = Integer.parseInt(getInput(tonePrompt));
                int playerAction = Integer.parseInt(getInput(actionPrompt));
                int spellEffect = MagicMakingControl.castSpell(playerAction, playerTone, chosenSpell);

                System.out.println("You cast " + chosenSpell.getName() + " and it does "
                        + spellEffect + " damage to your surroundings.");
            } catch (MagicControlException mce) {
                System.out.println(mce.getMessage());
            } catch (NumberFormatException nf) {
                System.out.println("****ERROR: You must enter a number.");
            }
        }
        return;
    }

    private void castSoundbomb() {
        Spell[] spells = GameControl.getSortedSpellList();
        Spell chosenSpell = spells[Spells.soundbomb.ordinal()];
        boolean viable = MagicMakingControl.castable(chosenSpell);
        if (viable == true) {
            try {
                int playerTone = Integer.parseInt(getInput(tonePrompt));
                int playerAction = Integer.parseInt(getInput(actionPrompt));
                int spellEffect = MagicMakingControl.castSpell(playerAction, playerTone, chosenSpell);

                System.out.println("You cast " + chosenSpell.getName() + " and it does "
                        + spellEffect + " damage to your surroundings.");
            } catch (MagicControlException mce) {
                System.out.println(mce.getMessage());
            } catch (NumberFormatException nf) {
                System.out.println("****ERROR: You must enter a number.");
            }
        }
        return;
    }

    private void castInvisibility() {
        Spell[] spells = GameControl.getSortedSpellList();
        Spell chosenSpell = spells[Spells.invisibility.ordinal()];
        boolean viable = MagicMakingControl.castable(chosenSpell);
        if (viable == true) {
            try {
                int playerTone = Integer.parseInt(getInput(tonePrompt));
                int playerAction = Integer.parseInt(getInput(actionPrompt));
                int spellEffect = MagicMakingControl.castSpell(playerAction, playerTone, chosenSpell);

                System.out.println("You cast " + chosenSpell.getName() + " and it does "
                        + spellEffect + " damage to your surroundings.");
            } catch (MagicControlException mce) {
                System.out.println(mce.getMessage());
            } catch (NumberFormatException nf) {
                System.out.println("****ERROR: You must enter a number.");
            }
        }
        return;
    }

}
