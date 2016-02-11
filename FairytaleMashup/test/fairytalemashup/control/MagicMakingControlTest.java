/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.control;

import fairytalemashup.model.Spells;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author KatieSimons
 */
public class MagicMakingControlTest {
    
    public MagicMakingControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of castSpell method, of class MagicMakingControl.
     */
    @Test
    public void testCastSpell() {
        System.out.println("castSpell");
        double action = 2;
        double tone = 3;
        Spells testSpell = new Spells();
        testSpell.setDamages(25);
        MagicMakingControl instance = new MagicMakingControl();
        double expResult = 31;
        double result = instance.castSpell(action, tone, testSpell);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
