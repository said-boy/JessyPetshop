/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class koneksi {
    protected Connection konek;
    protected Statement stmt;
    
    public koneksi () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            try {
                konek = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_jessy_petshop","root","");
            } catch (SQLException ex) {
                Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (ClassNotFoundException cnfe) {
            Logger.getLogger("DRIVER MANAGER : "+cnfe.getMessage());
        }
    }
    
    public Statement createStatement() throws SQLException {
        return stmt = (Statement) konek.createStatement();
    }
    
    public Connection connection(){
        return konek;
    }
    
    public PreparedStatement prepareStatement(String sql) throws SQLException {
        return konek.prepareStatement(sql);
    }
    
}
