/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Employee ;
import Service.EmployeeService;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
/**
 *
 * @author 94770
 */
public class EmployeeController {
    private Employee Employee1;
    private EmployeeService empService;
    public EmployeeController()
    {
        empService =new EmployeeService();
    }
    
    public Employee addEmployee(String EmployeeId,String EmployeeName,String employeeEmail,double Salary)
    {
        Employee1 =new Employee(EmployeeId,EmployeeName,employeeEmail,Salary);
        return Employee1;
    }
    public boolean addEmployeeToDB()
    {
        return empService.addEmployee(Employee1);
    }
    public void refreshTable(DefaultTableModel dftm,String query)
    {
        empService.RefreshTable(dftm,query);
    }
    
}
