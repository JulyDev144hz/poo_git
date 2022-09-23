//---------------------------- Tomas Fernandez ----------------------------//


package poo_git;

// Clase abstracta ya que hay diferentes productos

public abstract class Producto {
    protected int cod;
    protected String desc;
    protected double  precio;

// El constructor crea el producto con un codigo, una descripcion y un precio por defecto
    
    public Producto(int cod, String desc, double precio) {
        this.cod = cod;
        this.desc = desc;
        this.precio = precio;
    }

// Creamos el String inicial para un producto
    
    @Override
    public String toString() {
        return "CODIGO PRODUCTO: "+this.cod+
               "\nDESCRIPCION: "+this.desc;
    }
    
// Metodo abstracto ya que cada producto se va a calcular por separado con sus parametros    
    
    public abstract double calcularTotal();
    
    
    
}
