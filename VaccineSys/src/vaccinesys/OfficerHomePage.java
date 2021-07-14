/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccinesys;

/**
 *
 * @author Umayanga
 */
public class OfficerHomePage extends javax.swing.JFrame {

    /**
     * Creates new form OfficerHomePage
     */
    public OfficerHomePage() {
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
        SendMail = new javax.swing.JButton();
        topic = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        CreateUser1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Officer");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SendMail.setBackground(new java.awt.Color(255, 153, 0));
        SendMail.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        SendMail.setForeground(new java.awt.Color(153, 0, 0));
        SendMail.setText("Send Mail ");
        SendMail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        SendMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SendMailMouseClicked(evt);
            }
        });
        jPanel1.add(SendMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 470, 60));

        topic.setFont(new java.awt.Font("Tekton Pro", 1, 48)); // NOI18N
        topic.setForeground(new java.awt.Color(255, 255, 255));
        topic.setText("Officer");
        jPanel1.add(topic, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 180, -1));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/img/Officer.png"))); // NOI18N
        jPanel1.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 250));

        CreateUser1.setBackground(new java.awt.Color(255, 153, 0));
        CreateUser1.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        CreateUser1.setForeground(new java.awt.Color(153, 0, 0));
        CreateUser1.setText("Create User Accounts");
        CreateUser1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        CreateUser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateUser1MouseClicked(evt);
            }
        });
        jPanel1.add(CreateUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 470, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/img/icons8-exit-30.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 20, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/img/background.jpg"))); // NOI18N
        background.setText("vdfb");
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SendMailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SendMailMouseClicked
        OfficerSendMail mail= new OfficerSendMail();

        mail.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SendMailMouseClicked

    private void CreateUser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateUser1MouseClicked
        OfficerUserAccounts account= new OfficerUserAccounts();

        account.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CreateUser1MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       WelcomePage logout = new WelcomePage();
       logout.show();
        
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(OfficerHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OfficerHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OfficerHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OfficerHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OfficerHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateUser1;
    private javax.swing.JButton SendMail;
    private javax.swing.JLabel background;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel topic;
    // End of variables declaration//GEN-END:variables
}
