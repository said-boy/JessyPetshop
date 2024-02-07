/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.impl;

import config.koneksi;
import dao.BarangDao;
import dao.DetailTransaksiDao;
import dao.MasterBarangDao;
import dao.MasterUserDao;
import dao.MemberDao;
import dao.TransaksiDao;
import dao.UserDao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Barang;
import models.DetailTransaksi;
import models.MasterBarang;
import models.MasterUser;
import models.Member;
import models.Transaksi;
import models.User;
import models.Utility;
import service.MasterInterface;

/**
 *
 * @author asus
 */
public class MasterServiceImpl implements MasterInterface{

    private BarangDao barangDao;
    private DetailTransaksiDao detailTransaksiDao;
    private UserDao userDao;
    private MasterBarangDao masterBarangDao;
    private MasterUserDao masterUserDao ;
    private TransaksiDao transaksiDao ;
    private MemberDao memberDao;
    private koneksi koneksi;
    private Connection connection;
    
    public MasterServiceImpl(){
        try {
            koneksi = new koneksi();
            connection = koneksi.connection();
            
            userDao = new UserDao();
            userDao.setConnection(connection);
            
            barangDao = new BarangDao();
            barangDao.setConnection(connection);
            
            masterBarangDao = new MasterBarangDao();
            masterBarangDao.setConnection(connection);
            
            transaksiDao = new TransaksiDao();
            transaksiDao.setConnection(connection);
            
            memberDao = new MemberDao();
            memberDao.setConnection(connection);
            
            transaksiDao = new TransaksiDao();
            transaksiDao.setConnection(connection);
            
            detailTransaksiDao = new DetailTransaksiDao();
            detailTransaksiDao.setConnection(connection);
            
        } catch (SQLException ex) {
            Logger.getLogger(MasterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public Barang saveBarang(Barang barang) {
        try {
            connection.setAutoCommit(false);
            barang = barangDao.save(barang);
            connection.commit();
            connection.setAutoCommit(true);
            return barang;
        } catch (SQLException ex) {
            try{
                connection.rollback();
            }catch(SQLException e){
                Logger.getLogger(MasterServiceImpl.class.getName()).log(Level.SEVERE, null, e);  
            }
            Logger.getLogger(MasterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Barang updateBarang(Barang barang) {
        try {
            barang = barangDao.update(barang);
            return barang;
        } catch (SQLException ex) {
            Logger.getLogger(MasterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void deleteBarang(String kodeProduk) {
        try {
            barangDao.delete(kodeProduk);
        } catch (SQLException ex) {
            Logger.getLogger(MasterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Barang> getAllBarang() {
        try {
            return barangDao.getAll();
        } catch (SQLException ex) {
            Logger.getLogger(MasterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<Barang> getAllByLikeIdBarangOrName(String idOrname) {
        try {
            return barangDao.getByIdOrName(idOrname);
        } catch (SQLException ex) {
            Logger.getLogger(MasterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
    public Barang getByCodeBarang(String code) {
        try {
            return barangDao.getByCode(code);
        } catch (SQLException ex) {
            Logger.getLogger(MasterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<DetailTransaksi> saveDetail(List<DetailTransaksi> dt) {
        try {
            return detailTransaksiDao.save(dt);
        } catch (SQLException ex) {
            Logger.getLogger(MasterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Object[] getAllJenisMasterBarang() {
        try {
            return masterBarangDao.getAllJenis();
        } catch (SQLException ex) {
            Logger.getLogger(MasterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
    public List<MasterBarang> getAllMasterBarang() {
        try {
            List<MasterBarang> barang = masterBarangDao.getAll();
            return barang;
        } catch (SQLException ex) {
            Logger.getLogger(MasterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
    public MasterBarang getMasterBarangByName(String name) { 
        try {
            MasterBarang barang = masterBarangDao.getByName(name);
            return barang;
        } catch (SQLException ex) {
            Logger.getLogger(MasterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<MasterUser> getAllMasterUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Member saveMember(Member member) {
        try {
            connection.setAutoCommit(false);            
            member = memberDao.save(member);
            connection.commit();
            connection.setAutoCommit(true);
        } catch (SQLException ex) {
            Logger.getLogger(MasterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return member;
    }

    @Override
    public List<Member> getAllMember() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Member getByIdMember(String idMember) {
        try {
            return memberDao.getById(idMember);
        } catch (SQLException ex) {
            Logger.getLogger(MasterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Transaksi saveTransaksi(Transaksi transaksi) {
        try {
            connection.setAutoCommit(false);            
            transaksi = transaksiDao.save(transaksi);
            connection.commit();
            connection.setAutoCommit(true);
            return transaksi;
        } catch (SQLException ex) {
            try{
                connection.rollback();
            }catch(SQLException e){
                Logger.getLogger(MasterServiceImpl.class.getName()).log(Level.SEVERE, null, e);  
            }
            Logger.getLogger(MasterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<Transaksi> getAllTransaksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Transaksi> getByMonthTransaksi(Transaksi transaksi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Transaksi getLastTransaksi() {
        try {
            return transaksiDao.getLastTransaction();
        } catch (SQLException ex) {
            Logger.getLogger(MasterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public User saveUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User updateUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User deleteUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> getAllUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getByIdUser(String id) {
        try {
            return userDao.getById(id);
        } catch (SQLException ex) {
            Logger.getLogger(MasterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public User validate(User user) {
        try {
            return userDao.validate(user);
        } catch (SQLException ex) {
            Logger.getLogger(MasterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
    public Utility getUtility() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
