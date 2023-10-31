/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class aplikasiPertambahanDuaAngka extends javax.swing.JFrame {

    /**
     * Creates new form aplikasiPertambahanDuaAngka
     */
    public aplikasiPertambahanDuaAngka() {
        initComponents();
        setLocationRelativeTo(this);
        this.setTitle("Aplikasi Pertambahan Dua Angka");
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        btnProses = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tfhasil = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbbx = new javax.swing.JComboBox<>();
        lbl4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(153, 255, 204));
        panel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnProses.setText("Proses");
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        lbl1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl1.setText("Angka Pertama : ");

        lbl2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl2.setText("Angka Kedua :");

        lbl3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl3.setText("Hasil :");

        tf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf1KeyTyped(evt);
            }
        });

        tfhasil.setEditable(false);
        tfhasil.setFocusable(false);

        tf2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf2KeyTyped(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 204, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 0));
        jLabel1.setText("APLIKASI PERTAMBAHAN  DUA ANGKA");

        cbbx.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "*", "/" }));
        cbbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbxActionPerformed(evt);
            }
        });

        lbl4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl4.setText("OPRATOR :");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(lbl1))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl2)
                                    .addComponent(lbl3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbl4)))
                        .addGap(26, 26, 26)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(tfhasil, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(tf2, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(cbbx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnProses)
                .addGap(18, 18, 18)
                .addComponent(btnHapus)
                .addGap(18, 18, 18)
                .addComponent(btnKeluar)
                .addGap(73, 73, 73))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl3)
                    .addComponent(tfhasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProses)
                    .addComponent(btnKeluar)
                    .addComponent(btnHapus))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      
    }//GEN-LAST:event_formWindowActivated

    private void tf2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf2KeyTyped
        char c= evt.getKeyChar();
        if(! ((Character.isDigit(c)) ||
            ( c== KeyEvent.VK_BACK_SPACE)
            || (c== KeyEvent.VK_DELETE)
        ))
        {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "masukan anga 1-9");
            evt.consume();
        }
    }//GEN-LAST:event_tf2KeyTyped

    private void tf1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyTyped
        char c= evt.getKeyChar();
        if(! ((Character.isDigit(c)) ||
            ( c== KeyEvent.VK_BACK_SPACE)
            || (c== KeyEvent.VK_DELETE)
        ))
        {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "masukan angka 1-9");
            evt.consume();
        }
    }//GEN-LAST:event_tf1KeyTyped

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed

        int respon = JOptionPane.showConfirmDialog(this,"apakah anda yakin untuk keluar","konfirmasi",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE );
        if (respon==JOptionPane.YES_OPTION) {
            System.exit(0);

        }
        else{
            //            JOptionPane.showMessageDialog(null, "oke");
        }

    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        cbbx.actionPerformed(null);
        tf1.setText("");
        tf2.setText("");
        tfhasil.setText("");
        tf1.requestFocus();
        
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
        int a,b,h;

        a=Integer.parseInt(tf1.getText());
        b=Integer.parseInt(tf2.getText());
        
        if (cbbx.getSelectedItem().equals("+")) {
            
            h=a+b;                      
            
            tfhasil.setText(Integer.toString(h));
        }
        if (cbbx.getSelectedItem().equals("-")) {
            
            h=a-b;
            tfhasil.setText(Integer.toString(h));
            
        }
        if (cbbx.getSelectedItem().equals("*")) {
            h=a*b;
            tfhasil.setText(Integer.toString(h));
            
        }
        if (cbbx.getSelectedItem().equals("/")) {
            double ap,ak,hs;
            ap=Double.parseDouble(tf1.getText());
            ak=Double.parseDouble(tf2.getText());
            
            hs=ap/ak;
            tfhasil.setText(Double.toString(hs));
        }

    }//GEN-LAST:event_btnProsesActionPerformed

    private void cbbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbxActionPerformed

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
            java.util.logging.Logger.getLogger(aplikasiPertambahanDuaAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aplikasiPertambahanDuaAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aplikasiPertambahanDuaAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aplikasiPertambahanDuaAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aplikasiPertambahanDuaAngka().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnProses;
    private javax.swing.JComboBox<String> cbbx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private java.awt.Panel panel1;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tfhasil;
    // End of variables declaration//GEN-END:variables
}
