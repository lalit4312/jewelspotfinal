
package View;

import database.DbConnection;
public class compalin extends javax.swing.JFrame {
    public compalin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        detail = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(894, 6, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 100, 70));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton3.setText("Home");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 6, 114, 47));

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton4.setText("Contact Us");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 6, -1, 47));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("File a Complaint against Jewellery");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 430, 110));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Title of your complaint");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 231, 44));
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 375, 207, 48));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Complaint details");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 221, 44));

        detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailActionPerformed(evt);
            }
        });
        getContentPane().add(detail, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 244, 93));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton2.setText("Proflie");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 6, 114, 47));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\ok\\src\\View\\dashboardimage.jpg")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_detailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DbConnection dbConnection;
        String title1=title.getText();
        String detail1=detail.getText();
        String insertQuery=String.format("INSERT INTO complain VALUES('%s','%s')",title1,detail1);
        dbConnection = new DbConnection();
        int  result = dbConnection.manipulate(insertQuery);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new compalin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField detail;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField title;
    // End of variables declaration//GEN-END:variables
}
