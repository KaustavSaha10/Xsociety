
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicButtonUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kaustav
 */

public class SettingsUI extends javax.swing.JFrame {

    /**
     * Creates new form SettingsUI
     */
    private DisplayManager HeadMgr;
    public SettingsUI(DisplayManager ob) {
        HeadMgr = ob;
        initComponents();
        this.setTitle("DashboardUI - Kaustav Saha 104");
        HomeB8.setBackground(new Color(255,153,51));
        JButton [] btns = { HomeB5,HomeB6,HomeB7,HomeB9};
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

        jPanel1 = new javax.swing.JPanel();
        options1 = new javax.swing.JPanel();
        HomeB5 = new javax.swing.JButton();
        HomeB6 = new javax.swing.JButton();
        HomeB7 = new javax.swing.JButton();
        HomeB8 = new javax.swing.JButton();
        HomeB9 = new javax.swing.JButton();
        UIDLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ReportCB = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        reportUID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        feedbackTX = new javax.swing.JTextArea();
        submitBtn = new javax.swing.JButton();
        reportBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(250, 208, 90));

        options1.setBackground(new java.awt.Color(7, 95, 99));

        HomeB5.setBackground(new java.awt.Color(7, 95, 99));
        HomeB5.setForeground(new java.awt.Color(7, 95, 99));
        HomeB5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/open-menu.png"))); // NOI18N
        HomeB5.setBorder(null);
        HomeB5.setPreferredSize(new java.awt.Dimension(50, 50));
        HomeB5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeB5MouseClicked(evt);
            }
        });

        HomeB6.setBackground(new java.awt.Color(7, 95, 99));
        HomeB6.setForeground(new java.awt.Color(7, 95, 99));
        HomeB6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/book.png"))); // NOI18N
        HomeB6.setBorder(null);
        HomeB6.setPreferredSize(new java.awt.Dimension(90, 90));
        HomeB6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeB6MouseClicked(evt);
            }
        });

        HomeB7.setBackground(new java.awt.Color(7, 95, 99));
        HomeB7.setForeground(new java.awt.Color(7, 95, 99));
        HomeB7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shop.png"))); // NOI18N
        HomeB7.setBorder(null);
        HomeB7.setPreferredSize(new java.awt.Dimension(90, 90));
        HomeB7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeB7MouseClicked(evt);
            }
        });

        HomeB8.setBackground(new java.awt.Color(7, 95, 99));
        HomeB8.setForeground(new java.awt.Color(7, 95, 99));
        HomeB8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cog.png"))); // NOI18N
        HomeB8.setBorder(null);
        HomeB8.setPreferredSize(new java.awt.Dimension(90, 90));

        HomeB9.setBackground(new java.awt.Color(7, 95, 99));
        HomeB9.setForeground(new java.awt.Color(7, 95, 99));
        HomeB9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        HomeB9.setBorder(null);
        HomeB9.setPreferredSize(new java.awt.Dimension(90, 90));
        HomeB9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeB9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout options1Layout = new javax.swing.GroupLayout(options1);
        options1.setLayout(options1Layout);
        options1Layout.setHorizontalGroup(
            options1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(options1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(options1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HomeB5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HomeB6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HomeB9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HomeB8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HomeB7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        options1Layout.setVerticalGroup(
            options1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(options1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(HomeB5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HomeB6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HomeB7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HomeB8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HomeB9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        UIDLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 50)); // NOI18N
        jLabel1.setText("SETTINGS");

        ReportCB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ReportCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Using someone else's UniqueID", "Uploading unrelated content in E-Store", "Uploading unreliable links", "Uploaded copyrighted works without permission", "Other reasons (Write in Feedback)" }));
        ReportCB.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("REPORT USER");

        reportUID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        reportUID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportUIDMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("User ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("FEEDBACK");

        feedbackTX.setColumns(20);
        feedbackTX.setRows(5);
        jScrollPane1.setViewportView(feedbackTX);

        submitBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submitBtn.setText("SUBMIT");
        submitBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        submitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitBtnMouseClicked(evt);
            }
        });

        reportBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reportBtn.setText("REPORT");
        reportBtn.setToolTipText("");
        reportBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        reportBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(options1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 392, Short.MAX_VALUE)
                                .addComponent(UIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel4))
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(reportUID, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ReportCB, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(497, 497, 497)
                        .addComponent(reportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(options1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(UIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ReportCB, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reportUID))
                        .addGap(125, 125, 125)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(reportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeB6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeB6MouseClicked
        // TODO add your handling code here:
        this.dispose();
        HeadMgr.dispSearchUI();

    }//GEN-LAST:event_HomeB6MouseClicked

    private void HomeB7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeB7MouseClicked
        // TODO add your handling code here:
        this.dispose();
        HeadMgr.dispEStoreUI();
    }//GEN-LAST:event_HomeB7MouseClicked

    private void HomeB9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeB9MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_HomeB9MouseClicked

    private void reportUIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportUIDMouseClicked
        // TODO add your handling code here:
        reportUID.setBackground(Color.WHITE);
        reportUID.setText("");
    }//GEN-LAST:event_reportUIDMouseClicked

    private void reportBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportBtnMouseClicked
        // TODO add your handling code here:
        String options[]={"Using someone else's UniqueID",
                                  "Uploading unrelated content in E-Store",
                                  "Uploading unreliable links",
                                   "Uploaded copyrighted works without permission",
                                   "Other reasons (Write in Feedback)"};
        if(reportUID.getText().compareTo("")==0){
            reportUID.setText("NO ID GIVEN!");
            reportUID.setBackground(Color.RED);
        }
        else{
                String reportUsr = "\n"+HeadMgr.getUser().getUniqueid()+","+reportUID.getText()+","+options[ReportCB.getSelectedIndex()];
                try{
                BufferedWriter out = new BufferedWriter(new FileWriter("Reports.csv", true));
                out.write(reportUsr);
                out.close();
                JOptionPane.showMessageDialog(null,"Thanks for your report.We will look into it.","SUCCESS",JOptionPane.NO_OPTION);
                reportUID.setText("");
            }catch(Exception e){
                System.err.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_reportBtnMouseClicked

    private void HomeB5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeB5MouseClicked
        // TODO add your handling code here:
        this.dispose();
        HeadMgr.dispDashboardUI();
    }//GEN-LAST:event_HomeB5MouseClicked

    private void submitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitBtnMouseClicked
        // TODO add your handling code here:
        String F = feedbackTX.getText();
        String patt1="^[A-Za-z0-9 _]*[A-Za-z0-9][A-Za-z0-9 _]*$";
        Pattern p1 = Pattern.compile(patt1);
        Matcher m=p1.matcher(F);
        if(!m.matches()){
            JOptionPane.showMessageDialog(null,"Only Alphanumerics allowed!","ERROR!",JOptionPane.ERROR_MESSAGE);
        }
        else if(F.compareTo("")==0){
            JOptionPane.showMessageDialog(null,"No Feedback given!","ERROR!",JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
                BufferedWriter out = new BufferedWriter(new FileWriter("Feedbacks.txt", true));
                out.write("\n"+HeadMgr.getUser().getUniqueid()+" - "+ F);
                out.close();
                JOptionPane.showMessageDialog(null,"Thanks for your feedback!","SUCCESS",JOptionPane.NO_OPTION);
                feedbackTX.setText("");
            }catch(Exception e){
                System.err.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_submitBtnMouseClicked

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
            java.util.logging.Logger.getLogger(SettingsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsUI(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HomeB5;
    private javax.swing.JButton HomeB6;
    private javax.swing.JButton HomeB7;
    private javax.swing.JButton HomeB8;
    private javax.swing.JButton HomeB9;
    private javax.swing.JComboBox ReportCB;
    private javax.swing.JLabel UIDLabel;
    private javax.swing.JTextArea feedbackTX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel options1;
    private javax.swing.JButton reportBtn;
    private javax.swing.JTextField reportUID;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
