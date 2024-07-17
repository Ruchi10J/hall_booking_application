/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abccompany.controllerClass;

import abccompany.modelClass.Booking;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface BookingOperations {
    public void save(Booking book);
    public void edit(Booking book);
    public void delete(Booking book);
    public Booking getDetails(int id);
    public List<Booking> list();
    
}
