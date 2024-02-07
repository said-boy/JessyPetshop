/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import models.Barang;
import models.DetailTransaksi;
import models.MasterBarang;
import models.MasterUser;
import models.Member;
import models.Transaksi;
import models.User;
import models.Utility;

/**
 *
 * @author asus
 */
public interface MasterInterface {
//    Barang
    Barang saveBarang(Barang barang);
    Barang updateBarang(Barang barang);
    void deleteBarang(String kodeProduk);
    List<Barang> getAllBarang();
    List<Barang> getAllByLikeIdBarangOrName(String idOrName);
    Barang getByCodeBarang(String id);
    
//    DetailTransaksi
    List<DetailTransaksi> saveDetail(List<DetailTransaksi> detailTransaksi);
    
//    MasterBarang
    List<MasterBarang> getAllMasterBarang();
    Object[] getAllJenisMasterBarang();
    MasterBarang getMasterBarangByName(String name);
    
//    MasterUser
    List<MasterUser> getAllMasterUser();
    
//    Member
    Member saveMember(Member member);
    List<Member> getAllMember();
    Member getByIdMember(String idMember);

//    Transaksi
    Transaksi saveTransaksi(Transaksi transaksi);
    List<Transaksi> getAllTransaksi();
    List<Transaksi> getByMonthTransaksi(Transaksi transaksi);
    Transaksi getLastTransaksi();
    
//    User
    User saveUser(User user);
    User updateUser(User user);
    User deleteUser(User user);
    List<User> getAllUser();
    User getByIdUser(String id);
    User validate(User user);
    
//    Utility
    Utility getUtility();
}
