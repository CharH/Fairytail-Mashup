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

    /**
     * Test of calcBattleResult method, of class BattleControl.
     */
    @Test
    public void testCalcBattleResult() {
        System.out.println("Test #1");
        int playerAttack = 50;
        int playerDefense = 2;
        int enemyAttack = 86;
        BattleControl instance = new BattleControl();
        int expResult = 14;
        int result = instance.calcBattleResult(playerAttack, playerDefense, enemyAttack);
        assertEquals(expResult, result);
        
        //test2
        System.out.println("Test #2");
        playerAttack = -1;
        playerDefense = 3;
        enemyAttack = 25;
        expResult = 000;
        result = instance.calcBattleResult(playerAttack, playerDefense, enemyAttack);
        assertEquals(expResult, result);
        
        //test3
        System.out.println("Test #3");
        playerAttack = 12;
        playerDefense = -1;
        enemyAttack = 45;
        expResult = 000;
        result = instance.calcBattleResult(playerAttack, playerDefense, enemyAttack);
        assertEquals(expResult, result);
        
        //test4
        System.out.println("Test #4");
        playerAttack = 45;
        playerDefense = 5;
        enemyAttack = -1;
        expResult = 000;
        result = instance.calcBattleResult(playerAttack, playerDefense, enemyAttack);
        assertEquals(expResult, result);
        
        //test5
        System.out.println("Test #5");
        playerAttack = 60;
        playerDefense = 2;
        enemyAttack = 150;
        expResult = -30;
        result = instance.calcBattleResult(playerAttack, playerDefense, enemyAttack);
        assertEquals(expResult, result);
        
        //test6
        System.out.println("Test #6");
        playerAttack = 45;
        playerDefense = 5;
        enemyAttack = 145;
        expResult = 80;
        result = instance.calcBattleResult(playerAttack, playerDefense, enemyAttack);
        assertEquals(expResult, result);
        
        //test 7
        System.out.println("Test #7");
        playerAttack = 100;
        playerDefense = 3;
        enemyAttack = 240;
        expResult = 60;
        result = instance.calcBattleResult(playerAttack, playerDefense, enemyAttack);
        assertEquals(expResult, result);
        
    }
    
}
