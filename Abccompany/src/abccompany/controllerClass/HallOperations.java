/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abccompany.controllerClass;

import abccompany.modelClass.Hall;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface HallOperations {
    public void save(Hall halls);
    public void edit(Hall halls);
    public void delete(Hall halls);
    public Hall getDetails(int id);
    public List<Hall> list();
   
}
