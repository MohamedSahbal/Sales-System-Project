/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programing.pkg62;

import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class thegame extends javax.swing.JFrame {

    /**
     * Creates new form thegame
     */
    public thegame() {
        initComponents();
        n2.setVisible(false);
        n3.setVisible(false);
        n4.setVisible(false);
        n5.setVisible(false);
        n6.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        j1 = new javax.swing.JLabel();
        y1 = new javax.swing.JButton();
        n1 = new javax.swing.JButton();
        n2 = new javax.swing.JButton();
        n3 = new javax.swing.JButton();
        n4 = new javax.swing.JButton();
        n5 = new javax.swing.JButton();
        n6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        j1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        j1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j1.setText("هل انت غبي؟!");
        j1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                j1MouseExited(evt);
            }
        });

        y1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        y1.setText("نعم");
        y1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                y1MouseClicked(evt);
            }
        });

        n1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        n1.setText("لا");
        n1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                n1MouseEntered(evt);
            }
        });

        n2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        n2.setText("لا");
        n2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                n2MouseEntered(evt);
            }
        });

        n3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        n3.setText("لا");
        n3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                n3MouseEntered(evt);
            }
        });

        n4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        n4.setText("لا");
        n4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                n4MouseEntered(evt);
            }
        });

        n5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        n5.setText("لا");
        n5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                n5MouseEntered(evt);
            }
        });

        n6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        n6.setText("لا");
        n6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                n6MouseEntered(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(462, 462, 462))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(479, 479, 479))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(416, 416, 416))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(j1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(y1)
                    .addComponent(n1))
                .addGap(26, 26, 26)
                .addComponent(n2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(n6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(n3)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n5)
                    .addComponent(n4))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void n1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n1MouseEntered
        // TODO add your handling code here:
        n1.setVisible(false);
        n2.setVisible(true);
    }//GEN-LAST:event_n1MouseEntered

    private void n2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n2MouseEntered
        // TODO add your handling code here:
        n2.setVisible(false);
        n3.setVisible(true);
    }//GEN-LAST:event_n2MouseEntered

    private void n3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n3MouseEntered
        // TODO add your handling code here:
        n3.setVisible(false);
        n4.setVisible(true);
    }//GEN-LAST:event_n3MouseEntered

    private void n4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n4MouseEntered
        // TODO add your handling code here:
        n4.setVisible(false);
        n5.setVisible(true);
    }//GEN-LAST:event_n4MouseEntered

    private void n5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n5MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_n5MouseClicked

    private void n5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n5MouseEntered
        // TODO add your handling code here:
        n5.setVisible(false);
        n6.setVisible(true);
    }//GEN-LAST:event_n5MouseEntered

    private void n6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n6MouseEntered
        // TODO add your handling code here:
        n6.setVisible(false);
        n1.setVisible(true);
    }//GEN-LAST:event_n6MouseEntered

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"بتحاول تهرب مني يا غبي...انا هسيبك تهرب يا غبي");
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void y1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_y1MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "شكرا لاعترافك.....سلام");
        this.dispose();
    }//GEN-LAST:event_y1MouseClicked

    private void j1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j1MouseEntered
        // TODO add your handling code here:
        j1.setText("لو عايز تهرب اضغط هنا");
    }//GEN-LAST:event_j1MouseEntered

    private void j1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j1MouseExited
        // TODO add your handling code here:
        j1.setText("هل انت غبي؟!");
    }//GEN-LAST:event_j1MouseExited

    private void j1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j1MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "علشان تعرف اني قلبي طيب هسيبك تهرب");
        this.dispose();
    }//GEN-LAST:event_j1MouseClicked

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
            java.util.logging.Logger.getLogger(thegame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(thegame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(thegame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(thegame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new thegame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel j1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton n1;
    private javax.swing.JButton n2;
    private javax.swing.JButton n3;
    private javax.swing.JButton n4;
    private javax.swing.JButton n5;
    private javax.swing.JButton n6;
    private javax.swing.JButton y1;
    // End of variables declaration//GEN-END:variables
}