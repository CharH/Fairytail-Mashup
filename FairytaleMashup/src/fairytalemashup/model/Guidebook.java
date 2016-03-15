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
public class Guidebook implements Serializable {

    //class instance variables
    private String fairytaleTitle;
    private String fairytaleDescription;
    private double challengesCompleted;
    private String challengesAvailable;

    //cardinality things
    private Map map;
    private Game game;
    public boolean[] guidebook;

    //default constructor function
    public Guidebook() {
    }

    //getter and setter functions for instance variables
    public String getFairytaleTitle() {
        return fairytaleTitle;
    }
    
    public void setFairytaleTitle(String fairytaleTitle) {
        this.fairytaleTitle = fairytaleTitle;
    }

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

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.fairytaleTitle);
        hash = 37 * hash + Objects.hashCode(this.fairytaleDescription);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.challengesCompleted) ^ (Double.doubleToLongBits(this.challengesCompleted) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.challengesAvailable);
        hash = 37 * hash + Objects.hashCode(this.map);
        hash = 37 * hash + Objects.hashCode(this.game);
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
        if (!Objects.equals(this.fairytaleTitle, other.fairytaleTitle)) {
            return false;
        }
        if (!Objects.equals(this.fairytaleDescription, other.fairytaleDescription)) {
            return false;
        }
        if (!Objects.equals(this.challengesAvailable, other.challengesAvailable)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Objects.equals(this.game, other.game)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Guidebook{" + "fairytaleTitle=" + fairytaleTitle + ", fairytaleDescription=" + fairytaleDescription + ", challengesCompleted=" + challengesCompleted + ", challengesAvailable=" + challengesAvailable + ", map=" + map + ", game=" + game + '}';
    }

}
