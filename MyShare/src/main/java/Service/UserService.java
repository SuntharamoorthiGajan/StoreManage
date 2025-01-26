/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import Database.DatabaseConnection;
import Model.User;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 94770
 */
public class UserService {
    DatabaseConnection DBCON;
    public UserService()
    {
        DBCON=DatabaseConnection.getSingleInstance();
    }
    
    public boolean addUser(User user)
    {
        try
        {
            String query="insert into user(user_id,user_name,user_email,user_address) values('"+user.getCusId()+"','"+user.getCusName()+"','"+user.getCusEmail()+"','"+user.getAddress()+"')";
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
        
         
        ResultSet rs=DBCON.readQuery("select * from user");

        try
        {
        int a=0;
        while(rs.next())
        {


                dftm.setValueAt(rs.getString(1),a,0);
                dftm.setValueAt(rs.getString(2),a,1);
                dftm.setValueAt(rs.getString(3),a,2);
                dftm.setValueAt(rs.getString(4),a,3);
                
                a++;
        }
        }
        catch(Exception e)
        {

        }
            }
    
}
