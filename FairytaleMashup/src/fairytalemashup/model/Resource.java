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
public class Resource extends InventoryItem implements Serializable {

    //class instance objects
    private String resourceType;
    private double availableAmount;

    public Resource() {
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public double getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(double availableAmount) {
        this.availableAmount = availableAmount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.resourceType);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.availableAmount) ^ (Double.doubleToLongBits(this.availableAmount) >>> 32));
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
        final Resource other = (Resource) obj;
        if (Double.doubleToLongBits(this.availableAmount) != Double.doubleToLongBits(other.availableAmount)) {
            return false;
        }
        if (!Objects.equals(this.resourceType, other.resourceType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Resource{" + "resourceType=" + resourceType + ", availableAmount=" + availableAmount + '}';
    }

}
