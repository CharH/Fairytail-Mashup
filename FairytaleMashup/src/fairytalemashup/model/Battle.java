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
public class Battle extends Location implements Serializable {

    //class instance variables
    private String enemyDescription;
    private double enemyStats;
    private String userWeapons;
    private double userStats;
    //cardinality things
    private Location[][] locations;

    //default constructor function
    public Battle() {
    }

    //getter and setter functions
    public String getEnemyDescription() {
        return enemyDescription;
    }

    public void setEnemyDescription(String enemyDescription) {
        this.enemyDescription = enemyDescription;
    }

    public double getEnemyStats() {
        return enemyStats;
    }

    public void setEnemyStats(double enemyStats) {
        this.enemyStats = enemyStats;
    }

    public String getUserWeapons() {
        return userWeapons;
    }

    public void setUserWeapons(String userWeapons) {
        this.userWeapons = userWeapons;
    }

    public double getUserStats() {
        return userStats;
    }

    public void setUserStats(double userStats) {
        this.userStats = userStats;
    }

    public Location[][] getLocation() {
        return locations;
    }

    public void setLocation(Location[][] location) {
        this.locations = location;
    }

    //equals and hashCode functions
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.enemyDescription);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.enemyStats) ^ (Double.doubleToLongBits(this.enemyStats) >>> 32));
        hash = 83 * hash + Objects.hashCode(this.userWeapons);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.userStats) ^ (Double.doubleToLongBits(this.userStats) >>> 32));
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
        final Battle other = (Battle) obj;
        if (Double.doubleToLongBits(this.enemyStats) != Double.doubleToLongBits(other.enemyStats)) {
            return false;
        }
        if (Double.doubleToLongBits(this.userStats) != Double.doubleToLongBits(other.userStats)) {
            return false;
        }
        if (!Objects.equals(this.enemyDescription, other.enemyDescription)) {
            return false;
        }
        if (!Objects.equals(this.userWeapons, other.userWeapons)) {
            return false;
        }
        return true;
    }
    //toString function

    @Override
    public String toString() {
        return "Battle{" + "enemyDescription=" + enemyDescription + ", enemyStats=" + enemyStats + ", userWeapons=" + userWeapons + ", userStats=" + userStats + ", locations=" + locations + '}';
    }

}
