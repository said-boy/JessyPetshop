/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.App;
import models.Barang;
import models.DetailTransaksi;
import models.Member;
import models.Transaksi;
import models.User;
import view.KasirView;

/**
 *
 * @author asus
 */
public class KasirController {
    private final KasirView kasirView;
    private DefaultTableModel tblModel;
    
    public KasirController(KasirView kv){
        this.kasirView = kv;
        kasirView.getText_nota_produk().setEditable(false);
        kasirView.getRadio_nonmember().setSelected(true);
    }
    
    /*
    * Nota Transaksi :
    * format Nota : 0000.00 
    * Max Depan nota : 9999.99
    * Max belakang nota : 0000.99
    * function ini akan membuat nota yang akan di letakkan pada input nomor nota 
    * pada bagian kasir view.
    */
    public void generateNotaTransaksi(){
        // mengambil data terakhir nota yang tercatat.
        Transaksi transaksi = App.masterInterface.getLastTransaksi();
        
        // mengecek apakah sudah pernah ada transaksi sebelumnya?
        if (transaksi.getNotaProduk() == null){
            /*  
            * jika belum pernah ada transaksi, maka nomor nota akan diset
            * menjadi 0000.01
            */
            int depan = 0;
            int belakang = 1;
            String dpn = String.format("%04d", depan);
            String blk = String.format("%02d", belakang);
            kasirView.getText_nota_produk().setText(dpn+"."+blk);
        }else{
            /*
            * jika sudah pernah ada transaksi, maka akan diambil data transaksi terakhir
            * untuk dijadikan nomor nota berikutnya. dengan menambahkan 1 pada angka
            * paling belakang pada nota sebelumnya.
            */
            String notaLast = transaksi.getNotaProduk();
            String[] parts = notaLast.split("\\.");
            int part1 = Integer.parseInt(parts[0]);
            int part2 = Integer.parseInt(parts[1]);

            /*
            * apabila nota belakang sudah mencapai 99 maka angka depan nya akan berubah
            * menjadi +1 dan angka belakang menjadi 1.
            */
            if (part2 == 99){
                part1 += 1;
                part2 = 1;
                String dpn = String.format("%04d", part1);
                String blk = String.format("%02d", part2);
                kasirView.getText_nota_produk().setText(dpn+"."+blk);
            }else{
                /*
                * jika belum mencapai 99 maka angka nota paling belakang 
                * akan terus ditambahkan +1.
                */
                String dpn = String.format("%04d", part1);
                String blk = String.format("%02d", part2+1);
                kasirView.getText_nota_produk().setText(dpn+"."+blk);
            }
        }
    }
      
    /*
    * Membership  
    * fungsi ini akan mengaktifkan input pada bagian membership
    * jika radio membership terpilih.
    */      
    public void radioIsSelected(){
        // mengecek apakah radio diselect atau tidak.
        if (kasirView.getRadio_member().isSelected()){
            // apabila radio member diselect
            kasirView.getText_id_member().setText(null);
            kasirView.getText_nama_member().setText(null);
            kasirView.getText_id_member().setEditable(true);
            kasirView.getText_nama_member().setEditable(false);
        }else if (kasirView.getRadio_nonmember().isSelected()){
            // apabila radio member tidak diselect 
            kasirView.getText_id_member().setText("-");
            kasirView.getText_nama_member().setText("NON MEMBER");
            kasirView.getText_nama_member().setEditable(false);
            kasirView.getText_id_member().setEditable(false);
        }else {
            kasirView.getText_nama_member().setEditable(false);
            kasirView.getText_id_member().setEditable(false);
        }
    }
    
    /*
    * set Data Member
    * function ini akan menyetel data member yang dikirimkan dari kasirView
    * ke kasirView.
    */
    public void setDataMember(Member member){
        kasirView.getText_id_member().setText(member.getIdMember());
        kasirView.getText_nama_member().setText(member.getNama());
    }
    
    /*
    * Struktur tabel yang digunakan untuk tabel barang.
    */
//    public static DefaultTableModel defaultTableModel() {
//        return new DefaultTableModel(new Object[][][][][]{},
//                new String[]{"Kode barang", "Nama barang", "Harga", "Jenis Barang", "Satuan"}){
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
    
    /*
    * Struktur tabel barang yang digunakan untuk tabel pembelian.
    */
//    public static DefaultTableModel defaultTableModelPembelian() {
//        return new DefaultTableModel(new Object[][][][][][][][]{},
//                new String[]{"Kode barang", "Nama barang", "Harga", "Jenis Barang", "Satuan", "Qty", "Diskon", "Subtotal"}){
//        boolean[] canEdit = new boolean[] {
//            false, false, false, false, false, false, false, false
//        };
//        
//        @Override
//        public boolean isCellEditable(int row, int column){
//            return canEdit[column];
//        }
//    };
//    }
    
    /*
    * setTabelBarang function ysng akan menampilkan data pada tabel 
    * sebelum melakukan pencarian barang.
    */
//    public void setTabelBarang(){
//        tblModel = defaultTableModel();
//        List<Barang> barang = App.masterInterface.getAllBarang();
//        kasirView.getTabel_list_produk().setModel(tblModel);
//        for(Barang b : barang){
//            tblModel.addRow(new Object[]{
//                b.getKdBarang(),
//                b.getNamaBarang(),
//                b.getHarga(),
//                b.getKdJenis().getJenisBarang(),
//                b.getKdJenis().getSatuan()
//            });
//        }
//    }
    
    /*
    * refreshTabelBarang function ysng akan menampilkan data pada tabel 
    * pencarian barang ketika ada pencarian barang.
    */
//    public void refreshTabelBarang(List<Barang> barang){
//        tblModel = defaultTableModel();
//        kasirView.getTabel_list_produk().setModel(tblModel);
//        for(Barang b : barang){
//            tblModel.addRow(new Object[]{
//                b.getKdBarang(),
//                b.getNamaBarang(),
//                b.getHarga(),
//                b.getKdJenis().getJenisBarang(),
//                b.getKdJenis().getSatuan()
//            });
//        }
//    }
    
    /*
    * function untuk logout user.
    */
    public void logout(){
        kasirView.dispose();
        App.loginView.setVisible(true);
    }
    
    /*
    * function tampilData akan menampilkan data yang dipilih pada tabel barang
    */
    
//    public void tampilData(int row){
//        kasirView.getText_nama_produk().setText(kasirView.getTabel_list_produk().getValueAt(row, 1).toString());
//        kasirView.getText_kode_barang().setText(kasirView.getTabel_list_produk().getValueAt(row, 0).toString());
//        kasirView.getSatuan().setText(kasirView.getTabel_list_produk().getValueAt(row, 4).toString());
//        kasirView.getTombol_tambah().setEnabled(true);
//        kasirView.getText_jumlah().setEditable(true);
//        
//    }
    
    public void loadData(Barang barang, List<Barang> list){
        if(kasirView.getTabel_list_produk().getSelectedRow() >= 0){
            int row = kasirView.getTabel_list_produk().getSelectedRow();
            barang = list.get(row);
            kasirView.getText_nama_produk().setText(barang.getNamaBarang());
            kasirView.getText_kode_barang().setText(barang.getKdBarang());
            kasirView.getSatuan().setText(barang.getKdJenis().getSatuan());
            kasirView.getTombol_tambah().setEnabled(true);
            kasirView.getText_jumlah().setEditable(true);
       }
    }
    
    /*
    * function disableSatuan akan menonaktifkan tombol + dan - pada jumlah beli.
    */
    public void disableSatuan(){
        kasirView.getTombol_tambah().setEnabled(false);
        kasirView.getTombol_kurang().setEnabled(false);
        kasirView.getText_jumlah().setEditable(false);
    }
    
    /*
    * function isStringNull akan mengecek apakah jumlah pembeliannya null?.
    */
    public Boolean isStringNull(){
        if ("".equals(kasirView.getText_jumlah().getText())) {
            JOptionPane.showMessageDialog(kasirView, "Jumlah Tidak Valid !!");
            kasirView.getText_jumlah().setText("1");
            return false;
        }
        return true;
    }
    
    /*
    * function isStringNull akan mengecek apakah jumlah pembeliannya 0.
    * karena seharusnya tidak ada pelanggan yang dapat membeli dengan jumlah 
    * pembelian 0.
    */
    public void validasiJumlah(){
        int jumlah = Integer.parseInt(kasirView.getText_jumlah().getText());
        if(jumlah < 1){
            kasirView.getText_jumlah().setText("1");
            JOptionPane.showMessageDialog(kasirView, "Jumlah Tidak Valid !!");
        } if(jumlah <= 1){
            kasirView.getTombol_kurang().setEnabled(false);
        } else {
            kasirView.getTombol_kurang().setEnabled(true);
        }
    }
    
    /*
    * tambahJumlah memanipulasi jumlah jika tombol + dipencet
    */
    public void tambahJumlah(){
        int jumlah = Integer.parseInt(kasirView.getText_jumlah().getText());
        if(jumlah > 0){
            kasirView.getTombol_kurang().setEnabled(true);
        }else{
            kasirView.getTombol_kurang().setEnabled(false);
        }
        int jml = jumlah + 1;
        kasirView.getText_jumlah().setText(String.valueOf(jml));
    }
    
    /*
    * kurangJumlah memanipulasi jumlah jika tombol - dipencet
    */
    public void kurangJumlah(){
        int jumlah = Integer.parseInt(kasirView.getText_jumlah().getText());
        if(jumlah > 2){
            kasirView.getTombol_kurang().setEnabled(true);
        }else{
            kasirView.getTombol_kurang().setEnabled(false);
        }
        int jml = jumlah - 1;
        kasirView.getText_jumlah().setText(String.valueOf(jml));
    }
    
    /*
    * Load header pada tabel pembelian
    */
    
//    public void loadHeaderOnTabelPembelian(){
//        tblModel = defaultTableModelPembelian();
//        kasirView.getTabel_list_pembelian().setModel(tblModel);
//    }
    
    /*
    * parrentBarang : adalah tempat untuk menyimpan semua data yang diseleksi
    * pada saat pemilihan barang, agar tidak hilang.
    */
//    public List<List<DetailTransaksi>> parrentBarang = new ArrayList<>();
    public List<DetailTransaksi> detailTransaksi = new ArrayList<>();
//    public List<Object> br = new ArrayList<>();
    
    public void addToTabelPembelian(){
        
        /*
        * mengambil data dari database berdasarkan kolom yang di klik.
        */
        Barang barang = App.masterInterface.getByCodeBarang(kasirView.getText_kode_barang().getText());
        int qty = Integer.parseInt(kasirView.getText_jumlah().getText());
        
        /*
        * mengisi parrentBarang dalam bentuk list dengan data yang di klik.
        */
        Transaksi transaksi = new Transaksi();
        transaksi.setNotaProduk(kasirView.getText_nota_produk().toString());
        
        DetailTransaksi dt = new DetailTransaksi();
//        parrentBarang.add(kasirView.getText_nota_produk().toString());
//        parrentBarang.add(barang.getKdBarang());
//        detailTransaksi.(transaksi);
//        
        dt.setKdBarang(barang);
//        br.add(barang.getNamaBarang());
        dt.setKdBarang(barang);
//        br.add(barang.getHarga().toString());
//        detailTransaksi.setDiskon();
//        br.add(barang.getKdJenis().getJenisBarang());
//        br.add(barang.getKdJenis().getSatuan());
//        brg.setKdJenis(barang.getKdJenis());
//        brg.set(kasirView.getText_jumlah().getText());
        if (kasirView.getRadio_member().isSelected()){
            if (barang.getHarga()*qty > 10000 && barang.getHarga()*qty <= 100000 ) {
                dt.setDiskon(1000);
            }else if(barang.getHarga()*qty > 100000 && barang.getHarga()*qty <= 1000000 ){
                dt.setDiskon(10000);
            }else if(barang.getHarga()*qty > 1000000 && barang.getHarga()*qty <= 10000000 ){
                dt.setDiskon(100000);
            }else{
                dt.setDiskon(0);
            }
        }else if(kasirView.getRadio_nonmember().isSelected()){
            dt.setDiskon(0);
        }else{
            dt.setDiskon(0);
        }
        dt.setJumlahBeli(Integer.parseInt(kasirView.getText_jumlah().getText()));
        dt.setSubTotal(barang.getHarga()*Integer.parseInt(kasirView.getText_jumlah().getText()));
//        br.add(String.valueOf(barang.getHarga()*qty));
//        detailTransaksi.add(dt);
//        parrentBarang.add(detailTransaksi);
        detailTransaksi.add(dt);
//        parrentBarang.add(detailTransaksi);
        
//        System.out.println(parrentBarang);
        
        /*
        * mengambil data dari parrentBarang dan memasukkannya kedalam tabel
        * pembelian. dan menampilkannya.
        */
//        parrentBarang.forEach((row) -> {
//            tblModel.addRow(new Object[]{
//                row.get(0),
//                row.get(1),
//                row.get(2),
//                row.get(3),
//                row.get(4),
//                row.get(5),
//                row.get(6),
//                row.get(7),
//            });
//        }); 
//        System.out.println(parrentBarang);
    }
    
    private int index = -1;
    public void selectedRowPembelian(int row){
        index = row;
    }

    public void delete(){
        detailTransaksi.remove(index);  
        selectedRowPembelian(-1);
    }
    
    public Integer setTotalBelanja(){
        int rowCoount = kasirView.getTabel_list_pembelian().getRowCount();
        int sum = 0;
        for(int i = 0; i < rowCoount; i++ ){
            Object valueAt = kasirView.getTabel_list_pembelian().getValueAt(i, 4);
            sum += Integer.parseInt(valueAt.toString());
        }
        kasirView.getText_total_belanja().setText(String.valueOf(sum));
        return sum;
    }
    
    public void setDiscount(){
        int rowCoount = kasirView.getTabel_list_pembelian().getRowCount();
        int diskon = 0;
        for(int i = 0; i < rowCoount; i++ ){
            Object valueAt = kasirView.getTabel_list_pembelian().getValueAt(i, 2);
            diskon += Integer.parseInt(valueAt.toString());
        }
        kasirView.getText_diskon().setText(String.valueOf(diskon));
    }
    
    public void setTotal(){
        int nominal = Integer.parseInt(kasirView.getText_total_belanja().getText()) - Integer.parseInt(kasirView.getText_diskon().getText());
        kasirView.getText_total_bayar().setText(String.valueOf(nominal));
    }
    
    public void setKembalian(){
        int kembalian = Integer.parseInt(kasirView.getText_pembayaran().getText()) - Integer.parseInt(kasirView.getText_total_bayar().getText());
        kasirView.getText_kembalian().setText(String.valueOf(kembalian));
    }
    
    public void cetakNotaTransaksi() throws ParseException {
        Date date = new Date();
        Timestamp timeStampDate = new Timestamp(date.getTime());
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        String tanggal = formatter.format(timeStampDate); 
        
        Date parsedDate = formatter.parse(tanggal);
        Timestamp convertedTimestamp = new Timestamp(parsedDate.getTime());
        
        String notaProduk = kasirView.getText_nota_produk().getText();
        
        User user = App.masterInterface.getByIdUser(kasirView.getIdUser().getText());
        Member member = App.masterInterface.getByIdMember(kasirView.getText_id_member().getText());
        
        Transaksi transaksi = new Transaksi();
        transaksi.setNotaProduk(notaProduk);
        transaksi.setTanggal(convertedTimestamp);
        transaksi.setIdUser(user);
        transaksi.setIdMember(member);
        
        App.masterInterface.saveTransaksi(transaksi);
        
        List<DetailTransaksi> listDetailTransaksi = new ArrayList<>();
        int rowCount = kasirView.getTabel_list_pembelian().getRowCount();
        for (int i = 0; i < rowCount; i++){
            DetailTransaksi dt = new DetailTransaksi();
            dt.setNotaProduk(transaksi);
            dt.setKdBarang(App.masterInterface.getByCodeBarang((String) kasirView.getTabel_list_pembelian().getValueAt(i, 0)));
            dt.setJumlahBeli(Integer.parseInt(String.valueOf(kasirView.getTabel_list_pembelian().getValueAt(i, 3))));
            dt.setSubTotal(Integer.parseInt(String.valueOf(kasirView.getTabel_list_pembelian().getValueAt(i, 4))));
            listDetailTransaksi.add(dt);
        }
        App.masterInterface.saveDetail(listDetailTransaksi);
    }
    
    public void clearKasirView() {
        detailTransaksi.clear();
        kasirView.getText_kembalian().setText(null);
        kasirView.getText_pembayaran().setText(null);
        kasirView.getText_total_bayar().setText(null);
        kasirView.getText_diskon().setText(null);
        kasirView.getText_total_belanja().setText(null);
        kasirView.getText_jumlah().setText("1");
        kasirView.getSatuan().setText("Satuan");
        kasirView.getText_nama_produk().setText(null);  
        kasirView.getRadio_nonmember().setSelected(true);
        radioIsSelected();
    }
    
}
