package poo_git;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ET36
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private int DNI = 0;
    
    public Cliente(String n, String a, int dni){
        this.nombre = n;
        this.apellido = a;
        this.DNI = dni;
    }
    
    public String toString(){
        return "Nombre: " + this.nombre + "\n"
                + "Apellido: " + this.apellido + "\n"
                + "DNI: " + this.DNI;
    }
}
