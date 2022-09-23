/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_git;

import javax.swing.JOptionPane;

/**
 *
 * @author ET36
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       int otroProd=0;
        
        Cliente cliente = crearCliente();
        Venta v = new Venta(cliente);
        while(otroProd==0){
            Producto p = crearProducto();
            v.agregarProducto(p);
            
            otroProd = JOptionPane.showConfirmDialog(null, "Quiere otro producto");

        }
        
        v.emitirFactura();
        
        
        
    }
    
    public static Cliente crearCliente(){
        Cliente c = null;
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido: ");
        int DNI = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su DNI: "));
        c = new Cliente(nombre, apellido, DNI);
        
        return c;
    }
    
    public static Producto crearProducto(){
        Producto p = null;
        Object[] productos = {"LAVARROPAS", "MANZANA"};
        String producto = (String)JOptionPane.showInputDialog(null,
                "ELIJA UN PRODUCTO",
                "", JOptionPane.QUESTION_MESSAGE, null, productos, productos[0]);
        
        switch(producto.toUpperCase()){
            case "LAVARROPAS"->{
                int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del lavarropas: "));
                String marca = JOptionPane.showInputDialog("Ingrese la marca que quiere: ");
                String modelo = JOptionPane.showInputDialog("Ingrese el modelo que quiere: ");
                int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad "));
                p = new Lavaropas(1, "Lavarropas piola", precio, marca, modelo, cant);
            }
            case "MANZANA"->{
                int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de la manzana: "));
                int kg = Integer.parseInt(JOptionPane.showInputDialog("Cuantos kilos quiere: "));
                p = new Manzana(2, "Manzana re piola", precio, kg);
                
            }
        }
        return p;
    }
}
