/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.Objects;

/**
 *
 * @author Maxime BLAISE
 */
public class Abonne {

    private int idAbonne;
    
    private String loginAbonne;

    private String mdpAbonne;

    public Abonne() {
        idAbonne = -1;
        loginAbonne = "";
        mdpAbonne = "";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.idAbonne;
        hash = 17 * hash + Objects.hashCode(this.loginAbonne);
        hash = 17 * hash + Objects.hashCode(this.mdpAbonne);
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
        final Abonne other = (Abonne) obj;
        if (this.idAbonne != other.idAbonne) {
            return false;
        }
        if (!Objects.equals(this.loginAbonne, other.loginAbonne)) {
            return false;
        }
        if (!Objects.equals(this.mdpAbonne, other.mdpAbonne)) {
            return false;
        }
        return true;
    }
    
    

    public int getIdAbonne() {
        return idAbonne;
    }

    public void setIdAbonne(int idAbonne) {
        this.idAbonne = idAbonne;
    }

    public String getLoginAbonne() {
        return loginAbonne;
    }

    public void setLoginAbonne(String loginAbonne) {
        this.loginAbonne = loginAbonne;
    }

    public String getMdpAbonne() {
        return mdpAbonne;
    }

    public void setMdpAbonne(String mdpAbonne) {
        this.mdpAbonne = mdpAbonne;
    }


}
