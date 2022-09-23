/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_git;

/**
 *
 * @author ET36
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cli = new Cliente("Facundo", "Martinez", 47131213);
        Venta v = new Venta(cli);
        Lavaropas lav = new Lavaropas(1, "Lavarropas piola", 5000, "Phillips", "AX500", 2);
        v.agregarProducto(lav);
        Manzana manz = new Manzana(5, 100, 2, "Manzana piola");
        v.agregarProducto(manz);
        v.emitirFactura();
        
        
        
    }
    
}
