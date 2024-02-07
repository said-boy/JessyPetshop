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
import models.Member;

/**
 *
 * @author asus
 */
public class MemberDao {
    private Connection connection;
    private PreparedStatement saveStatement, getAllStatement, getByIdStatement, getByNameStatement; 
    
    private final String saveQuery = "INSERT INTO tb_member VALUES(?,?,?)";
    private final String getAllMemberQuery = "SELECT * FROM tb_member";
    private final String getByIdMemberQuery = "SELECT * FROM tb_member WHERE id_member = ?";

    public void setConnection(Connection connection) throws SQLException{
        this.connection = connection;
        saveStatement = this.connection.prepareStatement(saveQuery);
        getAllStatement = this.connection.prepareStatement(getAllMemberQuery);
        getByIdStatement = this.connection.prepareStatement(getByIdMemberQuery);
    }
    
    public Member save(Member member) throws SQLException{
        saveStatement.setString(1, member.getIdMember());
        saveStatement.setString(2, member.getNama());
        saveStatement.setString(3, member.getNomorHP());
        saveStatement.executeUpdate();
        return member;
    }
    
     public List<Member> getAll() throws SQLException {
        List<Member> member = new ArrayList<>();
        ResultSet rs = getAllStatement.executeQuery();
        while(rs.next()){
            Member m = new Member();
            m.setIdMember(rs.getString("id_member"));
            m.setNama(rs.getString("nama"));
            m.setNomorHP(rs.getString("nomor_hp"));
            member.add(m);
        }
        return member;
    }
     
    public Member getById(String idMember) throws SQLException {
        getByIdStatement.setString(1, idMember);
        ResultSet rs = getByIdStatement.executeQuery();
        if(rs.next()){
            Member m = new Member();
            m.setIdMember(rs.getString("id_member"));
            m.setNama(rs.getString("nama"));
            m.setNomorHP(rs.getString("nomor_hp"));
            return m;
        }
        return null;
    }   
    
}
