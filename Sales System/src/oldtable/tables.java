/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oldtable;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import programing.pkg62.fun;

/**
 *
 * @author pc
 */
public class tables extends javax.swing.JFrame {

    /**
     * Creates new form tables
     */
    public tables() {
        initComponents();
        fun.loading(table);
        
        fun.tdesign(table, sc);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sc = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "تاريخ الميلاد", "العنوان", "الهاتف", "المرتب", "الوظيفه", "الاسم"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(25);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        sc.setViewportView(table);

        getContentPane().add(sc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 276, 1027, 295));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("التفاصيل");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 70, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-button-75.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("اضافه");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 220, 70, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-button-75.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 214, -1, 40));

        t1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 80, 125, -1));

        t3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 125, -1));

        t4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 150, 125, -1));

        t5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 125, -1));

        t6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 125, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("الاسم");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("الوظيفه");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("المرتب");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("الهاتف");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("العنوان");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("تاريخ الميلاد");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        t2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        t2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "مهندس", "محاسب", "موظف", "سيكرتاريه", "شئون قانونيه", "شئون عاملين", "مدير قسم", "مدير عام" }));
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 125, -1));

        jButton2.setText("حذف");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, -1, -1));

        jButton3.setText("التحديث");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-refresh-45 (1).png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, -1, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-close-45.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 10, -1, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-add-60.png"))); // NOI18N
        jLabel12.setText("اضافه");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tab.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        try{
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        model.removeRow(table.getSelectedRow());
        
        clear();
        fun.saving(table);}
        catch(java.lang.ArrayIndexOutOfBoundsException e){JOptionPane.showMessageDialog(this, "يجب ان اتختار صف");}
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        try{
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        model.setValueAt(t1.getText(), table.getSelectedRow(), 5);
        model.setValueAt(t2.getSelectedItem().toString(), table.getSelectedRow(), 4);
        model.setValueAt(t3.getText(), table.getSelectedRow(), 3);
        model.setValueAt(t4.getText(), table.getSelectedRow(), 2);
        model.setValueAt(t5.getText(), table.getSelectedRow(), 1);
        model.setValueAt(t6.getText(), table.getSelectedRow(), 0);
        
        clear();
        fun.saving(table);
        }
        catch(java.lang.ArrayIndexOutOfBoundsException e){JOptionPane.showMessageDialog(this, "يجب ان تختار صف");}
    }//GEN-LAST:event_jButton3MouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        t6.setText(model.getValueAt(table.getSelectedRow(), 0).toString());
        t5.setText(model.getValueAt(table.getSelectedRow(), 1).toString());
        t4.setText(model.getValueAt(table.getSelectedRow(), 2).toString());
        t3.setText(model.getValueAt(table.getSelectedRow(), 3).toString());
        t2.setSelectedItem(model.getValueAt(table.getSelectedRow(), 4).toString());
        t1.setText(model.getValueAt(table.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
             DefaultTableModel model =(DefaultTableModel) table.getModel();
        try{
        if(Integer.parseInt(t3.getText())<=10000 && t4.getText().length()==11 && t4.getText().startsWith("010") ){
        model.addRow(new Object[]{t6.getText(), t5.getText(), t4.getText(), t3.getText(), t2.getSelectedItem().toString(), t1.getText()});
        
        clear();
        fun.saving(table);
        }
        else{JOptionPane.showMessageDialog(this, "يوجد مخالفه لفواعد الادخال");}
        }
        catch(java.lang.NumberFormatException h){JOptionPane.showMessageDialog(this, "قيمه المرتب خاطئه");}
        
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        // TODO add your handling code here:
        jLabel11.setForeground(Color.MAGENTA);
        
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        // TODO add your handling code here:
        jLabel11.setForeground(Color.white);
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        new details().setVisible(true);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        details.t6.setText(model.getValueAt(table.getSelectedRow(), 0).toString());
        details.t5.setText(model.getValueAt(table.getSelectedRow(), 1).toString());
        details.t4.setText(model.getValueAt(table.getSelectedRow(), 2).toString());
        details.t3.setText(model.getValueAt(table.getSelectedRow(), 3).toString());
        details.t2.setSelectedItem(model.getValueAt(table.getSelectedRow(), 4).toString());
        details.t1.setText(model.getValueAt(table.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseExited

    private void clear(){
    
        t1.setText("");
        t2.setSelectedItem(" ");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
    
    }
    
  
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
            java.util.logging.Logger.getLogger(tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tables().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane sc;
    private javax.swing.JTextField t1;
    private javax.swing.JComboBox<String> t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
