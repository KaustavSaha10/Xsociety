
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import static java.util.Collections.list;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kaustav
 */
public class EStoreUI extends javax.swing.JFrame {

    /**
     * Creates new form EStoreUI
     */
    private DisplayManager HeadMgr;
    private UserManager UM;
    private StoreManager SM;
    private TransactionManager TM;
    private User currentUser;
    ArrayList<String> lst = new ArrayList<String>();//list of sorted items
    public EStoreUI(DisplayManager ob,StoreManager ob1,UserManager ob2,User ob3) {
        HeadMgr = ob;
        SM = ob1;
        UM = ob2;
        currentUser = ob3;
        initComponents();
        this.setTitle("EStoreUI - Kaustav Saha 104");
        this.setLocation(100,100);
        JButton [] btns = { HomeB,HomeB1,HomeB2,HomeB3,HomeB4};
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
        options = new javax.swing.JPanel();
        HomeB = new javax.swing.JButton();
        HomeB1 = new javax.swing.JButton();
        HomeB2 = new javax.swing.JButton();
        HomeB3 = new javax.swing.JButton();
        HomeB4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchX = new javax.swing.JTextField();
        itemTypecb = new javax.swing.JComboBox();
        buyB = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        searchHint = new javax.swing.JLabel();
        listMsg = new javax.swing.JLabel();
        sellBookBtn = new javax.swing.JButton();
        sellEqpBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(250, 208, 90));

        options.setBackground(new java.awt.Color(7, 95, 99));

        HomeB.setBackground(new java.awt.Color(7, 95, 99));
        HomeB.setForeground(new java.awt.Color(7, 95, 99));
        HomeB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/open-menu.png"))); // NOI18N
        HomeB.setBorder(null);
        HomeB.setPreferredSize(new java.awt.Dimension(50, 50));
        HomeB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeBMouseClicked(evt);
            }
        });

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

        HomeB3.setBackground(new java.awt.Color(7, 95, 99));
        HomeB3.setForeground(new java.awt.Color(7, 95, 99));
        HomeB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cog.png"))); // NOI18N
        HomeB3.setBorder(null);
        HomeB3.setPreferredSize(new java.awt.Dimension(90, 90));

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
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 50)); // NOI18N
        jLabel1.setText("E - STORE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("SEARCH");

        searchX.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchXKeyReleased(evt);
            }
        });

        itemTypecb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        itemTypecb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BOOK", "EQUIPMENT" }));

        buyB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buyB.setText("BUY");
        buyB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buyBMouseClicked(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item name", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(20);
        jTable1.setSelectionBackground(new java.awt.Color(255, 102, 102));
        jScrollPane2.setViewportView(jTable1);

        searchHint.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchHint.setText("Apply space after word to search");

        listMsg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listMsg.setForeground(new java.awt.Color(204, 0, 51));

        sellBookBtn.setText("SELL BOOK");
        sellBookBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sellBookBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellBookBtnMouseClicked(evt);
            }
        });

        sellEqpBtn.setText("SELL EQUIPMENT");
        sellEqpBtn.setToolTipText("");
        sellEqpBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sellEqpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellEqpBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buyB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sellBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sellEqpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(300, 300, 300)
                            .addComponent(searchHint))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(itemTypecb, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(searchX)))))
                .addGap(0, 54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(options, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(searchHint)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemTypecb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchX, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buyB)
                        .addComponent(sellBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(listMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sellEqpBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeB1MouseClicked
        // TODO add your handling code here:
        this.dispose();
        HeadMgr.dispSearchUI();

    }//GEN-LAST:event_HomeB1MouseClicked

    private void HomeB4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeB4MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_HomeB4MouseClicked

    private void HomeBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBMouseClicked
        // TODO add your handling code here:
        this.dispose();
        HeadMgr.dispDashboardUI();
    }//GEN-LAST:event_HomeBMouseClicked

    private void searchXKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchXKeyReleased
        // TODO add your handling code here:
        listMsg.setText("");
        String tx = searchX.getText();
        if(NameCheck(tx)&&tx.endsWith(" ")){
            DefaultTableModel tb1Model = (DefaultTableModel)jTable1.getModel();
            int rowCount = tb1Model.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--){
                tb1Model.removeRow(i);
            }
            int ch = itemTypecb.getSelectedIndex();
            lst.clear();
            lst = SM.getList(tx, ch);
            System.out.println("SIZE"+lst.size());
            for(String i:lst){
                System.out.println(i.split(",")[0]);
                String data[]={i.split(",")[1],i.split(",")[3]};
                System.out.println(i.split(",")[1]+"  "+i.split(",")[3]);
                tb1Model.addRow(data);
            }
            if(lst.size()==0){
                listMsg.setText("NO MATCHES FOUND.");
            }
        }
        }
    private boolean NameCheck(String p){
        return Pattern.matches("[a-zA-Z][a-zA-Z ]*",p);
    
    }//GEN-LAST:event_searchXKeyReleased

    private void buyBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyBMouseClicked
        // TODO add your handling code here:
        
        int sr = jTable1.getSelectedRow();
        if(sr!=-1){
            if(itemTypecb.getSelectedIndex()==0){
                SM.buyBook((lst.get(sr)).split(",")[4]);
                //System.out.println((lst.get(sr)).split(",")[4]);
            }
            else{ //for itemTypecb.getSelectedIndex()==1
                SM.buyEquipment((lst.get(sr)).split(",")[4]);
            System.out.println((lst.get(sr)).split(",")[4]);
            }
        }
        else{
            listMsg.setText("NO ITEM SELECTED.");
        }
        
    }//GEN-LAST:event_buyBMouseClicked

    private void sellBookBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellBookBtnMouseClicked
        // TODO add your handling code here:
        this.dispose();
        HeadMgr.dispSellBookUI();
    }//GEN-LAST:event_sellBookBtnMouseClicked

    private void sellEqpBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellEqpBtnMouseClicked
        // TODO add your handling code here:
        this.dispose();
        HeadMgr.dispSellEquipmentUI();
    }//GEN-LAST:event_sellEqpBtnMouseClicked

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
            java.util.logging.Logger.getLogger(EStoreUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EStoreUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EStoreUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EStoreUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EStoreUI(null,null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HomeB;
    private javax.swing.JButton HomeB1;
    private javax.swing.JButton HomeB2;
    private javax.swing.JButton HomeB3;
    private javax.swing.JButton HomeB4;
    private javax.swing.JButton buyB;
    private javax.swing.JComboBox itemTypecb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel listMsg;
    private javax.swing.JPanel options;
    private javax.swing.JLabel searchHint;
    private javax.swing.JTextField searchX;
    private javax.swing.JButton sellBookBtn;
    private javax.swing.JButton sellEqpBtn;
    // End of variables declaration//GEN-END:variables
}
