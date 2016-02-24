/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.control;

import fairytalemashup.model.Spells;

/**
 *
 * @author KatieSimons
 */
public class MagicMakingControl {

    public double castSpell(double action, double tone, Spells spells) {
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
