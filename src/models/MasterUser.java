/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author asus
 */
public class MasterUser {
    private String kdUser, jenisUser;

    public void setKdUser(String kdUser) {
        this.kdUser = kdUser;
    }

    public void setJenisUser(String jenisUser) {
        this.jenisUser = jenisUser;
    }

    public String getKdUser() {
        return kdUser;
    }

    public String getJenisUser() {
        return jenisUser;
    }

    public void add(MasterUser mu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
