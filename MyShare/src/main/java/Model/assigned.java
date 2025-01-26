/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 94770
 */
public class assigned {
    private String orderId;
    private String cusId;
    private String status;
    
    public assigned(String orderId,String cusId,String status)
    {
        this.orderId=orderId;
        this.cusId=cusId;
        this.status=status;
    }
    public String getOrderId()
    {
        return orderId;
    }
    public String getcusId()
    {
        return cusId;
    }
    public String getStatus()
    {
        return status;
    }
}
