/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form_login;

import com.mysql.jdbc.Statement;
import javax.swing.JOptionPane;
import koneksi.conek;

/**
 *
 * @author DELL
 */
public class formregistrasi extends javax.swing.JFrame {

    /**
     * Creates new form formregistrasi
     */
    public formregistrasi() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        USERNAMEREG = new javax.swing.JLabel();
        ISIANUSERNAMEREG = new javax.swing.JTextField();
        PASSWORDREG = new javax.swing.JLabel();
        ISIANPASSWORDREG = new javax.swing.JTextField();
        LOGINREG = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("FORM REGISTRASI");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 11, -1, -1));

        USERNAMEREG.setText("USERNAME : ");
        jPanel1.add(USERNAMEREG, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        jPanel1.add(ISIANUSERNAMEREG, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 118, -1));

        PASSWORDREG.setText("PASSWORD : ");
        jPanel1.add(PASSWORDREG, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        ISIANPASSWORDREG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISIANPASSWORDREGActionPerformed(evt);
            }
        });
        jPanel1.add(ISIANPASSWORDREG, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 120, -1));

        LOGINREG.setText("LOGIN");
        LOGINREG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINREGActionPerformed(evt);
            }
        });
        jPanel1.add(LOGINREG, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LOGINREGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINREGActionPerformed
 String username = ISIANUSERNAMEREG.getText();
String password = ISIANPASSWORDREG.getText();

try{
Statement statement = (Statement) conek.GetConnection().createStatement();
statement.executeUpdate("insert into tabellogin VALUES ('" + username +"','"+ password +"');");
statement.close ();
JOptionPane.showMessageDialog(null, "data berhasil disimpan");
       new fromlogin().show();
        this.dispose();
}catch (Exception t){
JOptionPane.showMessageDialog(null, "data gagal disimpan");
}         // TODO add your handling code here:
    }//GEN-LAST:event_LOGINREGActionPerformed

    private void ISIANPASSWORDREGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISIANPASSWORDREGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ISIANPASSWORDREGActionPerformed

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
            java.util.logging.Logger.getLogger(formregistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formregistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formregistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formregistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formregistrasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ISIANPASSWORDREG;
    private javax.swing.JTextField ISIANUSERNAMEREG;
    private javax.swing.JButton LOGINREG;
    private javax.swing.JLabel PASSWORDREG;
    private javax.swing.JLabel USERNAMEREG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
