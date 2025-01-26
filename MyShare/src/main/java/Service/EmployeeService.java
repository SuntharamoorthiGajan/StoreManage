/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import Database.DatabaseConnection;
import Model.Employee;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
/**
 *
 * @author 94770
 */
public class EmployeeService {
    DatabaseConnection DBCON;
    public EmployeeService()
    {
        DBCON=DatabaseConnection.getSingleInstance();
    }
    
    public boolean addEmployee(Employee emp)
    {
        try
        {
            String query="insert into Employee(Employee_id,Employee_name,Employee_email,Salary) values('"+emp.getEmpId()+"','"+emp.getEmpName()+"','"+emp.geEemployeeEmail()+"',"+emp.getSalary()+")";
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
        
         
        ResultSet rs=DBCON.readQuery("select * from Employee");

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
