/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controllers.AddMemberController;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import main.App;
import models.Member;

/**
 *
 * @author asus
 */
public class AddMemberView extends javax.swing.JFrame {

    
    /**
     * Creates new form KasirView1
     */
    
    private final AddMemberController addMemberController;
    
    private final Member member;
    
    public AddMemberView() {
        initComponents();
        member = new Member();
        addMemberController = new AddMemberController(this);
    }

    public JLabel getjLabel15() {
        return jLabel15;
    }

    public void setjLabel15(JLabel jLabel15) {
        this.jLabel15 = jLabel15;
    }

    public JLabel getjLabel16() {
        return jLabel16;
    }

    public void setjLabel16(JLabel jLabel16) {
        this.jLabel16 = jLabel16;
    }

    public JLabel getjLabel17() {
        return jLabel17;
    }

    public void setjLabel17(JLabel jLabel17) {
        this.jLabel17 = jLabel17;
    }

    public JLabel getjLabel20() {
        return jLabel20;
    }

    public void setjLabel20(JLabel jLabel20) {
        this.jLabel20 = jLabel20;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public ButtonGroup getRadioMember() {
        return radioMember;
    }

    public void setRadioMember(ButtonGroup radioMember) {
        this.radioMember = radioMember;
    }

    public JTextField getText_id_member() {
        return text_id_member;
    }

    public void setText_id_member(JTextField text_id_member) {
        this.text_id_member = text_id_member;
    }

    public JTextField getText_nama_member() {
        return text_nama_member;
    }

    public void setText_nama_member(JTextField text_nama_member) {
        this.text_nama_member = text_nama_member;
    }

    public JTextField getText_nomor_hp() {
        return text_nomor_hp;
    }

    public void setText_nomor_hp(JTextField text_nomor_hp) {
        this.text_nomor_hp = text_nomor_hp;
    }

    public JButton getTombol_logout() {
        return tombol_logout;
    }

    public void setTombol_logout(JButton tombol_logout) {
        this.tombol_logout = tombol_logout;
    }

    public JButton getTombol_tambah_member() {
        return tombol_tambah_member;
    }

    public void setTombol_tambah_member(JButton tombol_tambah_member) {
        this.tombol_tambah_member = tombol_tambah_member;
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
        text_nomor_hp = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        text_id_member = new javax.swing.JTextField();
        text_nama_member = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tombol_tambah_member = new javax.swing.JButton();
        tombol_logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text_nomor_hp.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        text_nomor_hp.setMargin(new java.awt.Insets(2, 10, 2, 10));
        text_nomor_hp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nomor_hpActionPerformed(evt);
            }
        });
        jPanel1.add(text_nomor_hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 430, 50));

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel20.setText("FORM TAMBAH MEMBER");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel15.setText("Nomor_HP");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        text_id_member.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        text_id_member.setMargin(new java.awt.Insets(2, 10, 2, 10));
        text_id_member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_id_memberActionPerformed(evt);
            }
        });
        jPanel1.add(text_id_member, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 430, 50));

        text_nama_member.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        text_nama_member.setMargin(new java.awt.Insets(2, 10, 2, 10));
        text_nama_member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nama_memberActionPerformed(evt);
            }
        });
        jPanel1.add(text_nama_member, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 430, 50));

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel16.setText("ID Member");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel17.setText("Nama Member");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        tombol_tambah_member.setBackground(new java.awt.Color(26, 93, 26));
        tombol_tambah_member.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        tombol_tambah_member.setForeground(new java.awt.Color(255, 255, 255));
        tombol_tambah_member.setText("Tambah Member");
        tombol_tambah_member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_tambah_memberActionPerformed(evt);
            }
        });
        jPanel1.add(tombol_tambah_member, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 590, 210, 60));

        tombol_logout.setBackground(new java.awt.Color(255, 255, 255));
        tombol_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back-button.png"))); // NOI18N
        tombol_logout.setFocusPainted(false);
        tombol_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_logoutActionPerformed(evt);
            }
        });
        jPanel1.add(tombol_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 100, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tombol_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_logoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_tombol_logoutActionPerformed

    private void text_nomor_hpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nomor_hpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nomor_hpActionPerformed

    private void text_id_memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_id_memberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_id_memberActionPerformed

    private void text_nama_memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nama_memberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nama_memberActionPerformed

    private void tombol_tambah_memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_tambah_memberActionPerformed
        // TODO add your handling code here:
        member.setIdMember(text_id_member.getText());
        member.setNama(text_nama_member.getText());
        member.setNomorHP(text_nomor_hp.getText());
        
        App.masterInterface.saveMember(member);
        JOptionPane.showMessageDialog(this, "Member berhasil di tambahkan");
        addMemberController.clearForm();
    }//GEN-LAST:event_tombol_tambah_memberActionPerformed

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
            java.util.logging.Logger.getLogger(AddMemberView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMemberView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMemberView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMemberView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMemberView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.ButtonGroup radioMember;
    private javax.swing.JTextField text_id_member;
    private javax.swing.JTextField text_nama_member;
    private javax.swing.JTextField text_nomor_hp;
    private javax.swing.JButton tombol_logout;
    private javax.swing.JButton tombol_tambah_member;
    // End of variables declaration//GEN-END:variables

}
