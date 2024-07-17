/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abccompany.controllerClass;

import abccompany.modelClass.Hall;
import abccompany.database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class HallOperationsImplement implements HallOperations{
    
    @Override
    public void save(Hall halls) {
        
        try {
            Connection con= DatabaseConnection.getConnection();
            String sql="INSERT INTO hall(idHall,hallType,hallName,hallPricePerDay)VALUES(?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, halls.getIdHall());
            ps.setString(2, halls.getHallType());
            ps.setString(3, halls.getHallName());
            ps.setDouble(4, halls.getHallPrice());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saved");
            
            
        } catch (Exception ex) {
            ex.printStackTrace();;
            JOptionPane.showMessageDialog(null, "Error");
        }
    
    
    
    
    
    
    }

    
    @Override
    public void edit(Hall halls) {
        try {
            Connection con= DatabaseConnection.getConnection();
            String sql="UPDATE hall SET hallType=?,hallName=?,hallPricePerDay=? WHERE idHall=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, halls.getHallType());
            ps.setString(2, halls.getHallName());
            ps.setDouble(3, halls.getHallPrice());
             ps.setInt(4, halls.getIdHall());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated");
            
            
        } catch (Exception ex) {
            ex.printStackTrace();;
            JOptionPane.showMessageDialog(null, "Error");
        } }

    
    @Override
    public void delete(Hall halls) {
        
        try {
            Connection con= DatabaseConnection.getConnection();
            String sql="DELETE FROM hall WHERE idHall=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,halls.getIdHall());
           
             ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Delete Successfull");
            
            
        } catch (Exception ex) {
            ex.printStackTrace();;
            JOptionPane.showMessageDialog(null, "Error");
        }
        
    
    }

   
    @Override
    public Hall getDetails(int id) {
        
    Hall obj= new Hall();
    try{
        
        Connection con= DatabaseConnection.getConnection();
        String sql="SELECT *FROM hall WHERE IdHall=?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
        
        obj.setIdHall(rs.getInt("idHall"));
         obj.setType(rs.getString("hallType"));
          obj.setHallName(rs.getString("hallName"));
           obj.setHallPrice(rs.getDouble("hallPricePerDay"));
           
          
        }
    }catch(Exception e){
    e.printStackTrace();
    JOptionPane.showMessageDialog(null, "Error");
   }
    
    return obj;
    }
    
   
    
    

    
    @Override
    public List<Hall> list() {
        List<Hall> list =new ArrayList<>();
        
        try{
        Connection con= DatabaseConnection.getConnection();
        String sql= "SELECT * FROM hall";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery(); 
        
        
        while(rs.next()){
        
        Hall obj =new Hall();
        
        obj.setIdHall(rs.getInt("idHall"));
        obj.setType(rs.getString("hallType"));
        obj.setHallName(rs.getString("hallName"));
        obj.setHallPrice(rs.getDouble("hallPricePerDay"));
        
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

   



    

