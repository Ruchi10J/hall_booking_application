/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abccompany.controllerClass;

import abccompany.database.DatabaseConnection;
import abccompany.modelClass.Booking;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class BookingOperationsImplement implements BookingOperations{
    @Override
    public void save(Booking book) {
        
        try {
            Connection con = DatabaseConnection.getConnection();
            String sql = "INSERT INTO booking(bookingId,customerId,idHall,startDate,endDate)VALUES(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, book.getBookingId());
            ps.setInt(2, book.getCustomerId());
            ps.setInt(3, book.getHallId());
            ps.setString(4, book.getStartDate().toString());
            ps.setString(5,book.getEndDate().toString());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saved");

        } catch (Exception ex) {
            ex.printStackTrace();;
            JOptionPane.showMessageDialog(null, "Error");
        }
    
    
    
    
    }

    
    @Override
    public void edit(Booking book) {
        try {
            Connection con= DatabaseConnection.getConnection();
            String sql="UPDATE booking SET customerId=?,idHall=?,startDate=?,endDate=? WHERE bookingId=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, book.getCustomerId());
            ps.setInt(2, book.getHallId());
            ps.setString(3, book.getStartDate().toString());
            ps.setString(4,book.getEndDate().toString());
            ps.setInt(5, book.getBookingId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated");
            
            
        } catch (Exception ex) {
            ex.printStackTrace();;
            JOptionPane.showMessageDialog(null, "Error");
        } }

    
    @Override
    public void delete(Booking book) {
        
        try {
            Connection con= DatabaseConnection.getConnection();
            String sql="DELETE FROM booking WHERE bookingId=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,book.getBookingId());
           
             ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Delete Successfull");
            
            
        } catch (Exception ex) {
            ex.printStackTrace();;
            JOptionPane.showMessageDialog(null, "Error");
        }
        
    
    }

   
    @Override
  public Booking getDetails(int id) {
        
   Booking obj= new Booking();

    try{
          Connection con= DatabaseConnection.getConnection();
        String sql="SELECT *FROM booking WHERE bookingId=?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
       
        obj.setBookingId(rs.getInt("bookingId"));
        
         obj.setCustomerId(rs.getInt("customerId"));
         obj.setHallId(rs.getInt("customerId"));
         
         
         String startDateStr = rs.getString("startDate");
         String endDateStr = rs.getString("endDate");
         
         LocalDate startDate = LocalDate.parse(startDateStr);
         LocalDate endDate = LocalDate.parse(endDateStr);
          
         obj.setStartDate(startDate);
         obj.setEndDate(endDate);
         
       }
    }catch(Exception e){
    e.printStackTrace();
    JOptionPane.showMessageDialog(null, "Error");
   }
    
    return obj;
    }

   
   

    @Override
   public List<Booking> list() {
        List<Booking> list =new ArrayList<>();
        
        try{
        Connection con= DatabaseConnection.getConnection();
        String sql= "SELECT * FROM booking";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery(); 
        
        
        while(rs.next()){
        
         Booking obj =new Booking();
        obj.setBookingId(rs.getInt("bookingId"));
        obj.setCustomerId(rs.getInt("customerId"));
         obj.setHallId(rs.getInt("customerId"));
        
         
         String startDateStr = rs.getString("startDate");
        String endDateStr = rs.getString("endDate");
         
         LocalDate startDate = LocalDate.parse(startDateStr);
         LocalDate endDate = LocalDate.parse(endDateStr);
          
        obj.setStartDate(startDate);
         obj.setEndDate(endDate);
         
        list.add(obj);
        
        
        }
        
        
        
        }
        catch(Exception e){
        
        e.printStackTrace();;
        JOptionPane.showMessageDialog(null, "Error");
        
        
        }
        
    
        return list;
        
   }
   
   
   
}
