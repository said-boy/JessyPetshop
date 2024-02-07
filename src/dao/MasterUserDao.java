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
import models.MasterUser;

/**
 *
 * @author asus
 */
public class MasterUserDao {
    private Connection connection;
    private PreparedStatement getAllMasterUserStatement, getByKdStatement;
    
    private final String getAllMasterUserQuery = "SELECT * FROM tb_master_user";
    private final String getByKdQuery = "SELECT * FROM tb_master_user WHERE kd_user = ?";
    
    public void setConnection(Connection connection) throws SQLException {
        this.connection = connection;
        getAllMasterUserStatement = this.connection.prepareStatement(getAllMasterUserQuery);
        getByKdStatement = this.connection.prepareStatement(getByKdQuery);
    }
    
    public List<MasterUser> getAll() throws SQLException {
        List<MasterUser> masterUser = new ArrayList<>();
        ResultSet rs = getAllMasterUserStatement.executeQuery();
        while(rs.next()){
            MasterUser mu = new MasterUser();
            mu.setKdUser(rs.getString("kd_user"));
            mu.setJenisUser(rs.getString("jenis_user"));
            masterUser.add(mu);
        }
        return masterUser;
    }
    
    public MasterUser getByKd(String masterUser) throws SQLException {
        MasterUser mu = new MasterUser();
        getByKdStatement.setString(1, masterUser);
        ResultSet rs = getByKdStatement.executeQuery();
        if(rs.next()){
            mu.setKdUser(rs.getString("kd_user"));
            mu.setJenisUser(rs.getString("jenis_user"));
        }
        return mu;
    }
    
}
