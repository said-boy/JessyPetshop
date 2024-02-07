/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controllers.KasirController;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.AbstractTableModel;
import main.App;
import models.Barang;
import models.DetailTransaksi;
import models.Member;

/**
 *
 * @author asus
 */
public class KasirView extends javax.swing.JFrame {

    /**
     * Creates new form KasirView1
     */
    
    private final KasirController kasirController;
    private final Barang barang;    
    private List<Barang> listBarang;
    private List<DetailTransaksi> listOrder;
    
    public KasirView() {
        initComponents();
        setTextWaktu();
        kasirController = new KasirController(this);
        barang = new Barang();
        kasirController.generateNotaTransaksi();
        refreshTable();
//        refreshTableListPembelian();
        initListener();
        kasirController.radioIsSelected();
        kasirController.disableSatuan();
//        kasirController.loadHeaderOnTabelPembelian();
    }
    
    private void initListener(){
        tabel_list_produk.getSelectionModel().addListSelectionListener((ListSelectionEvent lse) -> {
        this.kasirController.loadData(barang, listBarang);
        });
    }
    
    public void setText_nama_kasir(String nama){
        this.text_nama_kasir.setText(nama);
    }
    
    public final void setTextWaktu(){
        this.text_waktu.setText(helpers.Helpers.setTime());
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel12() {
        return jLabel12;
    }

    public void setjLabel12(JLabel jLabel12) {
        this.jLabel12 = jLabel12;
    }

    public JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public JLabel getjLabel14() {
        return jLabel14;
    }

    public void setjLabel14(JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    public JLabel getjLabel16() {
        return jLabel16;
    }

    public void setjLabel16(JLabel jLabel16) {
        this.jLabel16 = jLabel16;
    }

    public JLabel getjLabel18() {
        return jLabel18;
    }

    public void setjLabel18(JLabel jLabel18) {
        this.jLabel18 = jLabel18;
    }

    public JLabel getjLabel19() {
        return jLabel19;
    }

    public void setjLabel19(JLabel jLabel19) {
        this.jLabel19 = jLabel19;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel20() {
        return jLabel20;
    }

    public void setjLabel20(JLabel jLabel20) {
        this.jLabel20 = jLabel20;
    }

    public JLabel getjLabel21() {
        return jLabel21;
    }

    public void setjLabel21(JLabel jLabel21) {
        this.jLabel21 = jLabel21;
    }

    public JLabel getjLabel23() {
        return jLabel23;
    }

    public void setjLabel23(JLabel jLabel23) {
        this.jLabel23 = jLabel23;
    }

    public JLabel getjLabel24() {
        return jLabel24;
    }

    public void setjLabel24(JLabel jLabel24) {
        this.jLabel24 = jLabel24;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public JPanel getjPanel4() {
        return jPanel4;
    }

    public void setjPanel4(JPanel jPanel4) {
        this.jPanel4 = jPanel4;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public ButtonGroup getRadioMember() {
        return radioMember;
    }

    public void setRadioMember(ButtonGroup radioMember) {
        this.radioMember = radioMember;
    }

    public JRadioButton getRadio_member() {
        return radio_member;
    }

    public void setRadio_member(JRadioButton radio_member) {
        this.radio_member = radio_member;
    }

    public JRadioButton getRadio_nonmember() {
        return radio_nonmember;
    }

    public void setRadio_nonmember(JRadioButton radio_nonmember) {
        this.radio_nonmember = radio_nonmember;
    }

    public JLabel getSatuan() {
        return satuan;
    }

    public void setSatuan(JLabel satuan) {
        this.satuan = satuan;
    }

    public JTable getTabel_list_pembelian() {
        return tabel_list_pembelian;
    }

    public void setTabel_list_pembelian(JTable tabel_list_pembelian) {
        this.tabel_list_pembelian = tabel_list_pembelian;
    }

    public JTable getTabel_list_produk() {
        return tabel_list_produk;
    }

    public void setTabel_list_produk(JTable tabel_list_produk) {
        this.tabel_list_produk = tabel_list_produk;
    }

    public JTextField getText_cari_produk() {
        return text_cari_produk;
    }

    public void setText_cari_produk(JTextField text_cari_produk) {
        this.text_cari_produk = text_cari_produk;
    }

    public JTextField getText_diskon() {
        return text_diskon;
    }

    public void setText_diskon(JTextField text_diskon) {
        this.text_diskon = text_diskon;
    }

    public JTextField getText_id_member() {
        return text_id_member;
    }

    public void setText_id_member(JTextField text_id_member) {
        this.text_id_member = text_id_member;
    }

    public JTextField getText_jumlah() {
        return text_jumlah;
    }

    public void setText_jumlah(JTextField text_jumlah) {
        this.text_jumlah = text_jumlah;
    }

    public JTextField getText_kembalian() {
        return text_kembalian;
    }

    public void setText_kembalian(JTextField text_kembalian) {
        this.text_kembalian = text_kembalian;
    }

    public JLabel getText_nama_kasir() {
        return text_nama_kasir;
    }

    public void setText_nama_kasir(JLabel text_nama_kasir) {
        this.text_nama_kasir = text_nama_kasir;
    }

    public JTextField getText_nama_member() {
        return text_nama_member;
    }

    public void setText_nama_member(JTextField text_nama_member) {
        this.text_nama_member = text_nama_member;
    }

    public JTextField getText_nama_produk() {
        return text_nama_produk;
    }

    public void setText_nama_produk(JTextField text_nama_produk) {
        this.text_nama_produk = text_nama_produk;
    }

    public JTextField getText_nota_produk() {
        return text_nota_produk;
    }

    public void setText_nota_produk(JTextField text_nota_produk) {
        this.text_nota_produk = text_nota_produk;
    }

    public JTextField getText_pembayaran() {
        return text_pembayaran;
    }

    public void setText_pembayaran(JTextField text_pembayaran) {
        this.text_pembayaran = text_pembayaran;
    }

    public JTextField getText_total_bayar() {
        return text_total_bayar;
    }

    public void setText_total_bayar(JTextField text_total_bayar) {
        this.text_total_bayar = text_total_bayar;
    }

    public JTextField getText_total_belanja() {
        return text_total_belanja;
    }

    public void setText_total_belanja(JTextField text_total_belanja) {
        this.text_total_belanja = text_total_belanja;
    }

    public JLabel getText_waktu() {
        return text_waktu;
    }

    public void setText_waktu(JLabel text_waktu) {
        this.text_waktu = text_waktu;
    }

    public JButton getTombol_cek() {
        return tombol_cek;
    }

    public void setTombol_cek(JButton tombol_cek) {
        this.tombol_cek = tombol_cek;
    }

    public JButton getTombol_cetak() {
        return tombol_cetak;
    }

    public void setTombol_cetak(JButton tombol_cetak) {
        this.tombol_cetak = tombol_cetak;
    }

    public JButton getTombol_hapus_list() {
        return tombol_hapus_list;
    }

    public void setTombol_hapus_list(JButton tombol_hapus_list) {
        this.tombol_hapus_list = tombol_hapus_list;
    }

    public JButton getTombol_kurang() {
        return tombol_kurang;
    }

    public void setTombol_kurang(JButton tombol_kurang) {
        this.tombol_kurang = tombol_kurang;
    }

    public JButton getTombol_logout() {
        return tombol_logout;
    }

    public void setTombol_logout(JButton tombol_logout) {
        this.tombol_logout = tombol_logout;
    }

    public JButton getTombol_tambah() {
        return tombol_tambah;
    }

    public void setTombol_tambah(JButton tombol_tambah) {
        this.tombol_tambah = tombol_tambah;
    }

    public JButton getTombol_tambah_barang() {
        return tombol_tambah_barang;
    }

    public void setTombol_tambah_barang(JButton tombol_tambah_barang) {
        this.tombol_tambah_barang = tombol_tambah_barang;
    }

    public JButton getTombol_tambah_member() {
        return tombol_tambah_member;
    }

    public void setTombol_tambah_member(JButton tombol_tambah_member) {
        this.tombol_tambah_member = tombol_tambah_member;
    }

    public JLabel getText_kode_barang() {
        return text_kode_barang;
    }

    public void setText_kode_barang(JLabel text_kode_barang) {
        this.text_kode_barang = text_kode_barang;
    }

    public JLabel getIdUser() {
        return idUser;
    }

    public void setIdUser(JLabel idUser) {
        this.idUser = idUser;
    }
    
    private void refreshTable(){
        listBarang = App.masterInterface.getAllBarang();
        tabel_list_produk.setModel(new ProdukTableModel(listBarang));
    }
    
    private void refreshTableListPembelian(){
        listOrder = kasirController.detailTransaksi;
//        System.out.println(kasirController.parrentBarang.get(0).getJumlahBeli());
//        System.out.println(listOrder.forEach());
                tabel_list_pembelian.setModel(new orderTableModel(listOrder));
//            listOrder.forEach((order) -> {
//                tabel_list_pembelian.setModel(new orderTableModel(listOrder));
//            });
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioMember = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        text_nama_kasir = new javax.swing.JLabel();
        text_waktu = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        text_nota_produk = new javax.swing.JTextField();
        tombol_logout = new javax.swing.JButton();
        idUser = new javax.swing.JLabel();
        tombol_kurang = new javax.swing.JButton();
        tombol_cetak = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_list_produk = new javax.swing.JTable();
        radio_nonmember = new javax.swing.JRadioButton();
        text_nama_member = new javax.swing.JTextField();
        satuan = new javax.swing.JLabel();
        radio_member = new javax.swing.JRadioButton();
        tombol_tambah_member = new javax.swing.JButton();
        text_cari_produk = new javax.swing.JTextField();
        text_nama_produk = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_list_pembelian = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        text_jumlah = new javax.swing.JTextField();
        tombol_tambah = new javax.swing.JButton();
        text_total_belanja = new javax.swing.JTextField();
        text_diskon = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        text_total_bayar = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        text_kembalian = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        text_pembayaran = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tombol_tambah_barang = new javax.swing.JButton();
        tombol_hapus_list = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        text_id_member = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        tombol_cek = new javax.swing.JButton();
        text_kode_barang = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setText("Haii... ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        text_nama_kasir.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        text_nama_kasir.setText("yogaa");
        jPanel1.add(text_nama_kasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        text_waktu.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        text_waktu.setText("Rabu, 12 Maret 2023  ");
        jPanel1.add(text_waktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pink Grey White Illustration Pet Shop Business Logo (2).gif"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel10.setText("NOTA PRODUK");

        text_nota_produk.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        text_nota_produk.setMargin(new java.awt.Insets(2, 10, 2, 10));
        text_nota_produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nota_produkActionPerformed(evt);
            }
        });

        tombol_logout.setBackground(new java.awt.Color(255, 255, 255));
        tombol_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/log-out.png"))); // NOI18N
        tombol_logout.setFocusPainted(false);
        tombol_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_logoutActionPerformed(evt);
            }
        });

        idUser.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel10)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_nota_produk, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idUser))
                .addGap(280, 280, 280)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 644, Short.MAX_VALUE)
                .addComponent(tombol_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(idUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(text_nota_produk, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tombol_logout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 280));

        tombol_kurang.setBackground(new java.awt.Color(243, 248, 255));
        tombol_kurang.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        tombol_kurang.setText("-");
        tombol_kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_kurangActionPerformed(evt);
            }
        });
        jPanel1.add(tombol_kurang, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 830, 110, 50));

        tombol_cetak.setBackground(new java.awt.Color(26, 93, 26));
        tombol_cetak.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        tombol_cetak.setForeground(new java.awt.Color(255, 255, 255));
        tombol_cetak.setText("Cetak Nota");
        tombol_cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_cetakActionPerformed(evt);
            }
        });
        jPanel1.add(tombol_cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 780, 410, 60));

        tabel_list_produk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_list_produk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_list_produkMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_list_produk);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 500, 240));

        radio_nonmember.setBackground(new java.awt.Color(255, 255, 255));
        radioMember.add(radio_nonmember);
        radio_nonmember.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        radio_nonmember.setText("Non Member");
        radio_nonmember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_nonmemberActionPerformed(evt);
            }
        });
        jPanel1.add(radio_nonmember, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        text_nama_member.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        text_nama_member.setMargin(new java.awt.Insets(2, 10, 2, 10));
        text_nama_member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nama_memberActionPerformed(evt);
            }
        });
        jPanel1.add(text_nama_member, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 220, 50));

        satuan.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        satuan.setText("Satuan");
        jPanel1.add(satuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 840, -1, -1));

        radio_member.setBackground(new java.awt.Color(255, 255, 255));
        radioMember.add(radio_member);
        radio_member.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        radio_member.setText("Member");
        radio_member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_memberActionPerformed(evt);
            }
        });
        jPanel1.add(radio_member, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        tombol_tambah_member.setBackground(new java.awt.Color(247, 140, 62));
        tombol_tambah_member.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        tombol_tambah_member.setForeground(new java.awt.Color(255, 255, 255));
        tombol_tambah_member.setText("+ Member");
        tombol_tambah_member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_tambah_memberActionPerformed(evt);
            }
        });
        jPanel1.add(tombol_tambah_member, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 130, 50));

        text_cari_produk.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        text_cari_produk.setMargin(new java.awt.Insets(2, 10, 2, 10));
        text_cari_produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_cari_produkActionPerformed(evt);
            }
        });
        text_cari_produk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text_cari_produkKeyReleased(evt);
            }
        });
        jPanel1.add(text_cari_produk, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 500, 50));

        text_nama_produk.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        text_nama_produk.setMargin(new java.awt.Insets(2, 10, 2, 10));
        text_nama_produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nama_produkActionPerformed(evt);
            }
        });
        jPanel1.add(text_nama_produk, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 760, 500, 50));

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel12.setText("Membership");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel13.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jLabel13.setText("klik kolom yang akan dihapus !!!");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 330, -1, -1));

        tabel_list_pembelian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_list_pembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_list_pembelianMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel_list_pembelian);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 430, 470, 260));

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel14.setText("Produk");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        text_jumlah.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        text_jumlah.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_jumlah.setText("1");
        text_jumlah.setMargin(new java.awt.Insets(2, 10, 2, 10));
        text_jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_jumlahActionPerformed(evt);
            }
        });
        text_jumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text_jumlahKeyReleased(evt);
            }
        });
        jPanel1.add(text_jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 830, 110, 50));

        tombol_tambah.setBackground(new java.awt.Color(243, 248, 255));
        tombol_tambah.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        tombol_tambah.setText("+");
        tombol_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_tambahActionPerformed(evt);
            }
        });
        jPanel1.add(tombol_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 830, 110, 50));

        text_total_belanja.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        text_total_belanja.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_total_belanja.setMargin(new java.awt.Insets(2, 10, 2, 10));
        text_total_belanja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_total_belanjaActionPerformed(evt);
            }
        });
        jPanel1.add(text_total_belanja, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 710, 300, 50));

        text_diskon.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        text_diskon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_diskon.setMargin(new java.awt.Insets(2, 10, 2, 10));
        text_diskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_diskonActionPerformed(evt);
            }
        });
        jPanel1.add(text_diskon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 780, 300, 50));

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel18.setText("Total Belanja");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 720, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        text_total_bayar.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        text_total_bayar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_total_bayar.setMargin(new java.awt.Insets(2, 10, 2, 10));
        text_total_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_total_bayarActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel16.setText("TOTAL");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(text_total_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_total_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 850, 470, 110));

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        text_kembalian.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        text_kembalian.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_kembalian.setMargin(new java.awt.Insets(2, 10, 2, 10));
        text_kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_kembalianActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel19.setText("Kembali");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(text_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel19)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(text_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 530, 410, 180));

        text_pembayaran.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        text_pembayaran.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_pembayaran.setMargin(new java.awt.Insets(2, 10, 2, 10));
        text_pembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_pembayaranActionPerformed(evt);
            }
        });
        text_pembayaran.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text_pembayaranKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_pembayaranKeyTyped(evt);
            }
        });
        jPanel1.add(text_pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 430, 300, 50));

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel20.setText("LIST PEMBELIAN");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 360, -1, -1));

        tombol_tambah_barang.setBackground(new java.awt.Color(15, 33, 103));
        tombol_tambah_barang.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        tombol_tambah_barang.setForeground(new java.awt.Color(255, 255, 255));
        tombol_tambah_barang.setText("Tambahkan");
        tombol_tambah_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_tambah_barangActionPerformed(evt);
            }
        });
        jPanel1.add(tombol_tambah_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 900, 500, 60));

        tombol_hapus_list.setBackground(new java.awt.Color(183, 4, 4));
        tombol_hapus_list.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        tombol_hapus_list.setForeground(new java.awt.Color(255, 255, 255));
        tombol_hapus_list.setText("Hapus");
        tombol_hapus_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_hapus_listActionPerformed(evt);
            }
        });
        jPanel1.add(tombol_hapus_list, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 360, 110, 40));

        jLabel21.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel21.setText("TUNAI");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 440, -1, -1));

        jLabel23.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel23.setText("Diskon");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 790, -1, -1));

        text_id_member.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        text_id_member.setMargin(new java.awt.Insets(2, 10, 2, 10));
        text_id_member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_id_memberActionPerformed(evt);
            }
        });
        jPanel1.add(text_id_member, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 220, 50));

        jLabel24.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel24.setText("PEMBAYARAN");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 350, -1, -1));

        tombol_cek.setBackground(new java.awt.Color(243, 248, 255));
        tombol_cek.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        tombol_cek.setText("Cek");
        tombol_cek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_cekActionPerformed(evt);
            }
        });
        jPanel1.add(tombol_cek, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 130, 50));

        text_kode_barang.setText("jLabel1");
        jPanel1.add(text_kode_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 740, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_nota_produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nota_produkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nota_produkActionPerformed

    private void tombol_kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_kurangActionPerformed
        // TODO add your handling code here:
        kasirController.kurangJumlah();
    }//GEN-LAST:event_tombol_kurangActionPerformed

    private void tombol_cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_cetakActionPerformed
        try {
            kasirController.cetakNotaTransaksi();
            kasirController.generateNotaTransaksi();
            kasirController.clearKasirView();
        } catch (ParseException ex) {
            Logger.getLogger(KasirView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tombol_cetakActionPerformed

    private void text_nama_memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nama_memberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nama_memberActionPerformed

    private void radio_nonmemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_nonmemberActionPerformed
        kasirController.radioIsSelected();
    }//GEN-LAST:event_radio_nonmemberActionPerformed

    private void tombol_tambah_memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_tambah_memberActionPerformed
        AddMemberView amv = new AddMemberView();
        amv.setVisible(true);
    }//GEN-LAST:event_tombol_tambah_memberActionPerformed

    private void text_cari_produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_cari_produkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_cari_produkActionPerformed

    private void text_nama_produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nama_produkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nama_produkActionPerformed

    private void text_total_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_total_bayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_total_bayarActionPerformed

    private void text_jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_jumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_jumlahActionPerformed

    private void tombol_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_tambahActionPerformed
        // TODO add your handling code here:
        kasirController.tambahJumlah();
    }//GEN-LAST:event_tombol_tambahActionPerformed

    private void text_total_belanjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_total_belanjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_total_belanjaActionPerformed

    private void text_diskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_diskonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_diskonActionPerformed

    private void text_kembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_kembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_kembalianActionPerformed

    private void text_pembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_pembayaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_pembayaranActionPerformed

    private void tombol_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_logoutActionPerformed
        kasirController.logout();
    }//GEN-LAST:event_tombol_logoutActionPerformed
    
    private void tombol_tambah_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_tambah_barangActionPerformed
        Boolean bool = kasirController.isStringNull();
        if (bool){
            kasirController.addToTabelPembelian();
            refreshTableListPembelian();
            kasirController.setTotalBelanja();
            kasirController.setDiscount();
            kasirController.setTotal();
        }
    }//GEN-LAST:event_tombol_tambah_barangActionPerformed

    private void tombol_hapus_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_hapus_listActionPerformed
        kasirController.delete();
        refreshTableListPembelian();
        kasirController.setTotalBelanja();
        kasirController.setDiscount();
        kasirController.setTotal();
    }//GEN-LAST:event_tombol_hapus_listActionPerformed

    private void text_id_memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_id_memberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_id_memberActionPerformed

    private void tombol_cekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_cekActionPerformed
        Member dataMember = App.masterInterface.getByIdMember(text_id_member.getText());
        kasirController.setDataMember(dataMember);
    }//GEN-LAST:event_tombol_cekActionPerformed

    private void radio_memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_memberActionPerformed
        kasirController.radioIsSelected();
    }//GEN-LAST:event_radio_memberActionPerformed

    private void text_cari_produkKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_cari_produkKeyReleased
//        kasirController.refreshTabelBarang(App.masterInterface.getAllByLikeIdBarangOrName(text_cari_produk.getText()));
    }//GEN-LAST:event_text_cari_produkKeyReleased

    private void tabel_list_produkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_list_produkMouseClicked
        // TODO add your handling code here:
//        int row = tabel_list_produk.getSelectedRow();
//        kasirController.tampilData(row);
//        text_jumlah.setText("1");
    }//GEN-LAST:event_tabel_list_produkMouseClicked

    private void text_jumlahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_jumlahKeyReleased
        // TODO add your handling code here:
        kasirController.validasiJumlah();
    }//GEN-LAST:event_text_jumlahKeyReleased

    private void tabel_list_pembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_list_pembelianMouseClicked
        int row = tabel_list_pembelian.getSelectedRow();
        kasirController.selectedRowPembelian(row);
    }//GEN-LAST:event_tabel_list_pembelianMouseClicked

    private void text_pembayaranKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_pembayaranKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_text_pembayaranKeyTyped

    private void text_pembayaranKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_pembayaranKeyReleased
        // TODO add your handling code here:
        kasirController.setKembalian();
    }//GEN-LAST:event_text_pembayaranKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KasirView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KasirView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KasirView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KasirView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KasirView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel idUser;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup radioMember;
    private javax.swing.JRadioButton radio_member;
    private javax.swing.JRadioButton radio_nonmember;
    private javax.swing.JLabel satuan;
    private javax.swing.JTable tabel_list_pembelian;
    private javax.swing.JTable tabel_list_produk;
    private javax.swing.JTextField text_cari_produk;
    private javax.swing.JTextField text_diskon;
    private javax.swing.JTextField text_id_member;
    private javax.swing.JTextField text_jumlah;
    private javax.swing.JTextField text_kembalian;
    private javax.swing.JLabel text_kode_barang;
    private javax.swing.JLabel text_nama_kasir;
    private javax.swing.JTextField text_nama_member;
    private javax.swing.JTextField text_nama_produk;
    private javax.swing.JTextField text_nota_produk;
    private javax.swing.JTextField text_pembayaran;
    private javax.swing.JTextField text_total_bayar;
    private javax.swing.JTextField text_total_belanja;
    private javax.swing.JLabel text_waktu;
    private javax.swing.JButton tombol_cek;
    private javax.swing.JButton tombol_cetak;
    private javax.swing.JButton tombol_hapus_list;
    private javax.swing.JButton tombol_kurang;
    private javax.swing.JButton tombol_logout;
    private javax.swing.JButton tombol_tambah;
    private javax.swing.JButton tombol_tambah_barang;
    private javax.swing.JButton tombol_tambah_member;
    // End of variables declaration//GEN-END:variables
    public class ProdukTableModel extends AbstractTableModel{

        private List<Barang> listBarang = new ArrayList<>();
        private final String HEADER[] = {"KODE BARANG", "NAMA BARANG", "HARGA", "JENIS BARANG"};

        public ProdukTableModel(List<Barang> listBarang) {
            this.listBarang = listBarang;
        }
        
        @Override
        public int getRowCount() {
            return listBarang.size();
        }

        @Override
        public int getColumnCount() {
            return HEADER.length;
        }

        @Override
        public String getColumnName(int i) {
            return HEADER[i];
        }

        @Override
        public Object getValueAt(int i, int i1) {
            Barang b = listBarang.get(i);
            switch(i1){
                case 0:
                    return b.getKdBarang();
                case 1:
                    return b.getNamaBarang();
                case 2:
                    return b.getHarga();
                case 3:
                    return b.getKdJenis().getJenisBarang();
                default:
                    return null;
            }
        }
        
    }
        
        
    public class orderTableModel extends AbstractTableModel{

        private List<DetailTransaksi> listObjects = new ArrayList<>();
        private final String HEADER[] = {"KODE BARANG", "NAMA BARANG", "DISKON", "QTY", "SUB TOTAL"};

        public orderTableModel(List<DetailTransaksi> listObject) {
            this.listObjects = listObject;
        }
        
        @Override
        public int getRowCount() {
            return listObjects.size();
        }

        @Override
        public int getColumnCount() {
            return HEADER.length;
        }

        @Override
        public String getColumnName(int i) {
            return HEADER[i];
        }

        @Override
        public Object getValueAt(int i, int i1) {
            DetailTransaksi b = listObjects.get(i);
            switch(i1){
                case 0:
                    return b.getKdBarang().getKdBarang();
                case 1:
                    return b.getKdBarang().getNamaBarang();
                case 2:
                    return b.getDiskon();
                case 3:
                    return b.getJumlahBeli();
                case 4:
                    return b.getSubTotal();
                    
                default:
                    return null;
            }
        }
        
    }
}
