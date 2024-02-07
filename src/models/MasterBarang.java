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
public class MasterBarang {
    private String kdJenis, jenisBarang, satuan;
    private Integer minStok, maxStok;

    public void setKdJenis(String kdJenis) {
        this.kdJenis = kdJenis;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public void setMinStok(Integer minStok) {
        this.minStok = minStok;
    }

    public void setMaxStok(Integer maxStok) {
        this.maxStok = maxStok;
    }

    public String getKdJenis() {
        return kdJenis;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public String getSatuan() {
        return satuan;
    }

    public Integer getMinStok() {
        return minStok;
    }

    public Integer getMaxStok() {
        return maxStok;
    }
    
}
