/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Order;
import Service.OrderService;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

/**
 *
 * @author rajah
 */
public class controller {
    private Order order1;
    private OrderService ordService;
    public controller()
    {
        ordService=new OrderService();
    }
    
    public Order addOrder(String orderID,String customerID,String order_date,double amount)
    {
        order1=new Order(orderID,customerID,order_date,amount);
        return order1;
    }
    public boolean addOrderToDB()
    {
        return ordService.addOrder(order1);
    }
    public Order updateOrder(String orderID,String customerID,String order_date,double amount)
    {
        order1=new Order(orderID,customerID,order_date,amount);
        return order1;
    }
    public boolean updateOrderToDB()
    {
        return ordService.updateOrder(order1);
    }
    public Order deleteOrder(String orderID,String customerID,String order_date,double amount)
    {
        order1=new Order(orderID,customerID,order_date,amount);
        return order1;
    }
    public boolean deleteOrderToDB()
    {
        return ordService.deleteOrder(order1);
    }
    public void refreshTable(DefaultTableModel dftm,String query)
    {
        ordService.RefreshTable(dftm,query);
    }
    
}
