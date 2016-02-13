/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.control;

import fairytalemashup.model.Player;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author charlottehuyett
 */
public class BattleControlTest {
    
    public BattleControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test #1
     */
    @Test
    public void testCalcPlayerAttackDamage() {
        System.out.println("Test case #1");
        int playerAttack = 25;
        Player testPlayer = new Player();
        testPlayer.setPlayerBaseHealth(100);
        testPlayer.setPlayerHealth(75);
        BattleControl instance = new BattleControl();
        int expResult = 27;
        int result = instance.calcPlayerAttackDamage(playerAttack, testPlayer);
        assertEquals(expResult, result);
        
        // Test #2
        System.out.println("Test case #2");
        playerAttack = -10;
        testPlayer.setPlayerBaseHealth(100);
        testPlayer.setPlayerHealth(50);
        expResult = -1;
        result = instance.calcPlayerAttackDamage(playerAttack, testPlayer);
        assertEquals(expResult, result);
        
        // Test #3
        System.out.println("Test case #3");
        playerAttack = 20;
        testPlayer.setPlayerBaseHealth(100);
        testPlayer.setPlayerHealth(-10);
        expResult = -1;
        result = instance.calcPlayerAttackDamage(playerAttack, testPlayer);
        assertEquals(expResult, result);
        
        // Test #4
        System.out.println("Test case #4");
        playerAttack = 25;
        testPlayer.setPlayerBaseHealth(100);
        testPlayer.setPlayerHealth(110);
        expResult = -1;
        result = instance.calcPlayerAttackDamage(playerAttack, testPlayer);
        assertEquals(expResult, result);
        
        // Test #5
        System.out.println("Test case #5");
        playerAttack = 0;
        testPlayer.setPlayerBaseHealth(100);
        testPlayer.setPlayerHealth(75);
        expResult = 8;
        result = instance.calcPlayerAttackDamage(playerAttack, testPlayer);
        assertEquals(expResult, result);
        
        // Test #6
        System.out.println("Test case #6");
        playerAttack = 10;
        testPlayer.setPlayerBaseHealth(100);
        testPlayer.setPlayerHealth(100);
        expResult = 20;
        result = instance.calcPlayerAttackDamage(playerAttack, testPlayer);
        assertEquals(expResult, result);
        
        // Test #7
        System.out.println("Test case #7");
        playerAttack = 100;
        testPlayer.setPlayerBaseHealth(100);
        testPlayer.setPlayerHealth(1);
        expResult = 2;
        result = instance.calcPlayerAttackDamage(playerAttack, testPlayer);
        assertEquals(expResult, result);
        
    }
    
}
