/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author charlottehuyett
 */
public class Guidebook implements Serializable{
    
    //class instance variables
    private String fairytaleDescription;
    private double challengesCompleted;
    private String challengesAvailable;
    private double challengeScore;
    private String locationDescription;
    private double itemsAvailable;
    
    //default constructor function
    public Guidebook() {
    }
    
    //getter and setter functions for instance variables
    public String getFairytaleDescription() {
        return fairytaleDescription;
    }

    public void setFairytaleDescription(String fairytaleDescription) {
        this.fairytaleDescription = fairytaleDescription;
    }

    public double getChallengesCompleted() {
        return challengesCompleted;
    }

    public void setChallengesCompleted(double challengesCompleted) {
        this.challengesCompleted = challengesCompleted;
    }

    public String getChallengesAvailable() {
        return challengesAvailable;
    }

    public void setChallengesAvailable(String challengesAvailable) {
        this.challengesAvailable = challengesAvailable;
    }

    public double getChallengeScore() {
        return challengeScore;
    }

    public void setChallengeScore(double challengeScore) {
        this.challengeScore = challengeScore;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public double getItemsAvailable() {
        return itemsAvailable;
    }

    public void setItemsAvailable(double itemsAvailable) {
        this.itemsAvailable = itemsAvailable;
    }
    
    //equals() and hashCode() functions
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.fairytaleDescription);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.challengesCompleted) ^ (Double.doubleToLongBits(this.challengesCompleted) >>> 32));
        hash = 23 * hash + Objects.hashCode(this.challengesAvailable);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.challengeScore) ^ (Double.doubleToLongBits(this.challengeScore) >>> 32));
        hash = 23 * hash + Objects.hashCode(this.locationDescription);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.itemsAvailable) ^ (Double.doubleToLongBits(this.itemsAvailable) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Guidebook other = (Guidebook) obj;
        if (Double.doubleToLongBits(this.challengesCompleted) != Double.doubleToLongBits(other.challengesCompleted)) {
            return false;
        }
        if (Double.doubleToLongBits(this.challengeScore) != Double.doubleToLongBits(other.challengeScore)) {
            return false;
        }
        if (Double.doubleToLongBits(this.itemsAvailable) != Double.doubleToLongBits(other.itemsAvailable)) {
            return false;
        }
        if (!Objects.equals(this.fairytaleDescription, other.fairytaleDescription)) {
            return false;
        }
        if (!Objects.equals(this.challengesAvailable, other.challengesAvailable)) {
            return false;
        }
        if (!Objects.equals(this.locationDescription, other.locationDescription)) {
            return false;
        }
        return true;
    }
    
    //toString() function

    @Override
    public String toString() {
        return "Guidebook{" + "fairytaleDescription=" + fairytaleDescription + ", challengesCompleted=" + challengesCompleted + ", challengesAvailable=" + challengesAvailable + ", challengeScore=" + challengeScore + ", locationDescription=" + locationDescription + ", itemsAvailable=" + itemsAvailable + '}';
    }
    
    
    
}
