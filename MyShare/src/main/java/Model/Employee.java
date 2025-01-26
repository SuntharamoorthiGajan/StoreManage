/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author rajah
 */
public class Employee {
    private String EmployeeId;
    private String EmployeeName;
    private String employeeEmail;
    private double Salary;
    
    public Employee(String EmployeeId,String EmployeeName,String employeeEmail,double Salary)
    {
        this.EmployeeId=EmployeeId;
        this.EmployeeName=EmployeeName;
        this.employeeEmail=employeeEmail;
        this.Salary=Salary;
    }
    public String getEmpId()
    {
        return EmployeeId;
    }
    public String getEmpName()
    {
        return EmployeeName;
    }
    public String geEemployeeEmail()
    {
        return employeeEmail;
    }
    public double getSalary()
    {
        return Salary;
    }
}

