/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abccompany.modelClass;

/**
 *
 * @author DELL
 */
public class PayReceipt {
    private int paymentId;
    private int bookingId;
    private double totalAmount;
    private int discountRate;
    private double total;

    public PayReceipt(int paymentId, int bookingId, double totalAmount, int discountRate, double total) {
        this.paymentId = paymentId;
        this.bookingId = bookingId;
        this.totalAmount = totalAmount;
        this.discountRate=discountRate;
        this.total=total;
    }

    public PayReceipt() {
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    
   
    
    
    
}
