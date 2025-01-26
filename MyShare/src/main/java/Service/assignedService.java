/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import Model.*;
import Controller.AllocateController;
import Database.DatabaseConnection;
import Service.AllocateService;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
/**
 *
 * @author 94770
 */
public class assignedService {
    DatabaseConnection DBCON;
    public assignedService()
    {
        DBCON=DatabaseConnection.getSingleInstance();
    }
    
    public boolean addOrder(assigned alo)
    {
        try
        {
            String query = "update order_table set Status='" + alo.getStatus() + "' where order_id='" + alo.getOrderId() + "'";

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
        
         
        ResultSet rs=DBCON.readQuery("select * from order_table where status='assigned'");

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
                dftm.setValueAt(rs.getString(6),a,5);
                a++;
        }
        }
        catch(Exception e)
        {

        }
        
    }
    public String email(String ID) {
    ResultSet em = DBCON.readQuery("select user_email from user where user_id = '" + ID + "'");
    
    try {
        if (em.next()) {
            String email = em.getString("user_email");
            return email;
        } else {
            
            return null; 
        }
    } catch (Exception e) {
        return null; 
    }
}
    
}
