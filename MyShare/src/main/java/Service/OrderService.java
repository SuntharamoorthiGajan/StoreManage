/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import Database.DatabaseConnection;
import Model.Order;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author rajah
 */
public class OrderService {
   DatabaseConnection DBCON;
    public OrderService()
    {
        DBCON=DatabaseConnection.getSingleInstance();
    }
    
    public boolean addOrder(Order ord)
    {
        try
        {
            String query="insert into order_table(order_id,customer_id,date,amount,Status,Employee) values('"+ord.getOrderId()+"','"+ord.getCusId()+"','"+ord.getDate()+"',"+ord.getAmount()+",'Pending','-')";
            boolean result=DBCON.ExecuteQuery(query);
            return result;
        }catch (Exception ex)
        {
          System.out.println(ex.getMessage());
          return false;
        }
    }
    public boolean updateOrder(Order ord)
    {
        try
        {
            String query = "update order_table set customer_id = '"+ord.getCusId()+"', date = '"+ord.getDate()+"', amount = "+ord.getAmount()+", Status = 'pending', Employee = '-' where order_id = '"+ord.getOrderId()+"'";
            boolean result=DBCON.ExecuteQuery(query);
            return result;
        }catch (Exception ex)
        {
          System.out.println(ex.getMessage());
          return false;
        }
    }
    public boolean deleteOrder(Order ord)
    {
        try
        {
            String query = "DELETE FROM order_table WHERE order_id = '" + ord.getOrderId() + "'";

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
         if(query.equals("All"))
        {
            ResultSet rs=DBCON.readQuery("select * from orders");
        }
        else if(query.equals("pending"))
        {
            ResultSet rs=DBCON.readQuery("select * from orders where status='pending'");
            
        }
         
        ResultSet rs=DBCON.readQuery("select * from order_table");

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
}
