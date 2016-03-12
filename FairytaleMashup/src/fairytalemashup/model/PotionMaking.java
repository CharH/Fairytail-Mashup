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
public class PotionMaking extends Location implements Serializable {

    //class instance variables
    private String recipes;
    private String ingredients;
    private double setTimer;
    //cardinality things
    private Location[][] locations;

    //default constructor function
    public PotionMaking() {
    }

    //getter and setter functions
    public String getRecipes() {
        return recipes;
    }

    public void setRecipes(String recipes) {
        this.recipes = recipes;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public double getSetTimer() {
        return setTimer;
    }

    public void setSetTimer(double setTimer) {
        this.setTimer = setTimer;
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
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.recipes);
        hash = 79 * hash + Objects.hashCode(this.ingredients);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.setTimer) ^ (Double.doubleToLongBits(this.setTimer) >>> 32));
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
        final PotionMaking other = (PotionMaking) obj;
        if (Double.doubleToLongBits(this.setTimer) != Double.doubleToLongBits(other.setTimer)) {
            return false;
        }
        if (!Objects.equals(this.recipes, other.recipes)) {
            return false;
        }
        if (!Objects.equals(this.ingredients, other.ingredients)) {
            return false;
        }
        return true;
    }
    //toString function

    @Override
    public String toString() {
        return "PotionMaking{" + "recipes=" + recipes + ", ingredients=" + ingredients + ", setTimer=" + setTimer + ", locations=" + locations + '}';
    }

}
