/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.view;

import fairytalemashup.control.MagicMakingControl;

/**
 *
 * @author charlottehuyett
 */
public class SpellbookView extends View {
   
    public SpellbookView() {
        super(MagicMakingControl.buildSpellbook());
    }
    
    @Override
    public void doAction(char selection) {
        //need this to be dynamic and adjust to available spells.
        if (selection == 'Q'){
            return;
        }else if (selection == MagicMakingControl.useableSpells(selection)){
            MagicMakingControl.castSpell(selection);
        } else {
                System.out.println("\n*** Invalid selection *** Try again");
        }
    }
}
