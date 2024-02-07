/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Timestamp;

/**
 *
 * @author asus
 */
public class Transaksi {
    private String notaProduk;
    private Timestamp tanggal;
    private User idUser;
    private Member idMember;

    public String getNotaProduk() {
        return notaProduk;
    }

    public void setNotaProduk(String notaProduk) {
        this.notaProduk = notaProduk;
    }

    public Timestamp getTanggal() {
        return tanggal;
    }

    public void setTanggal(Timestamp tanggal) {
        this.tanggal = tanggal;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    public Member getIdMember() {
        return idMember;
    }

    public void setIdMember(Member idMember) {
        this.idMember = idMember;
    }
    
}
