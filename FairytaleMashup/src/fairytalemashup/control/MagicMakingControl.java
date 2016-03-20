/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.control;

import fairytalemashup.control.GameControl.Spells;
import fairytalemashup.exceptions.MagicControlException;
import fairytalemashup.model.Spell;
import fairytalemashup.view.SpellbookView;
import fairytalemashup.view.View;

/**
 *
 * @author KatieSimons
 */
public class MagicMakingControl {

    public static boolean inputCheck(int input) throws MagicControlException {
        boolean check = true;
        if (input < 1 || input > 3) {
            check = false;
            throw new MagicControlException("****ERROR**** : You must enter a number between 1-3");

        }
        return check;
    }

    Spell[] spells = GameControl.getSortedSpellList();

    public static boolean castable(Spell spell) {
        //System.out.println("Spell " + spell + " has been cast.");
        boolean status = false;
        int x = spell.getPiecesCollected();
        int y = spell.getPiecesRequired();
        if (x == y) {
            status = true;
        } else {
            System.out.println("Oops, looks like you haven't found all the pieces for that one yet.");
        }

        return status;
    }

    public static int castSpell(int action, int tone, Spell spells) throws MagicControlException {
        if (action < 1 || tone < 1 || action > 3 || tone > 3) {
            throw new MagicControlException("****ERROR**** : You must enter a number between 1-3");
        }
        if (spells.getDamages() <= 0) {
            throw new MagicControlException("****ERROR**** : base spell damage must be greater than 0.");
        }

        int spellEffect = action * tone + spells.getDamages();
        return spellEffect;
    }

}
