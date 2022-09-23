/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_git;

/**
 *
 * @author ET36
 */
public class Lavaropas extends Producto {
    
    private String marca;
    private String modelo;
    private int cantidad = 0;
    
    public Lavaropas(int c, String d, double p, String mar, String mod, int cant){
        
        super(c, d, p);
        this.marca = mar;
        this.modelo = mod;
        this.cantidad = cant;
        
    }
    
    public String toString(){
        return "Marca: " + this.marca + "\n"
                + "Modelo: " + this.modelo + "\n"
                + "Descripción: " + this.desc + "\n"
                + "Precio: " + calcularTotal() + "\n"
                + "Codigo: " + this.cod;
    }
    
    @Override
    public double calcularTotal(){
        return this.precio*this.cantidad;
    }
}
