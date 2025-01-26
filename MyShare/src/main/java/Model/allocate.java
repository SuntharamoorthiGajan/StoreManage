/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 94770
 */
public class allocate {
    private String orderId;
    private String EmpId;
    private String status;
    
    public allocate(String orderId,String EmpId,String status)
    {
        this.orderId=orderId;
        this.EmpId=EmpId;
        this.status=status;
    }
    public String getOrderId()
    {
        return orderId;
    }
    public String getEmpId()
    {
        return EmpId;
    }
    public String getStatus()
    {
        return status;
    }
}
