/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.control;

import fairytalemashup.model.Player;

/**
 *
 * @author KatieSimons
 */
public class BattleControl {
    public int calcPlayerAttackDamage(int playerAttack, Player player){
        if (playerAttack < 0 || playerAttack > 100){
            return -1;
        }
        if (player.getPlayerHealth() <= 0 || player.getPlayerHealth() > 100){
            return -1;
        }
        
        //Player health is an integer, so need change the data type to double in order to pass into Math.ceil()
        double playerHealth = player.getPlayerHealth();
        
        //baseUserAttack = ROUNDUP (currentUserHealth/10)
        int basePlayerAttack = (int)Math.ceil(playerHealth/10);
        
        //playerAttackDamage = ROUNDUP (baseUserAttack + playerAttack * (currentUserHealth/baseUserHealth))
        //default(weaponless) attack value is added to the attack value of the weaponized attack (which is first modified by the players current state of health).
        int playerAttackDamage = (int)Math.ceil(basePlayerAttack + playerAttack*(playerHealth/player.getPlayerBaseHealth()));
        
        return playerAttackDamage;
             
    }
	
    public int calcBattleResult (int playerAttack, int playerDefense, int enemyAttack){
        if (playerAttack < 0){
            return 000;
        }
        if (playerDefense < 0 || playerDefense > 5){
            return 000;
        }
        if (enemyAttack < 0){
            return 000;
        }
        
        int battleResult = (playerAttack * playerDefense)- enemyAttack;
        
        return battleResult;
    }
}
