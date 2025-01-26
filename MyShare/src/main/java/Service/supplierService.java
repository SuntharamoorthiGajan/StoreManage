/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import Database.DatabaseConnection;
import Model.Order;
import Model.Supplier;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author 94770
 */
public class supplierService {
    DatabaseConnection DBCON;
    public supplierService()
    {
        DBCON=DatabaseConnection.getSingleInstance();
    }
    
    public boolean addSupplier(Supplier sup)
    {
        try
        {
            String query="insert into Supplier(Supplier_id,Supplier_name, Quantity, price, MaterialName) values('"+sup.getSupId()+"','"+sup.getSupName()+"','"+sup.getQuan()+"',"+sup.getPrice()+",'"+sup.getMatName()+"')";
            boolean result=DBCON.ExecuteQuery(query);
            return result;
        }catch (Exception ex)
        {
          System.out.println(ex.getMessage());
          return false;
        }
    }
    public boolean updateSupplier(Supplier sup)
    {
        try
        {
            String query = "update Supplier set Supplier_name = '"+sup.getSupName()+"', Quantity = '"+sup.getQuan()+"', price = "+sup.getPrice()+", MaterialName = '"+ sup.getMatName()+"' where Supplier_id = '"+sup.getSupId()+"'";
            boolean result=DBCON.ExecuteQuery(query);
            return result;
        }catch (Exception ex)
        {
          System.out.println(ex.getMessage());
          return false;
        }
    }
    public boolean deleteSupplier(Supplier sup)
    {
        try
        {
            String query = "delete from Supplier where Supplier_id = '"+sup.getSupId()+"'";
            boolean result=DBCON.ExecuteQuery(query);
            return result;
        }catch (Exception ex)
        {
          System.out.println(ex.getMessage());
          return false;
        }
    }
     public void RefreshTable(DefaultTableModel dftm,String query)
    {
        
         
        ResultSet rs=DBCON.readQuery("select * from Supplier");

        try
        {
        int a=0;
        while(rs.next())
        {


                dftm.setValueAt(rs.getString(1),a,0);
                dftm.setValueAt(rs.getString(2),a,1);
                dftm.setValueAt(rs.getString(3),a,2);
                dftm.setValueAt(rs.getString(4),a,3);
                dftm.setValueAt(rs.getString(5),a,4);
                a++;
        }
        }
        catch(Exception e)
        {

        }
    }
}
