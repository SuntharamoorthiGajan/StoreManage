/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author rajah
 */
public class Inventory {
    private String Material;
    private double MateQuantity;
    
    public Inventory(String Material,double MateQuantity)
    {
        this.Material=Material;
        this.MateQuantity=MateQuantity;
    }
    public String getMate()
    {
        return Material;
    }
    public double getMateQuan()
    {
        return MateQuantity;
    }
}
