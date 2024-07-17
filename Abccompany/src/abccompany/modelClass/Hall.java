package abccompany.modelClass;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Hall {
    private int idHall;
    private double hallPrice;
    private String hallType;
    private String hallName;

    public Hall(int idHall, double hallPrice, String type, String hallName) {
        this.setIdHall(idHall);
        this.setHallPrice(hallPrice);
        this.setType(type);
        this.setHallName(hallName);
    }

    public Hall() {
    }
    
    

    public int getIdHall() {
        return idHall;
    }

    public void setIdHall(int idHall) {
        this.idHall = idHall;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public double getHallPrice() {
        return hallPrice;
    }

    public void setHallPrice(double hallPrice) {
        this.hallPrice = hallPrice;
    }

    public String getHallType() {
        return hallType;
    }

    public void setType(String hallType) {
        this.hallType = hallType;
    }
    
    
}
