/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Inventory ;
import Service.inventoryService;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author 94770
 */
public class inventoryController {
    private Inventory Inventory1;
    private inventoryService invService;
    public inventoryController()
    {
        invService =new inventoryService();
    }
    
    public Inventory addInventory(String Material,double MateQuantity)
    {
        Inventory1 =new Inventory(Material, MateQuantity);
        return Inventory1;
    }
    public boolean addSupplierToDB()
    {
        return invService.addInventory(Inventory1);
    }
    public void refreshTable(DefaultTableModel dftm,String query)
    {
        invService.RefreshTable(dftm,query);
    }
}
