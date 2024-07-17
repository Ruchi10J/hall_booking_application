/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abccompany.controllerClass;

import abccompany.database.DatabaseConnection;
import java.time.LocalDate;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
//import java.util.Date;

/**
 *
 * @author DELL
 */
public class HallAvailabilityCheck {
   public boolean isBooked(int idHall, LocalDate startDate, LocalDate endDate) {
    try {
        Connection con = DatabaseConnection.getConnection();
        String sql = "SELECT * FROM booking WHERE idHall = ? AND ((startDate <= ? AND endDate >= ?) OR (startDate <= ? AND endDate >= ?) OR (startDate >= ? AND endDate <= ?))";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idHall);
        ps.setString(2, startDate.toString());
        ps.setString(3, startDate.toString());
        ps.setString(4, endDate.toString());
        ps.setString(5, endDate.toString());
        ps.setString(6, startDate.toString());
        ps.setString(7, endDate.toString());
       
        
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Hall is unavailable");
                return true;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Hall is available");
        return false;
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "An error occurred while checking availability");
        return false;
    }
}

    
}
