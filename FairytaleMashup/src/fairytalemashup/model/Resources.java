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
public class Resources extends Inventory implements Serializable{
    
    //class instance variables
    private String resourceType;
    private double amountAvailable;
    
    //default constructor function

    public Resources() {
    }
    
    //getter and setter functions

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public double getAmountAvailable() {
        return amountAvailable;
    }

    public void setAmountAvailable(double amountAvailable) {
        this.amountAvailable = amountAvailable;
    }
    //equals and hashCode functions

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.resourceType);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.amountAvailable) ^ (Double.doubleToLongBits(this.amountAvailable) >>> 32));
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
        final Resources other = (Resources) obj;
        if (Double.doubleToLongBits(this.amountAvailable) != Double.doubleToLongBits(other.amountAvailable)) {
            return false;
        }
        if (!Objects.equals(this.resourceType, other.resourceType)) {
            return false;
        }
        return true;
    }
    //toString

    @Override
    public String toString() {
        return "Resources{" + "inventoryType=" + inventoryType + ", amountAvailable=" + amountAvailable + ", amountRequired=" + amountRequired + ", usesAvailable=" + usesAvailable + ", timesUsed=" + timesUsed + ", renewalTimer=" + renewalTimer
                + ", resourceType=" + resourceType + ", amountAvailable=" + amountAvailable + '}';
    }
    
    
    
}
