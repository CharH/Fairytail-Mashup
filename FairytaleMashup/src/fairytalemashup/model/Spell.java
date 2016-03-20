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
public class Spell extends InventoryItem implements Serializable {

    //class instance variables
    private String spellType;
    private int piecesCollected;
    private int piecesRequired;
    private int renewalTime;
    private int damages;
    private String name;

    public Spell() {
    }

    public String getSpellType() {
        return spellType;
    }

    public void setSpellType(String spellType) {
        this.spellType = spellType;
    }

    public int getPiecesCollected() {
        return piecesCollected;
    }

    public void setPiecesCollected(int piecesCollected) {
        this.piecesCollected = piecesCollected;
    }

    public int getPiecesRequired() {
        return piecesRequired;
    }

    public void setPiecesRequired(int piecesRequired) {
        this.piecesRequired = piecesRequired;
    }

    public int getRenewalTime() {
        return renewalTime;
    }

    public void setRenewalTime(int renewalTime) {
        this.renewalTime = renewalTime;
    }

    public int getDamages() {
        return damages;
    }

    public void setDamages(int damages) {
        this.damages = damages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.spellType);
        hash = 61 * hash + this.piecesCollected;
        hash = 61 * hash + this.piecesRequired;
        hash = 61 * hash + this.renewalTime;
        hash = 61 * hash + this.damages;
        hash = 61 * hash + Objects.hashCode(this.name);
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
        final Spell other = (Spell) obj;
        if (this.piecesCollected != other.piecesCollected) {
            return false;
        }
        if (this.piecesRequired != other.piecesRequired) {
            return false;
        }
        if (this.renewalTime != other.renewalTime) {
            return false;
        }
        if (this.damages != other.damages) {
            return false;
        }
        if (!Objects.equals(this.spellType, other.spellType)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Spell{" + "spellType=" + spellType + ", piecesCollected=" + piecesCollected + ", piecesRequired=" + piecesRequired + ", renewalTime=" + renewalTime + ", damages=" + damages + ", name=" + name + '}';
    }

}
