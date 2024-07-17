/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abccompany.controllerClass;

import abccompany.modelClass.Customer;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface CustomerOperations {
    public void save(Customer customers);
    public void edit(Customer customers);
    public void delete(Customer customers);
    public Customer getDetails(int id);
    public List<Customer> list();
    
    
    
}
