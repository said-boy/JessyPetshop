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
import models.Utility;

/**
 *
 * @author asus
 */
public class UtilityDao {
    private Connection connection;
    private PreparedStatement getUtilityStatement;
    
    private final String getUtilityQuery = "SELECT * FROM tb_utility";
    
    public void setConnection(Connection connection) throws SQLException{
    this.connection = connection;
    getUtilityStatement = this.connection.prepareStatement(getUtilityQuery);
    }
    
    public Utility getUtility(Utility utility) throws SQLException {
    Utility u = new Utility();
    ResultSet rs = getUtilityStatement.executeQuery();
    u.setLogo(rs.getString("logo"));
    u.setAlamat(rs.getString("alamat"));
    u.setNomorHp(rs.getString("nomor_hp"));
    return u;
    }
}
