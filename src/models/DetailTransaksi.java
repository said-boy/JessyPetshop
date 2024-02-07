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
public class DetailTransaksi {
    private Transaksi notaProduk;
    private Barang kdBarang;
    private Integer jumlahBeli, subTotal, diskon;

    public Integer getDiskon() {
        return diskon;
    }

    public void setDiskon(Integer diskon) {
        this.diskon = diskon;
    }

    public Transaksi getNotaProduk() {
        return notaProduk;
    }

    public void setNotaProduk(Transaksi notaProduk) {
        this.notaProduk = notaProduk;
    }

    public Barang getKdBarang() {
        return kdBarang;
    }

    public void setKdBarang(Barang kdBarang) {
        this.kdBarang = kdBarang;
    }

    public Integer getJumlahBeli() {
        return jumlahBeli;
    }

    public void setJumlahBeli(Integer jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    public Integer getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Integer subTotal) {
        this.subTotal = subTotal;
    }
    
}
