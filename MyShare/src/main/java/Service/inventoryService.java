/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import Database.DatabaseConnection;
import Model.Inventory;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author 94770
 */
public class inventoryService {
    DatabaseConnection DBCON;
    public inventoryService()
    {
        DBCON=DatabaseConnection.getSingleInstance();
    }
    
    public boolean addInventory(Inventory inv)
    {
        try
        {
            String query="insert into Inventory( Material_Name, Quantity) values('"+inv.getMate()+"','"+inv.getMateQuan()+"')";
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
        
         
        ResultSet rs=DBCON.readQuery("select * from Inventory");

        try
        {
        int a=0;
        while(rs.next())
        {


                dftm.setValueAt(rs.getString(1),a,0);
                dftm.setValueAt(rs.getString(2),a,1);
                
                a++;
        }
        }
        catch(Exception e)
        {

        }
    }
}
