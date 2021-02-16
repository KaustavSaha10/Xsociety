/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kaustav
 */
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;
public class DashboardUI extends javax.swing.JFrame {

    /**
     * Creates new form DashboardUI
     */
    private DisplayManager HeadMgr;
    public DashboardUI(DisplayManager ob) {
        HeadMgr = ob;
        initComponents();
        this.setTitle("DashboardUI - Kaustav Saha 104");
        upB.setBackground(new Color(252,208,92));
        HomeB.setBackground(new Color(255,153,51));
        JButton [] btns = { HomeB1,HomeB2,HomeB3,HomeB4};
        for (JButton btn : btns){
            btn.setBackground(new Color(7,95,99));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {

                @Override
                public void mouseClicked(MouseEvent me) {
                    }

                @Override
                public void mousePressed(MouseEvent me) {
                   }

                @Override
                public void mouseReleased(MouseEvent me) {
                    }

                @Override
                public void mouseEntered(MouseEvent me) {
                    btn.setBackground(new Color(255,137,137));
                    }

                @Override
                public void mouseExited(MouseEvent me) {
                    btn.setBackground(new Color(7,95,99));
                   }
            } );
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BaseUI = new javax.swing.JPanel();
        options = new javax.swing.JPanel();
        HomeB = new javax.swing.JButton();
        HomeB1 = new javax.swing.JButton();
        HomeB2 = new javax.swing.JButton();
        HomeB3 = new javax.swing.JButton();
        HomeB4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        upB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userIDLabel = new javax.swing.JLabel();
        UIDLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));

        BaseUI.setBackground(new java.awt.Color(250, 208, 90));
        BaseUI.setPreferredSize(new java.awt.Dimension(1000, 600));

        options.setBackground(new java.awt.Color(7, 95, 99));

        HomeB.setBackground(new java.awt.Color(7, 95, 99));
        HomeB.setForeground(new java.awt.Color(7, 95, 99));
        HomeB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/open-menu.png"))); // NOI18N
        HomeB.setBorder(null);
        HomeB.setPreferredSize(new java.awt.Dimension(50, 50));

        HomeB1.setBackground(new java.awt.Color(7, 95, 99));
        HomeB1.setForeground(new java.awt.Color(7, 95, 99));
        HomeB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/book.png"))); // NOI18N
        HomeB1.setBorder(null);
        HomeB1.setPreferredSize(new java.awt.Dimension(90, 90));
        HomeB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeB1MouseClicked(evt);
            }
        });

        HomeB2.setBackground(new java.awt.Color(7, 95, 99));
        HomeB2.setForeground(new java.awt.Color(7, 95, 99));
        HomeB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shop.png"))); // NOI18N
        HomeB2.setBorder(null);
        HomeB2.setPreferredSize(new java.awt.Dimension(90, 90));
        HomeB2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeB2MouseClicked(evt);
            }
        });

        HomeB3.setBackground(new java.awt.Color(7, 95, 99));
        HomeB3.setForeground(new java.awt.Color(7, 95, 99));
        HomeB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cog.png"))); // NOI18N
        HomeB3.setBorder(null);
        HomeB3.setPreferredSize(new java.awt.Dimension(90, 90));
        HomeB3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeB3MouseClicked(evt);
            }
        });

        HomeB4.setBackground(new java.awt.Color(7, 95, 99));
        HomeB4.setForeground(new java.awt.Color(7, 95, 99));
        HomeB4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        HomeB4.setBorder(null);
        HomeB4.setPreferredSize(new java.awt.Dimension(90, 90));
        HomeB4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeB4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout optionsLayout = new javax.swing.GroupLayout(options);
        options.setLayout(optionsLayout);
        optionsLayout.setHorizontalGroup(
            optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HomeB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HomeB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HomeB4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HomeB3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HomeB2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        optionsLayout.setVerticalGroup(
            optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(HomeB, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HomeB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HomeB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HomeB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HomeB4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 50)); // NOI18N
        jLabel1.setText("WELCOME");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dashboard-pic.jpg"))); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(250, 208, 90));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("  Collaborate with students from your own college or university and \n  upgrade your digital study resources for FREE. Buy books and lab \n  equipment for a low cost from seniors. Share class notes and slides \n  with your friends. Never fall behind from the flow!");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        upB.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 20)); // NOI18N
        upB.setText("UPLOAD");
        upB.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        upB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upBMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jLabel2.setText("Want to contribute?");

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jLabel3.setText("(notes/books/slides)");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/upload.png"))); // NOI18N

        userIDLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        userIDLabel.setText("User ID");

        UIDLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N

        javax.swing.GroupLayout BaseUILayout = new javax.swing.GroupLayout(BaseUI);
        BaseUI.setLayout(BaseUILayout);
        BaseUILayout.setHorizontalGroup(
            BaseUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BaseUILayout.createSequentialGroup()
                .addComponent(options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(BaseUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(BaseUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BaseUILayout.createSequentialGroup()
                        .addGroup(BaseUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(BaseUILayout.createSequentialGroup()
                                .addComponent(upB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(87, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BaseUILayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(BaseUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(UIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34))))
        );
        BaseUILayout.setVerticalGroup(
            BaseUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(options, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BaseUILayout.createSequentialGroup()
                .addGroup(BaseUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BaseUILayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1))
                    .addGroup(BaseUILayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(userIDLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BaseUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BaseUILayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BaseUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BaseUILayout.createSequentialGroup()
                                .addComponent(upB, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))
                        .addGap(169, 169, 169))
                    .addGroup(BaseUILayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BaseUI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BaseUI, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeB4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeB4MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_HomeB4MouseClicked

    private void HomeB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeB1MouseClicked
        // TODO add your handling code here:
        this.dispose();
        HeadMgr.dispSearchUI();
        
    }//GEN-LAST:event_HomeB1MouseClicked

    private void upBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upBMouseClicked
        // TODO add your handling code here:
        this.dispose();
        HeadMgr.dispUploadUI();
    }//GEN-LAST:event_upBMouseClicked

    private void HomeB2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeB2MouseClicked
        // TODO add your handling code here:
        this.dispose();
        HeadMgr.dispEStoreUI();
    }//GEN-LAST:event_HomeB2MouseClicked

    private void HomeB3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeB3MouseClicked
        // TODO add your handling code here:
        this.dispose();
        HeadMgr.dispSettingsUI();
    }//GEN-LAST:event_HomeB3MouseClicked
    public void setUID(){
        UIDLabel.setText(HeadMgr.getUser().getUniqueid());
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
            java.util.logging.Logger.getLogger(DashboardUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardUI(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BaseUI;
    private javax.swing.JButton HomeB;
    private javax.swing.JButton HomeB1;
    private javax.swing.JButton HomeB2;
    private javax.swing.JButton HomeB3;
    private javax.swing.JButton HomeB4;
    private javax.swing.JLabel UIDLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel options;
    private javax.swing.JButton upB;
    private javax.swing.JLabel userIDLabel;
    // End of variables declaration//GEN-END:variables
}
