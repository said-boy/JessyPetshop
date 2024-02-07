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
import models.Transaksi;
import models.Member;
import models.User;

/**
 *
 * @author asus
 */
public class TransaksiDao {
    private Connection connnection;
    private PreparedStatement saveStatement;
    private PreparedStatement getAllStatement, getByMonthStatement, getLastTransactionStatement;
    
    private final String saveQuery = "INSERT INTO tb_transaksi VALUES (?,?,?,?)";
    private final String getAllQuery = "SELECT * FROM tb_transaksi";
    private final String getByMonthQuery = "SELECT * FROM tb_transaksi WHERE month(tanggal) = month(?)";
    private final String getLastTransactionQuery = "SELECT * FROM tb_transaksi ORDER BY nota_produk DESC LIMIT 1";
    
    public void setConnection(Connection connection) throws SQLException{
        this.connnection = connection;
        saveStatement = this.connnection.prepareStatement(saveQuery);
        getAllStatement = this.connnection.prepareStatement(getAllQuery);
        getByMonthStatement = this.connnection.prepareStatement(getByMonthQuery);
        getLastTransactionStatement = this.connnection.prepareStatement(getLastTransactionQuery);
    }
        
    public Transaksi save(Transaksi transaksi) throws SQLException{
        saveStatement.setString(1, transaksi.getNotaProduk());
        saveStatement.setTimestamp(2, transaksi.getTanggal());
        saveStatement.setObject(3, transaksi.getIdUser().getIdUser());
        saveStatement.setObject(4, transaksi.getIdMember().getIdMember());
        saveStatement.executeUpdate();
        return transaksi;
    }
    
    public List<Transaksi> getAll() throws SQLException {
        List<Transaksi> transaksi = new ArrayList<>();
        ResultSet rs = getAllStatement.executeQuery();
        while(rs.next()){
            Transaksi t = new Transaksi();
            t.setNotaProduk(rs.getString("nota_produk"));
            t.setTanggal(rs.getTimestamp("tanggal"));
            t.setIdUser((User) rs.getObject("id_user"));
            t.setIdMember((Member) rs.getObject("id_member"));
            transaksi.add(t);
        }
        return transaksi;
    }

    public List<Transaksi> getByMonth(Transaksi transaksi) throws SQLException {
        List<Transaksi> tr = new ArrayList<>();
        getByMonthStatement.setTimestamp(1, transaksi.getTanggal());
        ResultSet rs = getByMonthStatement.executeQuery();
        while(rs.next()){
            Transaksi t = new Transaksi();
            t.setNotaProduk(rs.getString("nota_produk"));
            t.setTanggal(rs.getTimestamp("tanggal"));
            t.setIdUser((User) rs.getObject("id_user"));
            t.setIdMember((Member) rs.getObject("id_member"));
            tr.add(t);
        }
        return tr;
    }
    
    public Transaksi getLastTransaction() throws SQLException {
        ResultSet rs = getLastTransactionStatement.executeQuery();
        Transaksi t = new Transaksi();
        if (rs.next()){
            t.setNotaProduk(rs.getString("nota_produk"));
            return t;
        }
        return t;
    }
    
}
