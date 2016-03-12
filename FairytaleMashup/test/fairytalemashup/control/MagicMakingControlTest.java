/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.control;

import fairytalemashup.model.Spell;
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
     * Test case #1
     */
    @Test
    public void testCastSpell() {
        System.out.println("Test case #1");
        double action = 2;
        double tone = 3;
        Spell testSpell = new Spell(); //create new spells object instance
        testSpell.setDamages(25); //set spell damage attribute
        MagicMakingControl instance = new MagicMakingControl();
        double expResult = 31;
        double result = instance.castSpell(action, tone, testSpell);
        assertEquals(expResult, result, 0.0);
    /**
     * Test case #2
     */
        System.out.println("Test case #2");
        action = 0;
        tone = 2;
        testSpell.setDamages(15); //set spell damage attribute
        expResult = -1;
        result = instance.castSpell(action, tone, testSpell);
        assertEquals(expResult, result, 0.0);
    /**
     * Test case #3
     */
        System.out.println("Test case #3");
        action = 3;
        tone = 6;
        testSpell.setDamages(50); //set spell damage attribute
        expResult = -1;
        result = instance.castSpell(action, tone, testSpell);
        assertEquals(expResult, result, 0.0);
        /**
     * Test case #4
     */
        System.out.println("Test case #4");
        action = 2;
        tone = 3;
        testSpell.setDamages(-3); //set spell damage attribute
        expResult = -1;
        result = instance.castSpell(action, tone, testSpell);
        assertEquals(expResult, result, 0.0);
        /**
     * Test case #5
     */
        System.out.println("Test case #5");
        action = 1;
        tone = 3;
        testSpell.setDamages(5); //set spell damage attribute
        expResult = 8;
        result = instance.castSpell(action, tone, testSpell);
        assertEquals(expResult, result, 0.0);
        /**
     * Test case #6
     */
        System.out.println("Test case #6");
        action = 2;
        tone = 2;
        testSpell.setDamages(10); //set spell damage attribute
        expResult = 14;
        result = instance.castSpell(action, tone, testSpell);
        assertEquals(expResult, result, 0.0);
        /**
     * Test case #7
     */
        System.out.println("Test case #7");
        action = 3;
        tone = 1;
        testSpell.setDamages(16); //set spell damage attribute
        expResult = 19;
        result = instance.castSpell(action, tone, testSpell);
        assertEquals(expResult, result, 0.0);
    }
    
}
