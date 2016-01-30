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
public class ResourceGathering extends Location implements Serializable {
    
    //class instance variables
    private String resourceType;
    private double resourceAmount;
    private double renewalTimer;
    
    //default constructor function

    public ResourceGathering() {
    }
    
    //getter and setter functions

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public double getResourceAmount() {
        return resourceAmount;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.resourceType);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.resourceAmount) ^ (Double.doubleToLongBits(this.resourceAmount) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.renewalTimer) ^ (Double.doubleToLongBits(this.renewalTimer) >>> 32));
        return hash;
    }

    //equals and hashCode functions
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
        final ResourceGathering other = (ResourceGathering) obj;
        if (Double.doubleToLongBits(this.resourceAmount) != Double.doubleToLongBits(other.resourceAmount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.renewalTimer) != Double.doubleToLongBits(other.renewalTimer)) {
            return false;
        }
        if (!Objects.equals(this.resourceType, other.resourceType)) {
            return false;
        }
        return true;
    }

    public void setResourceAmount(double resourceAmount) {
        this.resourceAmount = resourceAmount;
    }

    public double getRenewalTimer() {
        return renewalTimer;
    }

    public void setRenewalTimer(double renewalTimer) {
        this.renewalTimer = renewalTimer;
    }
    
    //toString function

    @Override
    public String toString() {
        return "ResourceGathering{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", locationName=" + locationName + ", locationDescription=" + locationDescription + ", resourceType=" + resourceType + ", resourceAmount=" + resourceAmount + ", renewalTimer=" + renewalTimer + '}';
    }
    
    
}
