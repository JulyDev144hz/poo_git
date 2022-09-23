/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_git;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author ET36
 */
public class Venta {
    private ArrayList<Producto> ListaProd = new ArrayList<>();
    private int nroFact;
    private static int cantVentas;
    private LocalDate Fecha;
    private Cliente cli;

    public Venta(Cliente cli) {
        this.cli = cli;
        this.Fecha = LocalDate.now();
        this.nroFact = ++cantVentas;
    }
    public Venta(Cliente cli, LocalDate fecha) {
        this.cli = cli;
        this.Fecha = fecha;
        this.nroFact = ++cantVentas;
    }
    
    public void agregarProducto(Producto p){
        this.ListaProd.add(p);
    }
    public void removerProducto(Producto p){
        this.ListaProd.remove(p);
    }
    public double calcularTotal(){
        double total = 0;
        for (Producto p : this.ListaProd){
            total+=p.calcularTotal();
        }
        return total;
    }
    private String mostrarProductos(){
        String txt = "";
        for (Producto p : this.ListaProd){
            txt+="+------------------------------------+"+"\n";
            txt+=p.toString()+"\n";
            txt+="+------------------------------------+"+"\n";
        }
        return txt;
    }
    
    public void emitirFactura(){
        System.out.println(
                "+------------------------------------+"+"\n"+
                "NRO FACTURA :"+this.nroFact+"\n"+
                "CLIENTE :"+this.cli.toString()+"\n"+
                "Productos:                             "+"\n"+
                this.mostrarProductos()+"\n"+
                "Precio Total: "+this.calcularTotal()+"\n"+
                "+------------------------------------+"+"\n"
                );
    }
    
    
            
}
