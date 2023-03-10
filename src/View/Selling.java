/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import javax.swing.JOptionPane;
import database.DbConnection;

/**
 *
 * @author lucif
 */
public class Selling extends javax.swing.JFrame {
    /**
     * Creates new form Selling
     */
    public Selling() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        date = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        cont = new javax.swing.JTextField();
        loc = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        ContactUs = new javax.swing.JButton();
        Profile = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        BuyNow = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        date.setBackground(new java.awt.Color(204, 204, 204));
        date.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        date.setText("          YY/MM/DD");
        date.setBorder(null);
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 220, 30));

        jTextField5.setBackground(new java.awt.Color(234, 233, 233));
        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("Contact No:");
        jTextField5.setBorder(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 140, 30));

        jTextField4.setBackground(new java.awt.Color(234, 233, 233));
        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("Location:");
        jTextField4.setBorder(null);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 140, 30));

        cont.setBackground(new java.awt.Color(204, 204, 204));
        cont.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        cont.setBorder(null);
        cont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contActionPerformed(evt);
            }
        });
        getContentPane().add(cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 220, 30));

        loc.setBackground(new java.awt.Color(204, 204, 204));
        loc.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        loc.setBorder(null);
        loc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locActionPerformed(evt);
            }
        });
        getContentPane().add(loc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 220, 30));

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField1.setText("Delievery Date  :");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 140, 30));

        jButton10.setBackground(java.awt.Color.lightGray);
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/backimage-removebg-preview.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 40, 40));

        ContactUs.setBackground(new java.awt.Color(204, 204, 204));
        ContactUs.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ContactUs.setText("Contact Us");
        ContactUs.setToolTipText("");
        ContactUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactUsActionPerformed(evt);
            }
        });
        getContentPane().add(ContactUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 190, 50));

        Profile.setBackground(new java.awt.Color(204, 204, 204));
        Profile.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Profile.setText("Profile");
        Profile.setToolTipText("");
        Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileActionPerformed(evt);
            }
        });
        getContentPane().add(Profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 140, 50));

        Home.setBackground(new java.awt.Color(204, 204, 204));
        Home.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Home.setText("Home");
        Home.setToolTipText("");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 50));

        BuyNow.setBackground(new java.awt.Color(255, 153, 102));
        BuyNow.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        BuyNow.setText("Buy Now");
        BuyNow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        BuyNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyNowActionPerformed(evt);
            }
        });
        getContentPane().add(BuyNow, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 150, 50));

        Cancel.setBackground(new java.awt.Color(255, 153, 102));
        Cancel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        Cancel.setText("Cancel");
        Cancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        getContentPane().add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 140, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\final abs\\Jewel-pot\\src\\View\\dashboardimage.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelActionPerformed

    private void BuyNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyNowActionPerformed
        // TODO add your handling code here:
        if (loc.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Please fill out required details");
        }
        else if(date.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please fill out required details");
        } 
        else if(cont.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please fill out required details");
        } 
        else{
            paying_method pay = new paying_method();
            pay.setVisible(true);
            this.setVisible(false);
            DbConnection dbConnection;
            String location=loc.getText();
            String dat=date.getText();
            String conta=cont.getText();
            String insertQuery=String.format("INSERT INTO sell VALUES('%s','%s','%s')",location,dat,conta);
            dbConnection = new DbConnection();
            int  result = dbConnection.manipulate(insertQuery);
//            JOptionPane.showMessageDialog(null,"Purchase Confirmed!!");      
        }
        
    }//GEN-LAST:event_BuyNowActionPerformed
    
    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeActionPerformed

    private void ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProfileActionPerformed

    private void ContactUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactUsActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void locActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locActionPerformed

    private void contActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        AddJewel jew = new AddJewel();
        jew.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuyNow;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton ContactUs;
    private javax.swing.JButton Home;
    private javax.swing.JButton Profile;
    private javax.swing.JTextField cont;
    private javax.swing.JTextField date;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField loc;
    // End of variables declaration//GEN-END:variables
}
