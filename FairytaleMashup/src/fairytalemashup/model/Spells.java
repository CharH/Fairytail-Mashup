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
public class Spells extends Inventory implements Serializable{
    //class instance variables
    private String spellType;
    private double piecesCollected;
    private double piecesRequired;
    private double renewalTime;
    private double damages;

    public Spells() {
    }
    
    

    public String getSpellType() {
        return spellType;
    }

    public void setSpellType(String spellType) {
        this.spellType = spellType;
    }

    public double getPiecesCollected() {
        return piecesCollected;
    }

    public void setPiecesCollected(double piecesCollected) {
        this.piecesCollected = piecesCollected;
    }

    public double getPiecesRequired() {
        return piecesRequired;
    }

    public void setPiecesRequired(double piecesRequired) {
        this.piecesRequired = piecesRequired;
    }

    public double getRenewalTime() {
        return renewalTime;
    }

    public void setRenewalTime(double renewalTime) {
        this.renewalTime = renewalTime;
    }

    public double getDamages() {
        return damages;
    }

    public void setDamages(double damages) {
        this.damages = damages;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.spellType);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.piecesCollected) ^ (Double.doubleToLongBits(this.piecesCollected) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.piecesRequired) ^ (Double.doubleToLongBits(this.piecesRequired) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.renewalTime) ^ (Double.doubleToLongBits(this.renewalTime) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.damages) ^ (Double.doubleToLongBits(this.damages) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "SpellBook{" + "spellType=" + spellType + ", piecesCollected=" + piecesCollected + ", piecesRequired=" + piecesRequired + ", renewalTime=" + renewalTime + ", damages=" + damages + '}';
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
        final Spells other = (Spells) obj;
        if (Double.doubleToLongBits(this.piecesCollected) != Double.doubleToLongBits(other.piecesCollected)) {
            return false;
        }
        if (Double.doubleToLongBits(this.piecesRequired) != Double.doubleToLongBits(other.piecesRequired)) {
            return false;
        }
        if (Double.doubleToLongBits(this.renewalTime) != Double.doubleToLongBits(other.renewalTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.damages) != Double.doubleToLongBits(other.damages)) {
            return false;
        }
        if (!Objects.equals(this.spellType, other.spellType)) {
            return false;
        }
        return true;
    }
    
    
    
}
