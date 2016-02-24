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
 * @author KatieSimons
 */
public class PotionsPack extends Inventory implements Serializable {

    //class instance variables
    private String potionType;
    private double potionAmount;
    private double availableUses;
    private double amountUsed;
    private double damages;
    private double renewalTime;

    public PotionsPack() {
    }

    public String getPotionType() {
        return potionType;
    }

    public void setPotionType(String potionType) {
        this.potionType = potionType;
    }

    public double getPotionAmount() {
        return potionAmount;
    }

    public void setPotionAmount(double potionAmount) {
        this.potionAmount = potionAmount;
    }

    public double getAvailableUses() {
        return availableUses;
    }

    public void setAvailableUses(double availableUses) {
        this.availableUses = availableUses;
    }

    public double getAmountUsed() {
        return amountUsed;
    }

    public void setAmountUsed(double amountUsed) {
        this.amountUsed = amountUsed;
    }

    public double getDamages() {
        return damages;
    }

    public void setDamages(double damages) {
        this.damages = damages;
    }

    public double getRenewalTime() {
        return renewalTime;
    }

    public void setRenewalTime(double renewalTime) {
        this.renewalTime = renewalTime;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.potionType);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.potionAmount) ^ (Double.doubleToLongBits(this.potionAmount) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.availableUses) ^ (Double.doubleToLongBits(this.availableUses) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.amountUsed) ^ (Double.doubleToLongBits(this.amountUsed) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.damages) ^ (Double.doubleToLongBits(this.damages) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.renewalTime) ^ (Double.doubleToLongBits(this.renewalTime) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "PotionsPack{" + "potionType=" + potionType + ", potionAmount=" + potionAmount + ", availableUses=" + availableUses + ", amountUsed=" + amountUsed + ", damages=" + damages + ", renewalTime=" + renewalTime + '}';
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
        final PotionsPack other = (PotionsPack) obj;
        if (Double.doubleToLongBits(this.potionAmount) != Double.doubleToLongBits(other.potionAmount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.availableUses) != Double.doubleToLongBits(other.availableUses)) {
            return false;
        }
        if (Double.doubleToLongBits(this.amountUsed) != Double.doubleToLongBits(other.amountUsed)) {
            return false;
        }
        if (Double.doubleToLongBits(this.damages) != Double.doubleToLongBits(other.damages)) {
            return false;
        }
        if (Double.doubleToLongBits(this.renewalTime) != Double.doubleToLongBits(other.renewalTime)) {
            return false;
        }
        if (!Objects.equals(this.potionType, other.potionType)) {
            return false;
        }
        return true;
    }

}
