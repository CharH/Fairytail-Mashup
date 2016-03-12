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
public class Spellcasting extends Location implements Serializable {

    //class instance variables
    private String spellBook;
    private String userVoice;
    private String userAction;

    //cardinality things
    private Location[][] locations;

    //default constructor function
    public Spellcasting() {
    }

    //getter and setter functions
    public String getSpellBook() {
        return spellBook;
    }

    public void setSpellBook(String spellBook) {
        this.spellBook = spellBook;
    }

    public String getUserVoice() {
        return userVoice;
    }

    public void setUserVoice(String userVoice) {
        this.userVoice = userVoice;
    }

    public String getUserAction() {
        return userAction;
    }

    public void setUserAction(String userAction) {
        this.userAction = userAction;
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
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.spellBook);
        hash = 79 * hash + Objects.hashCode(this.userVoice);
        hash = 79 * hash + Objects.hashCode(this.userAction);
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
        final Spellcasting other = (Spellcasting) obj;
        if (!Objects.equals(this.spellBook, other.spellBook)) {
            return false;
        }
        if (!Objects.equals(this.userVoice, other.userVoice)) {
            return false;
        }
        if (!Objects.equals(this.userAction, other.userAction)) {
            return false;
        }
        return true;
    }

    //toString()
    @Override
    public String toString() {
        return "Spellcasting{" + "spellBook=" + spellBook + ", userVoice=" + userVoice + ", userAction=" + userAction + ", locations=" + locations + '}';
    }

}
