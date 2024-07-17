package abccompany.viewClass;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import abccompany.controllerClass.PaymentOperationsImplement;
import abccompany.modelClass.Hall;
import abccompany.modelClass.PayReceipt;
/**
 *
 * @author DELL
 */
public class Payment extends javax.swing.JFrame {

    /**
     * Creates new form Payment
     */
    public Payment() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        bookintTxt = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        previousBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        logoutBtn = new javax.swing.JButton();
        priceTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        paymentTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Payment details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 43, 192, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Booking ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 145, 87, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Payment Method");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 192, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Total amount");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 245, 105, -1));

        jRadioButton1.setText("Cash");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 193, 67, -1));

        jRadioButton2.setText("Card");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 193, 71, -1));
        jPanel1.add(bookintTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 104, 102, -1));

        saveBtn.setBackground(new java.awt.Color(51, 102, 0));
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Save payment");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 374, 112, 39));

        previousBtn.setBackground(new java.awt.Color(51, 102, 0));
        previousBtn.setForeground(new java.awt.Color(255, 255, 255));
        previousBtn.setText("Previous");
        previousBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousBtnActionPerformed(evt);
            }
        });
        jPanel1.add(previousBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 377, 90, 33));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 783, -1));

        logoutBtn.setBackground(new java.awt.Color(0, 102, 0));
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 374, 81, 39));

        priceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTxtActionPerformed(evt);
            }
        });
        jPanel1.add(priceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 245, 107, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Payment ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 104, 87, -1));
        jPanel1.add(paymentTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 145, 102, -1));

        jLabel4.setText("Discount Rate");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 130, -1));

        jLabel7.setText("Total amount after discounted");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void priceTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTxtActionPerformed
        // TODO add your handling code here:
//        Hall hs=new Hall();
//        PayReceipt pp=new PayReceipt();
//        if(hs.getHallType().equals("small")){
//            pp.setTotalAmount(500.00);
//            
//        }
    }//GEN-LAST:event_priceTxtActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
              dispose(); 
              Login hpage= new Login();
              hpage.show();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        PayReceipt obj=new PayReceipt();
        int pId=Integer.parseInt(bookintTxt.getText());
        int bId=Integer.parseInt(paymentTxt.getText());
        double fee=Double.parseDouble(priceTxt.getText());
        
        obj.setBookingId(bId);
        obj.setPaymentId(pId);
        obj.setTotalAmount(fee);
        
        
        PaymentOperationsImplement imp= new PaymentOperationsImplement();
        imp.save(obj);
        
        
        
        bookintTxt.setText("");
        
        paymentTxt.setText("");
        priceTxt.setText("");
       
    }//GEN-LAST:event_saveBtnActionPerformed

    private void previousBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousBtnActionPerformed
        // TODO add your handling code here:
              dispose(); 
              AddBooking hpage= new AddBooking();
              hpage.show();
    }//GEN-LAST:event_previousBtnActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookintTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTextField paymentTxt;
    private javax.swing.JButton previousBtn;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
