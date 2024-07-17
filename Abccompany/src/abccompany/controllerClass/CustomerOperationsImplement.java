
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abccompany.controllerClass;

import abccompany.database.DatabaseConnection;
import abccompany.modelClass.Customer;
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
public class CustomerOperationsImplement implements CustomerOperations {

    @Override
    public void save(Customer customers) {

        try {
            Connection con = DatabaseConnection.getConnection();
            String sql = "INSERT INTO customer(customerId,name,nic,contactNo)VALUES(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, customers.getCustomerId());
            ps.setString(2, customers.getName());
            ps.setString(3, customers.getNic());
            ps.setString(4, customers.getContactNo());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saved");

        } catch (Exception ex) {
            ex.printStackTrace();;
            JOptionPane.showMessageDialog(null, "Error");
        }

    }

    @Override
    public void edit(Customer customers) {
        try {
            Connection con = DatabaseConnection.getConnection();
            String sql = "UPDATE customer SET name=?,nic=?,contactNo=? WHERE customerId=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, customers.getName());
            ps.setString(2, customers.getNic());
            ps.setString(3, customers.getContactNo());
            ps.setInt(4, customers.getCustomerId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated");

        } catch (Exception ex) {
            ex.printStackTrace();;
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    @Override
    public void delete(Customer customers) {

        try {
            Connection con = DatabaseConnection.getConnection();
            String sql = "DELETE FROM customer WHERE customerId=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, customers.getCustomerId());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Delete Successfull");

        } catch (Exception ex) {
            ex.printStackTrace();;
            JOptionPane.showMessageDialog(null, "Error");
        }

    }

    @Override
    public Customer getDetails(int id) {

        Customer obj = new Customer();
        try {

            Connection con = DatabaseConnection.getConnection();
            String sql = "SELECT *FROM customer WHERE customerId=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                obj.setCustomerId(rs.getInt("customerId"));
                obj.setName(rs.getString("name"));
                obj.setNic(rs.getString("nic"));
                obj.setContactNo(rs.getString("contactNo"));

            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }

        return obj;
    }

    @Override
    public List<Customer> list() {
        List<Customer> list = new ArrayList<>();

        try {
            Connection con = DatabaseConnection.getConnection();
            String sql = "SELECT * FROM customer";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Customer obj = new Customer();
                obj.setCustomerId(rs.getInt("customerId"));
                obj.setName(rs.getString("name"));
                obj.setNic(rs.getString("nic"));
                obj.setContactNo(rs.getString("contactNo"));

                list.add(obj);

            }

        } catch (Exception e) {

            e.printStackTrace();;
            JOptionPane.showMessageDialog(null, "Error");

        }

        return list;

    }
}
