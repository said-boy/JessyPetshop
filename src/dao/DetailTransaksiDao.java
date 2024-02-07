/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import models.DetailTransaksi;

/**
 *
 * @author asus
 */
public class DetailTransaksiDao {
    
    private Connection connection;
    private PreparedStatement saveStatement; 
    
    private final String saveQuery = "INSERT INTO tb_detail_transaksi VALUES (?,?,?,?,?)";

    public void setConnection(Connection connection) throws SQLException{
        this.connection = connection;
        saveStatement = this.connection.prepareStatement(saveQuery);
    }
    
    public List<DetailTransaksi> save(List<DetailTransaksi> detailTransaksi) throws SQLException{
        for(DetailTransaksi dt : detailTransaksi){
            saveStatement.setString(1, dt.getNotaProduk().getNotaProduk());
            saveStatement.setString(2, dt.getKdBarang().getKdBarang());
            saveStatement.setInt(3, dt.getDiskon());
            saveStatement.setInt(4, dt.getJumlahBeli());
            saveStatement.setInt(5, dt.getSubTotal());
            saveStatement.executeUpdate();
        }
        return detailTransaksi;
    }
    
}
