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
public class Quest extends Location implements Serializable {

    //class instance variables
    private String questDescription;
    private String questStatus;

    //default constructor function
    public Quest() {
    }

    //getter and setter functions
    public String getQuestDescription() {
        return questDescription;
    }

    public void setQuestDescription(String questDescription) {
        this.questDescription = questDescription;
    }

    public String getQuestStatus() {
        return questStatus;
    }

    public void setQuestStatus(String questStatus) {
        this.questStatus = questStatus;
    }

    //equals and hashCode functions
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.questDescription);
        hash = 89 * hash + Objects.hashCode(this.questStatus);
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
        final Quest other = (Quest) obj;
        if (!Objects.equals(this.questDescription, other.questDescription)) {
            return false;
        }
        if (!Objects.equals(this.questStatus, other.questStatus)) {
            return false;
        }
        return true;
    }
    //toString function

    @Override
    public String toString() {
        return "Quest{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", locationName=" + locationName + ", locationDescription=" + locationDescription
                + ", questDescription=" + questDescription + ", questStatus=" + questStatus + '}';
    }

}
