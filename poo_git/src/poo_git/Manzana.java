/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_git;

public class Manzana extends Producto{
    private int kg;
    

    public Manzana(int c, String d, double p, int kg) {
        super(c, d, p);
        this.kg = kg;
        
    }

    public String toString() {
        return "Manzana "+this.kg+" kg " + "$"+calcularTotal();
    }
    @Override
    public double calcularTotal(){
        
        return this.precio * this.kg;
    }
    
    
}
