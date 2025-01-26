/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Order;
import Model.Supplier ;
import Service.supplierService;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
/**
 *
 * @author 94770
 */
public class supplierController {
    private Supplier Supplier1;
    private supplierService supService;
    public supplierController()
    {
        supService =new supplierService();
    }
    
    public Supplier addSupplier(String SupplierId,String SupplierName,double Quantity,double price,String MaterialName)
    {
        Supplier1 =new Supplier(SupplierId,SupplierName,Quantity,price, MaterialName);
        return Supplier1;
    }
    public boolean addSupplierToDB()
    {
        return supService.addSupplier(Supplier1);
    }
    public Supplier updateSupplier(String SupplierId,String SupplierName,double Quantity,double price,String MaterialName)
    {
        Supplier1=new Supplier(SupplierId,SupplierName,Quantity,price, MaterialName);
        return Supplier1;
    }
    public boolean updateSupplierToDB()
    {
        return supService.updateSupplier(Supplier1);
    }
    public Supplier deleteSupplier(String SupplierId,String SupplierName,double Quantity,double price,String MaterialName)
    {
        Supplier1=new Supplier(SupplierId,SupplierName,Quantity,price, MaterialName);
        return Supplier1;
    }
    public boolean deleteSupplierToDB()
    {
        return supService.deleteSupplier(Supplier1);
    }
    public void refreshTable(DefaultTableModel dftm,String query)
    {
        supService.RefreshTable(dftm,query);
    }
    
}
