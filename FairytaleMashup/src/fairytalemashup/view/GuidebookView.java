/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.view;

import fairytalemashup.control.GameControl;
import fairytalemashup.control.GameControl.Fairytales;
import fairytalemashup.model.Guidebook;

/**
 *
 * @author KatieSimons
 */
public class GuidebookView extends View {

    public GuidebookView() {
        super("\n"
                + "\n------------------------------------------"
                + "\n| Guidebook Menu                              |"
                + "\n------------------------------------------"
                + "\nF - Fairy Tale Descriptions"
                + "\nC - Completed Challenges"
                + "\nO - Open Challenges"
                + "\nM - Map"
                + "\nE - Exit Menu"
                + "\n------------------------------------------");
    }
    
    @Override
    public void doAction(char selection) {
        switch (selection) {
            case 'F': //view Fairy Tale Descriptions
                this.displayFairyTaleDescriptions();
                break;
            case 'C': //view Complted Challenges
                this.displayCompletedChallenges();
                break;
            case 'O': //view open challenges
                this.displayOpenChallenges();
                break;
            case 'M': //view map
                this.viewMap();
                break;
            case 'E': //exit the menu
                return;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break;
        }
    }

    private  void displayFairyTaleDescriptions() {
        Guidebook[] guidebook = GameControl.getSortedGuidebookList();
        //create header
        this.console.println("\nFairytale Descriptions");
        this.console.println("Title" + "\t" + "\t"  
                + "Description");
        //display item info
        for (Guidebook Guidebook : guidebook) {
            this.console.println(Guidebook.getFairytaleTitle() + "/t " + "\t" 
                    + Guidebook.getFairytaleDescription());       
        }
    }
    
   

    private void displayCompletedChallenges() {
        this.console.println("\n***display Completed Challenges stub function called.***");
    }

    private void displayOpenChallenges() {
        this.console.println("\n***display Open Challenges stub function called.***");
    }

    private void viewMap() {
        //create MapView object
        MapView mapView = new MapView();
        //display map view
        mapView.display();
    }
}
