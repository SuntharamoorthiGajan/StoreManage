/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 94770
 */
public class User {
    private String CustomerId;
    private String customerName;
    private String Customer_Email;
    private String Address;
    public User(String CustomerId,String customerName,String Customer_Email,String Address)
    {
        this.CustomerId=CustomerId;
        this.customerName=customerName;
        this.Customer_Email=Customer_Email;
        this.Address=Address;
    }
    public String getCusId()
    {
        return CustomerId;
        
    }
    
    public String getCusName()
    {
        return customerName;
        
    }
    public String getCusEmail()
    {
        return Customer_Email;
    }
    public String getAddress()
    {
        return Address;
    }
}
