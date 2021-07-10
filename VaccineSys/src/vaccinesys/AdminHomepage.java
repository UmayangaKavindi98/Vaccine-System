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
public class AdminHomepage extends javax.swing.JFrame {

    /**
     * Creates new form AdminHomepage
     */
    public AdminHomepage() {
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
        topic = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        img = new javax.swing.JLabel();
        Citizen = new javax.swing.JButton();
        Infected = new javax.swing.JButton();
        Vaccine1 = new javax.swing.JButton();
        Vaccinated1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topic.setFont(new java.awt.Font("Tekton Pro", 1, 48)); // NOI18N
        topic.setForeground(new java.awt.Color(255, 255, 255));
        topic.setText("Admin");
        jPanel1.add(topic, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 180, -1));

        logout.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        logout.setText("Log Out");
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 30, 100, 30));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/img/Officer.png"))); // NOI18N
        jPanel1.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        Citizen.setBackground(new java.awt.Color(255, 51, 51));
        Citizen.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        Citizen.setForeground(new java.awt.Color(255, 255, 255));
        Citizen.setText("Manage Citizen Details");
        Citizen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        Citizen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CitizenMouseClicked(evt);
            }
        });
        jPanel1.add(Citizen, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 420, 60));

        Infected.setBackground(new java.awt.Color(255, 51, 51));
        Infected.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        Infected.setForeground(new java.awt.Color(255, 255, 255));
        Infected.setText("Infected Details");
        Infected.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        Infected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InfectedMouseClicked(evt);
            }
        });
        jPanel1.add(Infected, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 420, 60));

        Vaccine1.setBackground(new java.awt.Color(255, 51, 51));
        Vaccine1.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        Vaccine1.setForeground(new java.awt.Color(255, 255, 255));
        Vaccine1.setText("Vaccine Details");
        Vaccine1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        Vaccine1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Vaccine1MouseClicked(evt);
            }
        });
        jPanel1.add(Vaccine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 420, 60));

        Vaccinated1.setBackground(new java.awt.Color(255, 51, 51));
        Vaccinated1.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        Vaccinated1.setForeground(new java.awt.Color(255, 255, 255));
        Vaccinated1.setText("Vaccinated Details");
        Vaccinated1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        Vaccinated1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Vaccinated1MouseClicked(evt);
            }
        });
        jPanel1.add(Vaccinated1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 420, 60));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/img/background.jpg"))); // NOI18N
        background.setText("rhnnf");
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InfectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InfectedMouseClicked
        
    }//GEN-LAST:event_InfectedMouseClicked

    private void CitizenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CitizenMouseClicked
        AdminCitizenDetails citizen = new AdminCitizenDetails();

        citizen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CitizenMouseClicked

    private void Vaccine1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Vaccine1MouseClicked
       AdminVaccineDetails vaccine = new AdminVaccineDetails();

       vaccine.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_Vaccine1MouseClicked

    private void Vaccinated1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Vaccinated1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Vaccinated1MouseClicked

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
            java.util.logging.Logger.getLogger(AdminHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHomepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Citizen;
    private javax.swing.JButton Infected;
    private javax.swing.JButton Vaccinated1;
    private javax.swing.JButton Vaccine1;
    private javax.swing.JLabel background;
    private javax.swing.JLabel img;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    private javax.swing.JLabel topic;
    // End of variables declaration//GEN-END:variables
}
