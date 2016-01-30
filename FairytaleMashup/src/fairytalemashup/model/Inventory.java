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
public class Inventory implements Serializable{
    
    //class instance variables
    private String inventoryType;
    private double amountAvailable;
    private double amountRequired;
    private double usesAvailable;
    private double timesUsed;
    private double renewalTimer;
    
    //default constructor function

    public Inventory() {
    }
    
    //getter and setter functions

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public double getAmountAvailable() {
        return amountAvailable;
    }

    public void setAmountAvailable(double amountAvailable) {
        this.amountAvailable = amountAvailable;
    }

    public double getAmountRequired() {
        return amountRequired;
    }

    public void setAmountRequired(double amountRequired) {
        this.amountRequired = amountRequired;
    }

    public double getUsesAvailable() {
        return usesAvailable;
    }

    public void setUsesAvailable(double usesAvailable) {
        this.usesAvailable = usesAvailable;
    }

    public double getTimesUsed() {
        return timesUsed;
    }

    public void setTimesUsed(double timesUsed) {
        this.timesUsed = timesUsed;
    }

    public double getRenewalTimer() {
        return renewalTimer;
    }

    public void setRenewalTimer(double renewalTimer) {
        this.renewalTimer = renewalTimer;
    }
    //equals and hashCode functions

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.inventoryType);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.amountAvailable) ^ (Double.doubleToLongBits(this.amountAvailable) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.amountRequired) ^ (Double.doubleToLongBits(this.amountRequired) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.usesAvailable) ^ (Double.doubleToLongBits(this.usesAvailable) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.timesUsed) ^ (Double.doubleToLongBits(this.timesUsed) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.renewalTimer) ^ (Double.doubleToLongBits(this.renewalTimer) >>> 32));
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
        final Inventory other = (Inventory) obj;
        if (Double.doubleToLongBits(this.amountAvailable) != Double.doubleToLongBits(other.amountAvailable)) {
            return false;
        }
        if (Double.doubleToLongBits(this.amountRequired) != Double.doubleToLongBits(other.amountRequired)) {
            return false;
        }
        if (Double.doubleToLongBits(this.usesAvailable) != Double.doubleToLongBits(other.usesAvailable)) {
            return false;
        }
        if (Double.doubleToLongBits(this.timesUsed) != Double.doubleToLongBits(other.timesUsed)) {
            return false;
        }
        if (Double.doubleToLongBits(this.renewalTimer) != Double.doubleToLongBits(other.renewalTimer)) {
            return false;
        }
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        return true;
    }
    //toString

    @Override
    public String toString() {
        return "Inventory{" + "inventoryType=" + inventoryType + ", amountAvailable=" + amountAvailable + ", amountRequired=" + amountRequired + ", usesAvailable=" + usesAvailable + ", timesUsed=" + timesUsed + ", renewalTimer=" + renewalTimer + '}';
    }
    
}
