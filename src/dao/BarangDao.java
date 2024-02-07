/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.Barang;
import models.MasterBarang;

/**
 *
 * @author asus
 */
public class BarangDao {
    private Connection connection;
    private PreparedStatement saveStatement, updateStatement, deleteStatement; 
    private PreparedStatement getAllStatement, getByIdStatement, getByCodeStatement; 
    
    private final String saveQuery = "INSERT INTO tb_barang VALUES(?,?,?,?,?)";
    private final String updateQuery = "UPDATE tb_barang SET nama_barang=?, harga=?, stok=?, kd_jenis=? WHERE kd_barang = ?";
    private final String deleteQuery = "DELETE FROM tb_barang WHERE kd_barang = ?";
    private final String getAllQuery = "SELECT * FROM tb_barang";
    private final String getByIdQuery = "SELECT * FROM tb_barang WHERE kd_barang LIKE ? OR nama_barang LIKE ?";
    private final String getByCodeQuery = "SELECT * FROM tb_barang WHERE kd_barang = ?";

    public void setConnection(Connection connection) throws SQLException{
        this.connection = connection;
        saveStatement = this.connection.prepareStatement(saveQuery);
        updateStatement = this.connection.prepareStatement(updateQuery);
        deleteStatement = this.connection.prepareStatement(deleteQuery);
        getAllStatement = this.connection.prepareStatement(getAllQuery);
        getByIdStatement = this.connection.prepareStatement(getByIdQuery);
        getByCodeStatement = this.connection.prepareStatement(getByCodeQuery);
    }
    
    public Barang save(Barang barang) throws SQLException{
        saveStatement.setString(1, barang.getKdBarang());
        saveStatement.setString(2, barang.getNamaBarang());
        saveStatement.setInt(3, barang.getHarga());
        saveStatement.setInt(4, barang.getStok());
        saveStatement.setObject(5, barang.getKdJenis().getKdJenis());
        saveStatement.executeUpdate();
        return barang;
    }
    
    public Barang update(Barang barang) throws SQLException{
        updateStatement.setString(1, barang.getNamaBarang());
        updateStatement.setInt(2, barang.getHarga());
        updateStatement.setInt(3, barang.getStok());
        updateStatement.setString(4, barang.getKdJenis().getKdJenis());
        updateStatement.setString(5, barang.getKdBarang());
        updateStatement.executeUpdate();
        return barang;
    }
    
    public void delete(String kodeProduk) throws SQLException{
        deleteStatement.setString(1, kodeProduk);
        deleteStatement.executeUpdate();
    }
    
    public List<Barang> getAll() throws SQLException {
        List<Barang> barang = new ArrayList<>();
        ResultSet rs = getAllStatement.executeQuery();
        while(rs.next()){
            Barang b = new Barang();
            b.setKdBarang(rs.getString("kd_barang"));
            b.setNamaBarang(rs.getString("nama_barang"));
            b.setHarga(rs.getInt("harga"));
            b.setStok(rs.getInt("stok"));

            MasterBarangDao mbd = new MasterBarangDao();
            mbd.setConnection(connection);
            MasterBarang mb = mbd.getByKd(rs.getString("kd_jenis"));
            b.setKdJenis(mb);
            
            barang.add(b);
        }
        return barang;
    }
    
    public List<Barang> getByIdOrName(String idOrName) throws SQLException {
        List<Barang> br = new ArrayList<>();
        getByIdStatement.setString(1, "%"+idOrName+"%");
        getByIdStatement.setString(2, "%"+idOrName+"%");
        ResultSet rs = getByIdStatement.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString("kd_barang"));
            Barang b = new Barang();
            b.setKdBarang(rs.getString("kd_barang"));
            b.setNamaBarang(rs.getString("nama_barang"));
            b.setHarga(rs.getInt("harga"));
            b.setStok(rs.getInt("stok"));
            
            MasterBarangDao mbd = new MasterBarangDao();
            mbd.setConnection(connection);
            MasterBarang mb = mbd.getByKd(rs.getString("kd_jenis"));
            b.setKdJenis(mb);
            
            br.add(b);
        }
        return br;
    }
    
    public Barang getByCode(String code) throws SQLException {
        Barang b = new Barang();
        getByCodeStatement.setString(1, code);
        ResultSet rs = getByCodeStatement.executeQuery();
        if(rs.next()){
            b.setKdBarang(rs.getString("kd_barang"));
            b.setNamaBarang(rs.getString("nama_barang"));
            b.setHarga(rs.getInt("harga"));
            b.setStok(rs.getInt("stok"));
            
            MasterBarangDao mbd = new MasterBarangDao();
            mbd.setConnection(connection);
            MasterBarang mb = mbd.getByKd(rs.getString("kd_jenis"));
            b.setKdJenis(mb);
        }
        return b;
    }
    
}
