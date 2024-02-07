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
import models.MasterBarang;

/**
 *
 * @author asus
 */
public class MasterBarangDao {
    private Connection connection;
    private PreparedStatement getAllMasterBarangStatement, getByKdStatement, getByNameStatement;
    
    private final String getAllMasterBarangQuery = "SELECT * FROM tb_master_barang";
    private final String getByKdQuery = "SELECT * FROM tb_master_barang WHERE kd_jenis = ?";
    private final String getByNameQuery = "SELECT * FROM tb_master_barang WHERE jenis_barang = ?";
    
    public void setConnection(Connection connection) throws SQLException {
        this.connection = connection;
        getAllMasterBarangStatement = this.connection.prepareStatement(getAllMasterBarangQuery);
        getByKdStatement = this.connection.prepareStatement(getByKdQuery);
        getByNameStatement = this.connection.prepareStatement(getByNameQuery);
    }
    
    public List<MasterBarang> getAll() throws SQLException {
        List<MasterBarang> masterBarang = new ArrayList<>();
        ResultSet rs = getAllMasterBarangStatement.executeQuery();
        while(rs.next()){
            MasterBarang mb = new MasterBarang();
            mb.setKdJenis(rs.getString("kd_jenis"));
            mb.setJenisBarang(rs.getString("jenis_barang"));
            mb.setSatuan(rs.getString("satuan"));
            mb.setMinStok(rs.getInt("min_stok"));
            mb.setMaxStok(rs.getInt("max_stok"));
            masterBarang.add(mb);
        }
        return masterBarang;
    }
    
    public Object[] getAllJenis() throws SQLException {
        ArrayList<Object> obj = new ArrayList<>();
        ResultSet rs = getAllMasterBarangStatement.executeQuery();
        while(rs.next()){
            obj.add(rs.getString("jenis_barang"));
        }
        return obj.toArray();
    }
    
    public MasterBarang getByKd(String masterBarang) throws SQLException {
        MasterBarang mb = new MasterBarang();
        getByKdStatement.setString(1, masterBarang);
        ResultSet rs = getByKdStatement.executeQuery();
        if(rs.next()){
            mb.setKdJenis(rs.getString("kd_jenis"));
            mb.setJenisBarang(rs.getString("jenis_barang"));
            mb.setSatuan(rs.getString("satuan"));
            mb.setMinStok(rs.getInt("min_stok"));
            mb.setMaxStok(rs.getInt("max_stok"));
        }
        return mb;
    }
    
    public MasterBarang getByName(String masterBarang) throws SQLException {
        MasterBarang mb = new MasterBarang();
        getByNameStatement.setString(1, masterBarang);
        ResultSet rs = getByNameStatement.executeQuery();
        if(rs.next()){
            mb.setKdJenis(rs.getString("kd_jenis"));
            mb.setJenisBarang(rs.getString("jenis_barang"));
            mb.setSatuan(rs.getString("satuan"));
            mb.setMinStok(rs.getInt("min_stok"));
            mb.setMaxStok(rs.getInt("max_stok"));
        }
        return mb;
    }
}
