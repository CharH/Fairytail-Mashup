/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.view;

/**
 *
 * @author KatieSimons
 */
public class GuidebookView extends View {
        public GuidebookView(){
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
            case 'F': //view potions pack
                this.displayFairyTaleDescriptions();
                break;
            case 'C': //view spellbook
                this.displayCompletedChallenges();
                break;
            case 'O': //display resources
                this.displayOpenChallenges();
                break;
            case 'M': //view weapons
                this.viewMap();
                break;
            case 'E': //exit the menu
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    private void displayFairyTaleDescriptions() {
        System.out.println("\n***display FairyTale Descriptions stub function called.***");
    }

    private void displayCompletedChallenges() {
        System.out.println("\n***display Completed Challenges stub function called.***");
    }

    private void displayOpenChallenges() {
        System.out.println("\n***display Open Challenges stub function called.***");
    }

    private void viewMap() {
        //create MapView object
        MapView mapView = new MapView();
        //display map view
        mapView.display();
    }
}
