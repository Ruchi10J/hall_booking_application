/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abccompany.controllerClass;

import abccompany.database.DatabaseConnection;

import abccompany.modelClass.PayReceipt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class PaymentOperationsImplement {
     public void save(PayReceipt payment) {
        
        try {
            Connection con= DatabaseConnection.getConnection();
            String sql="INSERT INTO payment(paymentId,BookingId,TotalPrice,Discount Rate,total)VALUES(?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, payment.getPaymentId());
            ps.setInt(2, payment.getBookingId());
            ps.setDouble(3, payment.getTotalAmount());
            ps.setInt(4, payment.getDiscountRate());
            ps.setDouble(5, payment.getTotal());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saved");
            
            
        } catch (Exception ex) {
            ex.printStackTrace();;
            JOptionPane.showMessageDialog(null, "Error");
        }
    
    
    
    
    
    
    }
}
     
