/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controllers.AdminController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.AbstractTableModel;
import main.App;
import models.Barang;
import models.MasterBarang;

/**
 *
 * @author asus
 */
public class AdminView extends javax.swing.JFrame {

    /**
     * Creates new form KasirView1
     * @return 
     */
    
    private final AdminController adminController;
    private final Barang barang;
    private final MasterBarang jenis;
    private List<Barang> listBarang;
    
    public AdminView() {
        initComponents();
        setTextWaktu();
        adminController = new AdminController(this);
        barang = new Barang();
        jenis = new MasterBarang();
        adminController.loadComboBox();
        adminController.enableTombol();
        refreshTable();
        initListener();
    }
        
    public void setText_nama_admin(String nama){
        this.text_nama_admin.setText(nama);
    }
    
    public final void setTextWaktu(){
        this.text_waktu.setText(helpers.Helpers.setTime());
    }

    public JComboBox<String> getCombo_jenis_produk() {
        return combo_jenis_produk;
    }

    public void setCombo_jenis_produk(JComboBox<String> combo_jenis_produk) {
        this.combo_jenis_produk = combo_jenis_produk;
    }

    public JTable getTabel_list_produk() {
        return tabel_list_produk;
    }

    public void setTabel_list_produk(JTable tabel_list_produk) {
        this.tabel_list_produk = tabel_list_produk;
    }

    public JTextField getText_harga_jual() {
        return text_harga_jual;
    }

    public void setText_harga_jual(JTextField text_harga_jual) {
        this.text_harga_jual = text_harga_jual;
    }

    public JTextField getText_jumlah_stok() {
        return text_jumlah_stok;
    }

    public void setText_jumlah_stok(JTextField text_jumlah_stok) {
        this.text_jumlah_stok = text_jumlah_stok;
    }

    public JTextField getText_kode_produk() {
        return text_kode_produk;
    }

    public void setText_kode_produk(JTextField text_kode_produk) {
        this.text_kode_produk = text_kode_produk;
    }

    public JTextField getText_nama_produk() {
        return text_nama_produk;
    }

    public void setText_nama_produk(JTextField text_nama_produk) {
        this.text_nama_produk = text_nama_produk;
    }

    public JButton getTombol_tambah_produk() {
        return tombol_tambah_produk;
    }

    public void setTombol_tambah_produk(JButton tombol_tambah_produk) {
        this.tombol_tambah_produk = tombol_tambah_produk;
    }
    
    private void refreshTable(){
        listBarang = App.masterInterface.getAllBarang();
        tabel_list_produk.setModel(new ProdukTableModel(listBarang));
    }
    
    private void initListener(){
        tabel_list_produk.getSelectionModel().addListSelectionListener((ListSelectionEvent lse) -> {
            this.adminController.loadData(barang, listBarang);
        });
    }

    public JButton getTombol_hapus_produk() {
        return tombol_hapus_produk;
    }

    public void setTombol_hapus_produk(JButton tombol_hapus_produk) {
        this.tombol_hapus_produk = tombol_hapus_produk;
    }

    public JButton getTombol_update_produk() {
        return tombol_update_produk;
    }

    public void setTombol_update_produk(JButton tombol_update_produk) {
        this.tombol_update_produk = tombol_update_produk;
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
        text_nama_admin = new javax.swing.JLabel();
        text_waktu = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tombol_logout = new javax.swing.JButton();
        text_jumlah_stok = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_list_produk = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        tombol_update_produk = new javax.swing.JButton();
        tombol_hapus_produk = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        text_kode_produk = new javax.swing.JTextField();
        text_nama_produk = new javax.swing.JTextField();
        text_harga_jual = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        combo_jenis_produk = new javax.swing.JComboBox<>();
        tombol_tambah_produk = new javax.swing.JButton();
        tombol_clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setText("Haii... ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        text_nama_admin.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        text_nama_admin.setText("yogaa");
        jPanel1.add(text_nama_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        text_waktu.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        text_waktu.setText("Rabu, 12 Maret 2023   19 : 12");
        jPanel1.add(text_waktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pink Grey White Illustration Pet Shop Business Logo (2).gif"))); // NOI18N

        tombol_logout.setBackground(new java.awt.Color(255, 255, 255));
        tombol_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/log-out.png"))); // NOI18N
        tombol_logout.setFocusPainted(false);
        tombol_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(967, 967, 967)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 619, Short.MAX_VALUE)
                .addComponent(tombol_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tombol_logout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 280));

        text_jumlah_stok.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        text_jumlah_stok.setMargin(new java.awt.Insets(2, 10, 2, 10));
        text_jumlah_stok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_jumlah_stokActionPerformed(evt);
            }
        });
        jPanel1.add(text_jumlah_stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 730, 430, 50));

        jLabel13.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jLabel13.setText("klik kolom  untuk menyelekasi data !!!");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 400, -1, -1));

        tabel_list_produk.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel_list_produk.setEditingColumn(0);
        tabel_list_produk.setEditingRow(0);
        tabel_list_produk.setIntercellSpacing(new java.awt.Dimension(4, 4));
        tabel_list_produk.setRowHeight(20);
        tabel_list_produk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_list_produkMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel_list_produk);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 440, 770, -1));

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel14.setText("Jenis Barang");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, -1, -1));

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel20.setText("DATA BARANG");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        tombol_update_produk.setBackground(new java.awt.Color(15, 33, 103));
        tombol_update_produk.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        tombol_update_produk.setForeground(new java.awt.Color(255, 255, 255));
        tombol_update_produk.setText("Update");
        tombol_update_produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_update_produkActionPerformed(evt);
            }
        });
        jPanel1.add(tombol_update_produk, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 900, 210, 60));

        tombol_hapus_produk.setBackground(new java.awt.Color(183, 4, 4));
        tombol_hapus_produk.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        tombol_hapus_produk.setForeground(new java.awt.Color(255, 255, 255));
        tombol_hapus_produk.setText("Hapus");
        tombol_hapus_produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_hapus_produkActionPerformed(evt);
            }
        });
        jPanel1.add(tombol_hapus_produk, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 900, 210, 60));

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel15.setText("Kode Produk");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, -1));

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel17.setText("Nama Produk");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, -1, -1));

        jLabel22.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel22.setText("Harga Jual");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 830, -1, -1));

        jLabel25.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel25.setText("Jumlah Stok");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 740, -1, -1));

        text_kode_produk.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        text_kode_produk.setMargin(new java.awt.Insets(2, 10, 2, 10));
        text_kode_produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_kode_produkActionPerformed(evt);
            }
        });
        jPanel1.add(text_kode_produk, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 430, 50));

        text_nama_produk.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        text_nama_produk.setMargin(new java.awt.Insets(2, 10, 2, 10));
        text_nama_produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nama_produkActionPerformed(evt);
            }
        });
        jPanel1.add(text_nama_produk, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 430, 50));

        text_harga_jual.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        text_harga_jual.setMargin(new java.awt.Insets(2, 10, 2, 10));
        text_harga_jual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_harga_jualActionPerformed(evt);
            }
        });
        jPanel1.add(text_harga_jual, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 820, 430, 50));

        jLabel26.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel26.setText("LIST PRODUK");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 370, -1, -1));

        combo_jenis_produk.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jPanel1.add(combo_jenis_produk, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, 210, 50));

        tombol_tambah_produk.setBackground(new java.awt.Color(26, 93, 26));
        tombol_tambah_produk.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        tombol_tambah_produk.setForeground(new java.awt.Color(255, 255, 255));
        tombol_tambah_produk.setText("Tambahkan");
        tombol_tambah_produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_tambah_produkActionPerformed(evt);
            }
        });
        jPanel1.add(tombol_tambah_produk, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 900, 210, 60));

        tombol_clear.setBackground(new java.awt.Color(240, 236, 229));
        tombol_clear.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        tombol_clear.setText("Clear");
        tombol_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_clearActionPerformed(evt);
            }
        });
        jPanel1.add(tombol_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 390, 100, 50));

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

    private void text_jumlah_stokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_jumlah_stokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_jumlah_stokActionPerformed

    private void tombol_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_logoutActionPerformed
        adminController.logout();
    }//GEN-LAST:event_tombol_logoutActionPerformed

    private void tombol_update_produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_update_produkActionPerformed
       
        if(adminController.inputValidation()){
            barang.setKdBarang(text_kode_produk.getText());
            barang.setNamaBarang(text_nama_produk.getText());
            barang.setStok(Integer.parseInt(text_jumlah_stok.getText()));
            barang.setHarga(Integer.parseInt(text_harga_jual.getText()));
            barang.setKdJenis(App.masterInterface.getMasterBarangByName(combo_jenis_produk.getSelectedItem().toString()));

            App.masterInterface.updateBarang(barang);
            JOptionPane.showMessageDialog(this, "Barang berhasil diubah !", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            adminController.clearForm();
            refreshTable();
        }
    }//GEN-LAST:event_tombol_update_produkActionPerformed

    private void tombol_hapus_produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_hapus_produkActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menhapus item tersebut ?", "konfirmasi hapus produk",JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if(input == 0){
            App.masterInterface.deleteBarang(text_kode_produk.getText());
            adminController.clearForm();
            refreshTable();
        }
    }//GEN-LAST:event_tombol_hapus_produkActionPerformed

    private void text_kode_produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_kode_produkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_kode_produkActionPerformed

    private void text_nama_produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nama_produkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nama_produkActionPerformed

    private void text_harga_jualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_harga_jualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_harga_jualActionPerformed

    private void tombol_tambah_produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_tambah_produkActionPerformed

        if(adminController.inputValidation()){
            barang.setKdBarang(text_kode_produk.getText());
            barang.setNamaBarang(text_nama_produk.getText());
            barang.setStok(Integer.parseInt(text_jumlah_stok.getText()));
            barang.setHarga(Integer.parseInt(text_harga_jual.getText()));
            barang.setKdJenis(App.masterInterface.getMasterBarangByName(combo_jenis_produk.getSelectedItem().toString()));

            App.masterInterface.saveBarang(barang);
            JOptionPane.showMessageDialog(this, "Barang berhasil ditambahkan !", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            refreshTable();
            adminController.clearForm();
        }
        
    }//GEN-LAST:event_tombol_tambah_produkActionPerformed

    private void tabel_list_produkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_list_produkMouseClicked

    }//GEN-LAST:event_tabel_list_produkMouseClicked

    private void tombol_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_clearActionPerformed
        adminController.clearForm();
    }//GEN-LAST:event_tombol_clearActionPerformed

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
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_jenis_produk;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup radioMember;
    private javax.swing.JTable tabel_list_produk;
    private javax.swing.JTextField text_harga_jual;
    private javax.swing.JTextField text_jumlah_stok;
    private javax.swing.JTextField text_kode_produk;
    private javax.swing.JLabel text_nama_admin;
    private javax.swing.JTextField text_nama_produk;
    private javax.swing.JLabel text_waktu;
    private javax.swing.JButton tombol_clear;
    private javax.swing.JButton tombol_hapus_produk;
    private javax.swing.JButton tombol_logout;
    private javax.swing.JButton tombol_tambah_produk;
    private javax.swing.JButton tombol_update_produk;
    // End of variables declaration//GEN-END:variables
        public class ProdukTableModel extends AbstractTableModel{

        private List<Barang> listBarang = new ArrayList<>();
        private final String HEADER[] = {"KODE BARANG", "NAMA BARANG", "HARGA", "STOK", "JENIS BARANG"};

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
                    return b.getStok();
                case 4:
                    return b.getKdJenis().getJenisBarang();
                default:
                    return null;
            }
        }
        
    }
}
