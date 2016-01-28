/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup;

import fairytalemashup.model.Guidebook;

/**
 *
 * @author charlottehuyett
 */
public class FairytaleMashup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // testing things
        Guidebook guidebookThing = new Guidebook();
        
        guidebookThing.setFairytaleDescription("Girl gets new shoes and marries a Prince.");
        guidebookThing.setItemsAvailable(7.5);
        guidebookThing.setChallengesAvailable("Fight a giant");
        guidebookThing.setChallengeScore(0.86);
        guidebookThing.setChallengesCompleted(2);
        guidebookThing.setLocationDescription("Pretty forest");
        
        String guidebookInfo = guidebookThing.toString();
        System.out.println(guidebookInfo);
    }
    
}
