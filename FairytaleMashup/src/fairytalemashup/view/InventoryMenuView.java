/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.view;

import fairytalemashup.FairytaleMashup;
import fairytalemashup.control.GameControl;
import fairytalemashup.model.Game;
import fairytalemashup.model.InventoryItem;
import java.util.Scanner;

/**
 *
 * @author KatieSimons
 */
public class InventoryMenuView extends View {

    public InventoryMenuView() {
        super("\n"
                + "\n------------------------------------------"
                + "\n| Inventory Menu                         |"
                + "\n------------------------------------------"
                + "\nP - Potions Pack"
                + "\nS - Spellbook"
                + "\nR - Resources"
                + "\nW - Weapons"
                + "\nE - Exit Menu"
                + "\n------------------------------------------");
    }

    @Override
    public void doAction(char selection) {
        switch (selection) {
            case 'P': //view potions pack
                this.displayPotionsPack();
                break;
            case 'S': //view spellbook
                this.displaySpells();
                break;
            case 'R': //display resources
                this.displayResources();
                break;
            case 'W': //view weapons
                this.displayWeapons();
                break;
            case 'E': //exit the menu
                return;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break;
        }
    }

    private void displayPotionsPack() {
        this.console.println("\n***display PotionsPack stub function called.***");
    }

    private void displaySpells() {
        SpellbookView spellbookView = new SpellbookView();
        spellbookView.display();
    }

    private void displayResources() {
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        //create header
        this.console.println("\nList of Inventory Items");
        this.console.println("Description" + "\t"
                + "Quantity" + "\t"
                + "ReUsable");
        //display item info
        for (InventoryItem inventoryItem : inventory) {
            this.console.println(inventoryItem.getDescription() + "\t        "
                    + inventoryItem.getAmountAvailable() + "\t        "
                    + inventoryItem.isMultiUse());
        }
    }

    private void displayWeapons() {
        //create WeaponsView object
        WeaponsView weaponsView = new WeaponsView();

        //display the weapons view
        weaponsView.displayWeaponsView();
        
    }
}
