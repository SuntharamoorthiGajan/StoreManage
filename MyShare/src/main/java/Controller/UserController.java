/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.User;
import Service.UserService;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

/**
 *
 * @author 94770
 */
public class UserController {
    private User user1;
    private UserService userService;
    public UserController()
    {
        userService=new UserService();
    }
    
    public User addUser(String CustomerId,String customerName,String Customer_Email,String Address)
    {
        user1=new User(CustomerId,customerName,Customer_Email,Address);
        return user1;
    }
    public boolean addUserToDB()
    {
        return userService.addUser(user1);
    }
    public void refreshTable(DefaultTableModel dftm,String query)
    {
        userService.RefreshTable(dftm,query);
    }
}
