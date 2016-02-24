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
public class Weapons extends Inventory implements Serializable {

    //class instance variables
    private String weaponType;
    private double damageInflicted;
    private String armour;
    private double protection;
    private String weaponArmed;

    public Weapons() {
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public double getDamageInflicted() {
        return damageInflicted;
    }

    public void setDamageInflicted(double damageInflicted) {
        this.damageInflicted = damageInflicted;
    }

    public String getArmour() {
        return armour;
    }

    public void setArmour(String armour) {
        this.armour = armour;
    }

    public double getProtection() {
        return protection;
    }

    public void setProtection(double protection) {
        this.protection = protection;
    }

    public String getWeaponArmed() {
        return weaponArmed;
    }

    public void setWeaponArmed(String weaponArmed) {
        this.weaponArmed = weaponArmed;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.weaponType);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.damageInflicted) ^ (Double.doubleToLongBits(this.damageInflicted) >>> 32));
        hash = 79 * hash + Objects.hashCode(this.armour);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.protection) ^ (Double.doubleToLongBits(this.protection) >>> 32));
        hash = 79 * hash + Objects.hashCode(this.weaponArmed);
        return hash;
    }

    @Override
    public String toString() {
        return "Weapons{" + "weaponType=" + weaponType + ", damageInflicted=" + damageInflicted + ", armour=" + armour + ", protection=" + protection + ", weaponArmed=" + weaponArmed + '}';
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
        final Weapons other = (Weapons) obj;
        if (Double.doubleToLongBits(this.damageInflicted) != Double.doubleToLongBits(other.damageInflicted)) {
            return false;
        }
        if (Double.doubleToLongBits(this.protection) != Double.doubleToLongBits(other.protection)) {
            return false;
        }
        if (!Objects.equals(this.weaponType, other.weaponType)) {
            return false;
        }
        if (!Objects.equals(this.armour, other.armour)) {
            return false;
        }
        if (!Objects.equals(this.weaponArmed, other.weaponArmed)) {
            return false;
        }
        return true;
    }

}
