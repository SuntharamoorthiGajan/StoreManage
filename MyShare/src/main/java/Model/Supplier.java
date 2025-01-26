/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author rajah
 */
public class Supplier {
    private String SupplierId;
    private String SupplierName;
    private double Quantity;
    private double price;
    private String MaterialName;
    
    public Supplier(String SupplierId,String SupplierName,double Quantity,double price,String MaterialName)
    {
        this.SupplierId=SupplierId;
        this.SupplierName=SupplierName;
        this.Quantity=Quantity;
        this.price=price;
        this.MaterialName=MaterialName;
    }
    public String getSupId()
    {
        return SupplierId;
    }
    public String getSupName()
    {
        return SupplierName;
    }
    public double getQuan()
    {
        return Quantity;
    }
    public double getPrice()
    {
        return price;
    }
    public String getMatName()
    {
        return MaterialName;
    }
}
