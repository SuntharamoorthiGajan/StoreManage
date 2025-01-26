/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author rajah
 */
public class Order {
   private String orderId;
    private String customerId;
    private String order_date;
    private double amount;
    public Order(String orderId,String customerId,String order_date,double amount)
    {
        this.orderId=orderId;
        this.amount=amount;
        this.customerId=customerId;
        this.order_date=order_date;
    }
    public String getOrderId()
    {
        return orderId;
        
    }
    
    public String getCusId()
    {
        return customerId;
        
    }
    public String getDate()
    {
        return order_date;
    }
    public double getAmount()
    {
        return amount;
    }
}
