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
public class AdminVaccineDetails extends javax.swing.JFrame {

    /**
     * Creates new form VaccineDetails
     */
    public AdminVaccineDetails() {
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
        back = new javax.swing.JButton();
        Vname = new javax.swing.JLabel();
        Vid = new javax.swing.JLabel();
        lot = new javax.swing.JLabel();
        mfd = new javax.swing.JLabel();
        exd = new javax.swing.JLabel();
        Exdtxt = new javax.swing.JTextField();
        Mfdtxt = new javax.swing.JTextField();
        Lotidtxt = new javax.swing.JTextField();
        Vidtxt = new javax.swing.JTextField();
        VNametxt = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        update1 = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        VidDel = new javax.swing.JLabel();
        VidtDelxt = new javax.swing.JTextField();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vaccine Details");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        back.setText("<<");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 70, 30));

        Vname.setFont(new java.awt.Font("Bell Gothic Std Light", 0, 18)); // NOI18N
        Vname.setForeground(new java.awt.Color(255, 255, 255));
        Vname.setText("Vaccine Name");
        jPanel1.add(Vname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 140, 30));

        Vid.setFont(new java.awt.Font("Bell Gothic Std Light", 0, 18)); // NOI18N
        Vid.setForeground(new java.awt.Color(255, 255, 255));
        Vid.setText("Vaccine id");
        jPanel1.add(Vid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        lot.setFont(new java.awt.Font("Bell Gothic Std Light", 0, 18)); // NOI18N
        lot.setForeground(new java.awt.Color(255, 255, 255));
        lot.setText("Lot id");
        jPanel1.add(lot, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        mfd.setFont(new java.awt.Font("Bell Gothic Std Light", 0, 18)); // NOI18N
        mfd.setForeground(new java.awt.Color(255, 255, 255));
        mfd.setText("Manufactured day");
        jPanel1.add(mfd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        exd.setFont(new java.awt.Font("Bell Gothic Std Light", 0, 18)); // NOI18N
        exd.setForeground(new java.awt.Color(255, 255, 255));
        exd.setText("Expired day");
        jPanel1.add(exd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, -1, -1));
        jPanel1.add(Exdtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 260, 30));
        jPanel1.add(Mfdtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 260, 30));
        jPanel1.add(Lotidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 260, 30));
        jPanel1.add(Vidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 260, 30));
        jPanel1.add(VNametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 260, 30));

        add.setBackground(new java.awt.Color(255, 51, 51));
        add.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        add.setText("Add");
        add.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 110, 130, 40));

        update1.setBackground(new java.awt.Color(255, 51, 51));
        update1.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        update1.setText("Update");
        update1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        update1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update1MouseClicked(evt);
            }
        });
        jPanel1.add(update1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 240, 130, 40));

        delete.setBackground(new java.awt.Color(255, 51, 51));
        delete.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        delete.setText("Delete");
        delete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 450, 130, 40));

        VidDel.setFont(new java.awt.Font("Bell Gothic Std Light", 0, 18)); // NOI18N
        VidDel.setForeground(new java.awt.Color(255, 255, 255));
        VidDel.setText("Vaccine id");
        jPanel1.add(VidDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, -1, -1));
        jPanel1.add(VidtDelxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 370, 160, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/img/background.jpg"))); // NOI18N
        Background.setText("jLabel1");
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 550));

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

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        AdminHomepage home = new AdminHomepage();

        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addMouseClicked

    private void update1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_update1MouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        PHIViewCitizen citizen = new PHIViewCitizen();

        citizen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleteMouseClicked

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
            java.util.logging.Logger.getLogger(AdminVaccineDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminVaccineDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminVaccineDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminVaccineDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminVaccineDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JTextField Exdtxt;
    private javax.swing.JTextField Lotidtxt;
    private javax.swing.JTextField Mfdtxt;
    private javax.swing.JTextField VNametxt;
    private javax.swing.JLabel Vid;
    private javax.swing.JLabel VidDel;
    private javax.swing.JTextField VidtDelxt;
    private javax.swing.JTextField Vidtxt;
    private javax.swing.JLabel Vname;
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JButton delete;
    private javax.swing.JLabel exd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lot;
    private javax.swing.JLabel mfd;
    private javax.swing.JButton update1;
    // End of variables declaration//GEN-END:variables
}
