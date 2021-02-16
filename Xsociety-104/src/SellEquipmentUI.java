
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
public class SellEquipmentUI extends javax.swing.JFrame {

    /**
     * Creates new form uploadEquipment
     */
    DisplayManager HeadMgr;
    StoreManager SM;
    public SellEquipmentUI(DisplayManager ob,StoreManager ob1) {
        HeadMgr = ob;
        SM = ob1;
        initComponents();
        this.setTitle("sellEquipmentUI - Maitri Roy 96");
        this.setLocation(100,100);
        JButton [] btns = { HomeB5,HomeB6,HomeB7,HomeB8,HomeB9};
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
        
        linkTXT.setVisible(false);
        price.setVisible(false);
        set2.setVisible(false);
        confirm.setVisible(false);
        
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
        jLabel1 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        l4 = new javax.swing.JComboBox();
        add = new javax.swing.JButton();
        price = new javax.swing.JLabel();
        linkTXT = new javax.swing.JTextField();
        set2 = new javax.swing.JTextField();
        confirm = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(250, 208, 90));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 600));

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
        HomeB8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeB8MouseClicked(evt);
            }
        });

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
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 50)); // NOI18N
        jLabel1.setText("SELL EQUIPMENT");

        l1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        l1.setText("EQUIPMENT");

        l2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        l2.setText("ENTER THE EQUIPMENT");
        l2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("LABCODE");

        l4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ESC501", "CS501", "CS502", "CS503" }));

        add.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        price.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        price.setText("SET PRICE");

        linkTXT.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        linkTXT.setText("---ENTER LINK---");
        linkTXT.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        set2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        set2.setText("ENTER THE PRICE");
        set2.setToolTipText("");
        set2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        confirm.setText("CONFIRM");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("ENTER LINK OF ITEM PICTURE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(options1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l1)
                                    .addComponent(jLabel2))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(l2, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                                    .addComponent(l4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(price)
                                .addGap(71, 71, 71)
                                .addComponent(set2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(linkTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 81, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(options1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l1)
                    .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(linkTXT)
                        .addGap(62, 62, 62))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price)
                    .addComponent(set2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
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
        HeadMgr.ExitApp();
    }//GEN-LAST:event_HomeB9MouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        if(l2.getText().length()<=0 || l2.getText().equals("ENTER THE EQUIPMENT"))
        {
	JOptionPane.showMessageDialog(null,"Please enter Equipment name");
        }
        String str = l2.getText();
        if(Pattern.matches("^[a-zA-Z]+",str)){
            linkTXT.setVisible(true);
            price.setVisible(true);
            set2.setVisible(true);
            confirm.setVisible(true);
        }
    }//GEN-LAST:event_addActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        // TODO add your handling code here:
        if(set2.getText().length()<=0 || set2.getText().equals("ENTER THE PRICE"))
                            {
                                    JOptionPane.showMessageDialog(null,"Please enter a price");

                            }
                            else if(Pattern.matches(".*\\D.*",set2.getText()))
                            {
                                    JOptionPane.showMessageDialog(null,"Only numerical values accepted");
                            }

                            else if(set2.getText().length()>3)
                            {
                                    JOptionPane.showMessageDialog(null,"Maximum price limit exceeded");

                            }

                            else
                            {
                                    if(Pattern.matches("^[a-zA-Z]+",l2.getText())&&set2.getText().length()<=3&&
                                                    (!Pattern.matches(".*\\D.*",set2.getText())))

                                    {
                                        String subj[]={"ESC501","CS501","CS502","CS503"};
                                        //System.out.println(subj[l4.getSelectedIndex()]);
                                        //System.out.println(l2.getText());
                                        //System.out.println(set2.getText());
                                        //System.out.println(linkTXT.getText());
                                        //System.out.println(HeadMgr.getUser().getUniqueid());
                                        SM.addItem(new Equipment(subj[l4.getSelectedIndex()],l2.getText(),Float.parseFloat(set2.getText()),linkTXT.getText(),Integer.parseInt(HeadMgr.getUser().getUniqueid())));
                                        JOptionPane.showMessageDialog(null,"YOUR ITEM HAS BEEN ADDED");
                                    }

                                    else
                                    {
                                            JOptionPane.showMessageDialog(null,"SORRY TRY AGAIN");
                                    }
                            }
    }//GEN-LAST:event_confirmActionPerformed

    private void HomeB5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeB5MouseClicked
        // TODO add your handling code here:
        this.dispose();
        HeadMgr.dispDashboardUI();
    }//GEN-LAST:event_HomeB5MouseClicked

    private void HomeB8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeB8MouseClicked
        // TODO add your handling code here:
        this.dispose();
        HeadMgr.dispSettingsUI();
    }//GEN-LAST:event_HomeB8MouseClicked

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
            java.util.logging.Logger.getLogger(SellEquipmentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellEquipmentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellEquipmentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellEquipmentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellEquipmentUI(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HomeB5;
    private javax.swing.JButton HomeB6;
    private javax.swing.JButton HomeB7;
    private javax.swing.JButton HomeB8;
    private javax.swing.JButton HomeB9;
    private javax.swing.JButton add;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l1;
    private javax.swing.JTextField l2;
    private javax.swing.JComboBox l4;
    private javax.swing.JTextField linkTXT;
    private javax.swing.JPanel options1;
    private javax.swing.JLabel price;
    private javax.swing.JTextField set2;
    // End of variables declaration//GEN-END:variables
}
