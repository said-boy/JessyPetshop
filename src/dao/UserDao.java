/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.MasterUser;
import models.User;

/**
 *
 * @author asus
 */
public class UserDao {
    private Connection connection;
    private PreparedStatement saveStatement, updateStatement, deleteStatement; 
    private PreparedStatement getAllStatement, getByIdStatement, validateStatement, getIdUserStatement; 
    
    private final String saveQuery = "INSERT INTO tb_user VALUES(?,?,?,?)";
    private final String updateQuery = "UPDATE tb_barang SET username=?, password=?, kd_user=? WHERE id_user = ?";
    private final String deleteQuery = "DELETE FROM tb_user WHERE id_user = ?";
    private final String getAllQuery = "SELECT * FROM tb_user";
    private final String getByIdQuery = "SELECT * FROM tb_user WHERE id_user = ?";
    private final String validateQuery = "SELECT * FROM tb_user WHERE username = ? AND password = ?";
    private final String getIdUserQuery = "SELECT * FROM tb_user WHERE id_user = ?";

    public void setConnection(Connection connection) throws SQLException{
        this.connection = connection;
        saveStatement = this.connection.prepareStatement(saveQuery);
        updateStatement = this.connection.prepareStatement(updateQuery);
        deleteStatement = this.connection.prepareStatement(deleteQuery);
        getAllStatement = this.connection.prepareStatement(getAllQuery);
        getByIdStatement = this.connection.prepareStatement(getByIdQuery);
        validateStatement = this.connection.prepareStatement(validateQuery);
        getIdUserStatement = this.connection.prepareStatement(getIdUserQuery);
    }
    
    public User save(User user) throws SQLException{
        saveStatement.setString(1, user.getIdUser());
        saveStatement.setString(2, user.getUsername());
        saveStatement.setString(3, user.getPassword());
        saveStatement.setObject(4, user.getKdUser());
        saveStatement.executeUpdate();
        return user;
    }
    
    public User update(User user) throws SQLException{
        updateStatement.setString(1, user.getUsername());
        updateStatement.setString(2, user.getPassword());
        updateStatement.setObject(3, user.getKdUser());
        updateStatement.executeUpdate();
        return user;
    }
    
    public User delete(User user) throws SQLException{
        deleteStatement.setString(1, user.getIdUser());
        deleteStatement.executeUpdate();
        return user;
    }
    
    public List<User> getAll() throws SQLException {
        List<User> users = new ArrayList<>();
        ResultSet rs = getAllStatement.executeQuery();
        while(rs.next()){
            User u = new User();
            u.setIdUser(rs.getString("id_user"));
            u.setUsername(rs.getString("username"));
            u.setPassword(rs.getString("password"));
            u.setKdUser((MasterUser) rs.getObject("kd_user"));
            users.add(u);
        }
        return users;
    }
    
    public User getById(String id) throws SQLException {
        User u = new User();
        getIdUserStatement.setString(1, id);
        ResultSet rs = getIdUserStatement.executeQuery();
        if(rs.next()){
            u.setIdUser(rs.getString("id_user"));
            u.setUsername(rs.getString("username"));
            u.setPassword(rs.getString("password"));
            
            MasterUserDao mud = new MasterUserDao();
            mud.setConnection(connection);
            MasterUser mu = mud.getByKd(rs.getString("kd_user"));
            u.setKdUser(mu);
        }
        return u;
    }
    
    public static String encrypt(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    
    public User validate(User user) throws SQLException {
        User u = null;
        validateStatement.setString(1, user.getUsername());
        String encryptPassword = encrypt(user.getPassword());
        validateStatement.setString(2, encryptPassword);
        ResultSet rs = validateStatement.executeQuery();
        if (rs.next()) {
            u = new User();
            u.setIdUser(rs.getString("id_user"));
            u.setUsername(rs.getString("username"));
            u.setPassword(rs.getString("password"));
            
            MasterUserDao msd = new MasterUserDao();
            msd.setConnection(connection);
            MasterUser md = msd.getByKd(rs.getString("kd_user"));
            u.setKdUser(md);  
        }
        return u;
    }

}
