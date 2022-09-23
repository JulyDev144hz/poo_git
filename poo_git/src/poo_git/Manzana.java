/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_git;

public class Manzana extends Producto{
    private int kg;
    private double precio;

    public Manzana(int kg, double pcio, int cod, String desc) {
        super(cod, desc, pcio);
        this.kg = kg;
        this.precio = precio;
    }

    public String toString() {
        return "Manzana "+this.kg+"kg";
    }
    
    public double calcularTotal(){
        
        double p = this.precio * this.kg;
        
        return p;
    }
    
    
}
