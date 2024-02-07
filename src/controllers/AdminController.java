/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.App;
import models.Barang;
import view.AdminView;



/**
 *
 * @author asus
 */
public class AdminController {
    
    private AdminView adminView;
    
    public AdminController(AdminView av){
        this.adminView = av;
    }
    
//    public static DefaultTableModel defaultTableModel() {
//        return new DefaultTableModel(new Object[][][][][]{},
//                new String[]{"Kode barang", "Nama barang", "Harga", "Stok", "Jenis barang"}){
//        boolean[] canEdit = new boolean[] {
//            false, false, false, false, false
//        };
//        
//        @Override
//        public boolean isCellEditable(int row, int column){
//            return canEdit[column];
//        }
//    };
//    }
//    
//    public void refreshTable(){
//        DefaultTableModel tblModel = new DefaultTableModel();
//        List<Barang> barang = App.masterInterface.getAllBarang();
//        tblModel = defaultTableModel();
//        adminView.getTabel_list_produk().setModel(tblModel);
//        for(Barang b : barang){
//            tblModel.addRow(new Object[]{
//                b.getKdBarang(),
//                b.getNamaBarang(),
//                b.getHarga(),
//                b.getStok(),
//                b.getKdJenis().getJenisBarang()
//            });
//        }
//    }
    
//    public void tampilData(int row){
//        adminView.getText_kode_produk().setText(adminView.getTabel_list_produk().getValueAt(row, 0).toString());
//        adminView.getText_nama_produk().setText(adminView.getTabel_list_produk().getValueAt(row, 1).toString());
//        adminView.getText_harga_jual().setText(adminView.getTabel_list_produk().getValueAt(row, 2).toString());
//        adminView.getText_jumlah_stok().setText(adminView.getTabel_list_produk().getValueAt(row, 3).toString());
//        adminView.getCombo_jenis_produk().setSelectedItem(adminView.getTabel_list_produk().getValueAt(row, 4).toString());
//        adminView.getText_kode_produk().setEnabled(false);
//        adminView.getTombol_tambah_produk().setEnabled(false);
//    }
 
    public void clearForm(){
        adminView.getText_kode_produk().setText(null);
        adminView.getText_harga_jual().setText(null);
        adminView.getText_nama_produk().setText(null);
        adminView.getText_jumlah_stok().setText(null);
        adminView.getText_harga_jual().setText(null);
        adminView.getCombo_jenis_produk().setSelectedIndex(0);
        adminView.getText_kode_produk().setEnabled(true);
        adminView.getTombol_tambah_produk().setEnabled(true);
        adminView.getTombol_update_produk().setEnabled(false);
        adminView.getTombol_hapus_produk().setEnabled(false);
        adminView.getText_kode_produk().setEditable(true);
   }
    
    public void loadComboBox() {
        ComboBoxModel cbm = new DefaultComboBoxModel(App.masterInterface.getAllJenisMasterBarang());
        adminView.getCombo_jenis_produk().setModel(cbm);
    }
    
    public void logout(){
        adminView.dispose();
        App.loginView.setVisible(true);
    }
    
    public void loadData(Barang barang, List<Barang> list){
        if(adminView.getTabel_list_produk().getSelectedRow() >= 0){
            int row = adminView.getTabel_list_produk().getSelectedRow();
            barang = list.get(row);
            adminView.getText_kode_produk().setText(barang.getKdBarang());
            adminView.getText_nama_produk().setText(barang.getNamaBarang());
            adminView.getText_harga_jual().setText(barang.getHarga().toString());
            adminView.getText_jumlah_stok().setText(barang.getStok().toString());
            
            adminView.getCombo_jenis_produk().setSelectedItem(barang.getKdJenis().getJenisBarang());
            adminView.getTombol_tambah_produk().setEnabled(false);
            adminView.getText_kode_produk().setEditable(false);
            adminView.getTombol_update_produk().setEnabled(true);
            adminView.getTombol_hapus_produk().setEnabled(true);
        }
    }
    
    public void enableTombol(){
        adminView.getTombol_update_produk().setEnabled(false);
        adminView.getTombol_hapus_produk().setEnabled(false);
    }
    
    public boolean inputValidation(){
        if(adminView.getText_kode_produk().getText().equals("")){
            JOptionPane.showMessageDialog(adminView, "kode produk harus di isi !");
            return false;
        }else if(adminView.getText_nama_produk().getText().equals("")){
            JOptionPane.showMessageDialog(adminView, "nama produk harus di isi !");
            return false;
        }else if(adminView.getText_jumlah_stok().getText().equals("")){
            JOptionPane.showMessageDialog(adminView, "stok produk harus di isi !");
            return false;
        }else if(adminView.getText_harga_jual().getText().equals("")){
            JOptionPane.showMessageDialog(adminView, "harga harus di isi !");
            return false;
        }else{
            return true;
        }
    }
//    private static MasterServiceImpl ms = new MasterServiceImpl();
// 
//    public static List<Barang> getAllDataBarang(){
//        return ms.getAllBarang();
//    }
//    
//    public static String insertBarang(String kodeProduk, String namaProduk, String jenisProduk, Integer jumlahStok, Integer hargaJual){
//        MasterBarang mb = ms.getMasterBarangByName(jenisProduk);
//        
//        Barang barang = new Barang();
//        barang.setKdBarang(kodeProduk);
//        barang.setNamaBarang(namaProduk);
//        barang.setStok(jumlahStok);
//        barang.setHarga(hargaJual);
//        barang.setKdJenis(mb);
//
//        Barang result = ms.saveBarang(barang);
//        if (result == null){
//            return "Gagal";
//        }
//        return "Berhasil";
//    }
//    
//    public static void deleteBarang(String kodeProduk){
//        ms.deleteBarang(kodeProduk);
//    }
//    
//    public static String updateBarang(String kodeProduk, String namaProduk, String jenisProduk, Integer jumlahStok, Integer hargaJual){
//        MasterBarang mb = ms.getMasterBarangByName(jenisProduk);
//        
//        Barang barang = new Barang();
//        barang.setKdBarang(kodeProduk);
//        barang.setNamaBarang(namaProduk);
//        barang.setStok(jumlahStok);
//        barang.setHarga(hargaJual);
//        barang.setKdJenis(mb);
//        
//        Barang result = ms.updateBarang(barang);
//        if(result == null){
//            return "Gagal";
//        } else {
//            return "Berhasil";
//        }
//    }
}
