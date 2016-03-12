/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.control;

import fairytalemashup.model.Spell;

/**
 *
 * @author KatieSimons
 */
public class MagicMakingControl {

    public static String buildSpellbook() {
        return "Useable spells and spells in progress display here. Type in 'E' to Exit this menu, or any other character to continue.";
    }

    public static void castSpell(char selection) {
        System.out.println("Spell " + selection + " has been cast.");
    }

    public static char useableSpells(char selection) {
        //probably use this as part of the build spellbook bit as well.
        //build spellbook displays the info, but this is the section that checks for validity.
        //Has the user found the spell? Does the user have all pieces of the spell? etc
        return selection;
    }

    public double castSpell(double action, double tone, Spell spells) {
        if (action < 1 || tone < 1) {
            return -1;
        }

        if (action > 3 || tone > 3) {
            return -1;
        }

        if (spells.getDamages() <= 0) {
            return -1;
        }

        double spellEffect = action * tone + spells.getDamages();
        return spellEffect;
    }

}
